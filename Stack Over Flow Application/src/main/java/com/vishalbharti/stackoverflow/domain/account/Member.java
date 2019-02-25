package com.vishalbharti.stackoverflow.domain.account;

import com.vishalbharti.stackoverflow.domain.Badge;
import com.vishalbharti.stackoverflow.domain.question.Question;

import java.util.List;

public class Member {

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

    public void createQuestion(Question question) {

    }

    public void editQuestion(Question question) {

    }
}
