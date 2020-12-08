package com.shuka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Student s=new Student("Vasya","Pupkin","m","19.10.1899",3.9);
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(s));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String json="{\"fname\":\"Vasya\",\"lname\":\"Pupkin\",\"sex\":\"m\",\"birthday\":\"19.10.1899\",\"gpa\":3.9}";
        ObjectMapper m=new ObjectMapper();
        try {
            Student s2=m.readValue(json,Student.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
