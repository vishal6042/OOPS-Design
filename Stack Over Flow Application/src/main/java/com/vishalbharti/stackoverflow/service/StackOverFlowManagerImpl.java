package com.vishalbharti.stackoverflow.service;

import com.vishalbharti.stackoverflow.domain.account.Member;

import java.util.List;

public class StackOverFlowManagerImpl implements StackOverFlowManager {
    private List<Member> loggedInUserList;

    public boolean login(String email, String password) {
        return false;
    }

    public boolean logout() {
        return false;
    }

}
