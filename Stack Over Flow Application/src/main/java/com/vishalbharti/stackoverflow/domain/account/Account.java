package com.vishalbharti.stackoverflow.domain.account;

import com.vishalbharti.stackoverflow.domain.AccountStatus;
import com.vishalbharti.stackoverflow.domain.Address;

import java.util.Objects;

public class Account {
    private String id;
    private String password;
    private AccountStatus accountStatus;
    private String name;
    private Address address;
    private String email;
    private String phone;

    public Account(String id, String password, AccountStatus accountStatus, String name, Address address, String email, String phone) {
        this.id = id;
        this.password = password;
        this.accountStatus = accountStatus;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(password, account.password) &&
                accountStatus == account.accountStatus &&
                Objects.equals(name, account.name) &&
                Objects.equals(address, account.address) &&
                Objects.equals(email, account.email) &&
                Objects.equals(phone, account.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, accountStatus, name, address, email, phone);
    }
}
