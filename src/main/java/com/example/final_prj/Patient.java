package com.example.final_prj;

import java.util.Date;

public class Patient {
    private Date DateOfBirth;
    private String BloodType;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String InsuranceCompany;
    private long InsuranceNumber;

    public Patient(String firstName, String middleName, String lastName, String phoneNumber,
            Date DateOfBirth, String BloodType, String email, String InsuranceCoumpany, long InsuranceNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.DateOfBirth = DateOfBirth;
        this.BloodType = BloodType;
        this.email = email;
        this.InsuranceCompany = InsuranceCoumpany;
        this.InsuranceNumber = InsuranceNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String bloodType) {
        this.BloodType = bloodType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInsuranceCompany() {
        return InsuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.InsuranceCompany = insuranceCompany;
    }

    public long getInsuranceNumber() {
        return InsuranceNumber;
    }

    public void setInsuranceNumber(long insuranceNumber) {
        this.InsuranceNumber = insuranceNumber;
    }
}
