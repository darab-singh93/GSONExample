package com.example.darabsingh.gsonexample;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
    @SerializedName("role")
    private String role;
    @SerializedName("age")
    private int mAge;

    public FamilyMember(String role, int mAge) {
        this.role = role;
        this.mAge = mAge;
    }
}
