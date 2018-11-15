package com.example.darabsingh.gsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("age")
    private int age;
    @SerializedName("mail")
    private String mail;
    @SerializedName("address")
    private Address address;
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String mail, Address address,List<FamilyMember> mFamily) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.address = address;
        this.mFamily=mFamily;
    }
}
