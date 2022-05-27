package com.example.catalog.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Student {

    private static int id;
    private static String firstName;
    private static String lastName;
    private static String year2;
    private static String profile2;

    public int getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getYear2() { return year2; }

    public String getProfile2() { return profile2; }
    public void setId(int id) { this.id = id; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setYear2(String year2) { this.year2 = year2; }

    public void setProfile2(String profile2) { this.profile2 = profile2; }
}
