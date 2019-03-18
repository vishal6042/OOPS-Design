package com.vishalbharti.stackoverflow;

import com.vishalbharti.stackoverflow.dal.DatabaseRepository;
import com.vishalbharti.stackoverflow.service.StackOverFlowManager;
import com.vishalbharti.stackoverflow.service.StackOverFlowManagerImpl;

public class Main {

    public static void main(String[] args) {
        createAccounts();
        StackOverFlowManager manager = new StackOverFlowManagerImpl();
        

    }

    private static void createAccounts() {
        DatabaseRepository.createAccounts();
    }
}
