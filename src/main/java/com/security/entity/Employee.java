package com.security.entity;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentGmail;
    private String studentAddress;
    private String studentCity;
    private String studentPassword;
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(Long studentId, String studentName, String studentGmail, String studentAddress, String studentCity, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGmail = studentGmail;
        this.studentAddress = studentAddress;
        this.studentCity = studentCity;
        this.studentPassword = studentPassword;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGmail() {
        return studentGmail;
    }

    public void setStudentGmail(String studentGmail) {
        this.studentGmail = studentGmail;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentGmail='" + studentGmail + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentPassword='" + studentPassword + '\'' +
                '}';
    }
}
