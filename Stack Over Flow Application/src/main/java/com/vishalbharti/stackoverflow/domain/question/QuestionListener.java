package com.vishalbharti.stackoverflow.domain.question;

public interface QuestionListener {

    void notifyForAnswer(Answer answer);

    void notifyForComment(Comment... comment);

    void notifyForVote(String message, int voteCount, boolean isUpVoted);

    void notifyForStatus(String message, QuestionStatus status);

}
