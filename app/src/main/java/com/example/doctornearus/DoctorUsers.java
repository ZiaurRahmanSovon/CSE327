package com.example.doctornearus;

public class DoctorUsers {
    String FullName, EmailAddress, PhoneNumber, PresentAddress,Speciality,BMDC,Password;

    public DoctorUsers(){   }

    public DoctorUsers(String fullName, String emailAddress, String phoneNumber, String presentAddress, String speciality, String bmdc, String password) {
        FullName = fullName;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
        PresentAddress = presentAddress;
        Speciality = speciality;
        BMDC = bmdc;
        Password = password;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPresentAddress() {
        return PresentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        PresentAddress = presentAddress;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getBMDC() {
        return BMDC;
    }

    public void setBMDC(String bmdc) {
        BMDC = bmdc;
    }
}
