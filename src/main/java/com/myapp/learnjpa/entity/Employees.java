package com.myapp.learnjpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employees implements Serializable {

    @Id
    @Column(name = "employeeNumber")
    private long employeeNumber;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "extension")
    private String extension;
    @Column(name = "email")
    private String email;
    @Column(name = "officeCode")
    private String officeCode;
    /*@Column(name = "reportsTo")
    private long reportsTo;*/
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "reportsTo", insertable = false, updatable = false)
    private Employees reportsToObj;
    @OneToMany(mappedBy = "reportsToObj")
    private Set<Employees> subordinates = new HashSet<Employees>();
    //
    @Column(name = "jobTitle")
    private String jobTitle;
    @OneToOne
    @JoinColumn(name = "officeCode", insertable = false, updatable = false)
    private Offices officeCodeObj;

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }


//    public long getReportsTo() {
//        return reportsTo;
//    }
//
//    public void setReportsTo(long reportsTo) {
//        this.reportsTo = reportsTo;
//    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public Offices getOfficeCodeObj() {
        return officeCodeObj;
    }

    public void setOfficeCodeObj(Offices officeCodeObj) {
        this.officeCodeObj = officeCodeObj;
    }

    public Employees getReportsToObj() {
        return reportsToObj;
    }

    public void setReportsToObj(Employees reportsToObj) {
        this.reportsToObj = reportsToObj;
    }
}
