package com.example.catalog.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    @lombok.Getter
    private String year;
    @lombok.Getter
    private String profile;

    public int getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public void setId(int id) { this.id = id; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setYear(String year) { this.year = year; }

    public void setProfile(String profile) { this.profile = profile; }
}
