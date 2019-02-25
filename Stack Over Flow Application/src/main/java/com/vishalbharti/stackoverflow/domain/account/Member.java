package com.vishalbharti.stackoverflow.domain.account;

import com.vishalbharti.stackoverflow.domain.Badge;
import com.vishalbharti.stackoverflow.domain.question.*;

import java.util.List;

public class Member implements QuestionListener {

    private Account account;
    private int reputation;
    private List<Badge> badgeList;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public List<Badge> getBadgeList() {
        return badgeList;
    }

    public void setBadgeList(List<Badge> badgeList) {
        this.badgeList = badgeList;
    }

    public int createQuestion(Question question) {
        return 0;
    }

    public void editQuestion(int questionId) {

    }

    public void notifyForAnswer(Answer answer) {

    }

    public void notifyForComment(Comment... comment) {

    }

    public void notifyForVote(String message, int voteCount, boolean isUpVoted) {

    }

    public void notifyForStatus(String message, QuestionStatus status) {

    }
}
