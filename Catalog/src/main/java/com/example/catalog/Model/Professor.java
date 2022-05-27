package com.example.catalog.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Professor {

    private static int id;
    private static String firstName;
    private static String lastName;
    private static int phone_number;
    private static String email;

    public static int getId() { return id; }

    public static String getFirstName() { return firstName; }

    public static String getLastName() { return lastName; }


    public static int getPhone_number() { return phone_number; }

    public static String getEmail() { return email; }

    public void setId(int id) { this.id = id; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setPhone_number(int phone_number) { this.phone_number = phone_number; }

    public void setEmail(String email) { this.email = email; }


}
