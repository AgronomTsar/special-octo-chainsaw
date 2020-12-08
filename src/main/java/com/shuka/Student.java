package com.shuka;

public class Student {
    String fname;
    String lname;
    String sex;
    String birthday;
    double gpa;

    public Student(String fname, String lname, String sex, String birthday, double gpa) {
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", gpa=" + gpa +
                '}';
    }
}
