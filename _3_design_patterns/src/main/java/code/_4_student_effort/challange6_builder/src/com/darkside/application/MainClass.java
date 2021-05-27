package com.darkside.application;

import com.darkside.person.Person;

public class MainClass {

	public static void main(String[] args) {

        Person person01 = new Person.Builder("Smarandache")
                .job("student")
                .university("UCV")
                .isMarried(false)
                .build();

        Person person02 = new Person.Builder("Alexandru")
                .drivingLicense("C")
                .isMarried(true)
                .build();
        
        System.out.println(person01);
        System.out.println(person02);
    }
	
}
