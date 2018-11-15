package com.example.darabsingh.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson=new Gson();
        Address address=new Address("Jaipur","India");
        List<FamilyMember> family=new ArrayList<>();
        family.add(new FamilyMember("Father",50));
        family.add(new FamilyMember("Mother",45));
        family.add(new FamilyMember("Brother",27));
        family.add(new FamilyMember("Sister",24));
/*
        Employee employee=new Employee("Darab",22,"darab.singh93@gmail.com", address,family);
        String json=gson.toJson(employee);
  */
        String json="{\"address\":{\"city\":\"Jaipur\",\"country\":\"India\"},\"mail\":\"darab.singh93@gmail.com\",\"firstName\":\"Darab\",\"age\":22}";

        Employee employee=gson.fromJson(json,Employee.class);

    }
}
