package com.vishalbharti.stackoverflow.dal;

import com.vishalbharti.stackoverflow.domain.AccountStatus;
import com.vishalbharti.stackoverflow.domain.account.Member;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DatabaseRepository {
    private static final String ACCOUNT_CSV = "account.csv";

    public static void createAccounts() {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(ACCOUNT_CSV));
             CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .withHeader("id", "password", "status", "name", "address", "email", "phone"))) {

            printer.printRecord("1",
                    "12345",
                    AccountStatus.ACTIVE.getName(),
                    "Vishal Bharti",
                    "Bangalore",
                    "b@gmail.com",
                    "9164672900");

            printer.printRecord("2",
                    "12345",
                    AccountStatus.ACTIVE.getName(),
                    "Mobasherul Haque",
                    "Bangalore",
                    "mh@gmail.com",
                    "8939776758");
            printer.printRecord("3",
                    "12345",
                    AccountStatus.ACTIVE.getName(),
                    "Vishal Haque",
                    "Bangalore",
                    "bh@gmail.com",
                    "9144672900");
            printer.printRecord("4",
                    "12345",
                    AccountStatus.BLOCKED.getName(),
                    "Mobasherul Bharti",
                    "Bangalore",
                    "mb@gmail.com",
                    "9164672900");

            printer.flush();
        } catch (IOException e) {

        }
    }

    public static boolean isValid(String email, String password, Member member) {
        return true;
    }
}
