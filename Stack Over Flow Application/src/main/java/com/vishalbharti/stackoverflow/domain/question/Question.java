package com.vishalbharti.stackoverflow.domain.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question implements QuestionManager {

    private String title;
    private String body;
    private List<Tag> tags;
    private long createTime;
    private List<Answer> answers;
    private List<Comment> comments;
    private List<Photo> photos;

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


    private Question(QuestionBuilder builder) {
        this.title = builder.title;
        this.body = builder.body;
        this.tags = new ArrayList<Tag>(Arrays.asList(builder.tag));
        createTime = System.currentTimeMillis();
        this.answers = new ArrayList<Answer>();
        this.comments = new ArrayList<Comment>();
        this.photos = new ArrayList<Photo>(Arrays.asList(builder.photo));
    }

    public void addComment(Comment comment) {
        if (comment != null) {
            this.comments.add(comment);
        }
    }

    public void addAnswer(Answer answer) {
        if (answer != null) {
            this.answers.add(answer);
        }
    }

    public void addComments(Comment... comments) {
        if (comments.length > 0) {
            this.comments.addAll(Arrays.asList(comments));
        }
    }

    public int getAnswerCount() {
        return this.answers.size();
    }

    public int getCommentsCount() {
        return this.comments.size();
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
