package com.vishalbharti.stackoverflow.domain.account;

import com.vishalbharti.stackoverflow.domain.question.Question;

public class Moderator extends Member {

    public boolean closeQuestion(Question question) {
        return true;
    }

    public boolean undeleteQuestion(Question question) {
        return true;
    }

}
