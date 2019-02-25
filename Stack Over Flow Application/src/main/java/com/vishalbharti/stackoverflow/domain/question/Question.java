package com.vishalbharti.stackoverflow.domain.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question implements QuestionManager {

    private String title;
    private String body;
    private List<Tag> tags;
    private long createTime;
    private long upvoteCount;
    private List<Answer> answers;
    private List<Comment> comments;
    private List<Photo> photos;
    private QuestionStatus questionStatus;
    private List<QuestionListener> mListenerList;

    private enum NOTIFY_TYPE {
        ANSWER,
        COMMENT,
        UP_VOTE,
        DOWN_VOTE,
        STATUS
    }

    public void addQuestionListener(QuestionListener listener) {
        mListenerList.add(listener);
    }

    public QuestionStatus getQuestionStatus() {
        return questionStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public long getCreateTime() {
        return createTime;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void close() {
        questionStatus = QuestionStatus.CLOSED;
        notifyAllUsers(NOTIFY_TYPE.STATUS);
    }

    public void delete() {
        notifyAllUsers(NOTIFY_TYPE.STATUS);
        questionStatus = QuestionStatus.DELETED;
        this.title = null;
        this.body = null;
        this.tags = null;
        this.createTime = 0;
        this.answers = null;
        this.comments = null;
        this.photos = null;
        this.mListenerList = null;
    }


    private Question(QuestionBuilder builder) {
        this.mListenerList = new ArrayList<QuestionListener>();
        this.questionStatus = QuestionStatus.OPEN;
        this.title = builder.title;
        this.body = builder.body;
        this.tags = new ArrayList<Tag>(Arrays.asList(builder.tag));
        this.createTime = System.currentTimeMillis();
        this.answers = new ArrayList<Answer>();
        this.comments = new ArrayList<Comment>();
        this.photos = new ArrayList<Photo>(Arrays.asList(builder.photo));
    }

    public void addComment(Comment comment) {
        if (comment != null) {
            this.comments.add(comment);
            notifyAllUsers(NOTIFY_TYPE.COMMENT);
        }
    }

    public void addAnswer(Answer answer) {
        if (answer != null) {
            this.answers.add(answer);
            notifyAllUsers(NOTIFY_TYPE.ANSWER);
        }
    }

    public void upvote() {
        upvoteCount++;
        notifyAllUsers(NOTIFY_TYPE.UP_VOTE);
    }

    public void downvote() {
        upvoteCount--;
        notifyAllUsers(NOTIFY_TYPE.DOWN_VOTE);
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public int getCommentsCount() {
        return this.comments.size();
    }

    private void notifyAllUsers(NOTIFY_TYPE type) {
        for (QuestionListener listener : mListenerList) {
            switch (type) {
                case ANSWER:
                    listener.notifyForAnswer(answers.get(answers.size() - 1));
                    break;
                case STATUS:
                    listener.notifyForStatus("", questionStatus);
                    break;
                case UP_VOTE:
                    listener.notifyForVote("UpVoted", (int) upvoteCount, true);
                    break;
                case DOWN_VOTE:
                    listener.notifyForVote("DownVoted", (int) upvoteCount, false);
                    break;
                case COMMENT:
                    listener.notifyForComment(comments.get(comments.size() - 1));
                    break;
            }
        }
    }

    public static class QuestionBuilder {
        private String title;
        private String body;
        private Tag[] tag;
        private Photo[] photo;

        QuestionBuilder(String body) {
            this.body = body;
        }

        public QuestionBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public QuestionBuilder setTag(Tag... tag) {
            this.tag = tag;
            return this;
        }

        public QuestionBuilder setPhoto(Photo... photo) {
            this.photo = photo;
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }

}
