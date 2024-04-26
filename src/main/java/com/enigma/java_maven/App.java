package com.enigma.java_maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Gson gson = new Gson();
        Person person = new Person(29, "Zarek");

        String json = gson.toJson(person);
        System.out.println(json);
    }
}
