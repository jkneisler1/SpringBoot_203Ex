package com.example.demo;

import java.util.Date;

public class Employee {
    private String first_name;
    private String last_name;
    private int ssn;
    private String dob;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getSsn() {
        return ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
