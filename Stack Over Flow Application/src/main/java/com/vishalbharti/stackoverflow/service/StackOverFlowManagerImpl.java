package com.vishalbharti.stackoverflow.service;

import com.vishalbharti.stackoverflow.dal.DatabaseRepository;
import com.vishalbharti.stackoverflow.domain.account.Member;

import java.util.List;

public class StackOverFlowManagerImpl implements StackOverFlowManager {
    private List<Member> loggedInUserList;

    public boolean login(String email, String password) {
        Member member = null;
        if(DatabaseRepository.isValid(email, password, member)) {

        }
        return false;
    }

    public boolean logout() {
        return false;
    }

}
