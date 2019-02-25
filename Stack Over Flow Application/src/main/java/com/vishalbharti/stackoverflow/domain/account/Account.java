package com.vishalbharti.stackoverflow.domain.account;

import com.vishalbharti.stackoverflow.domain.AccountStatus;
import com.vishalbharti.stackoverflow.domain.Address;

public class Account {
    private String id;
    private String password;
    private AccountStatus accountStatus;
    private String name;
    private Address address;
    private String email;
    private String phone;

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", accountStatus=" + accountStatus +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
