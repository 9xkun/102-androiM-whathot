package com.n9xkun.iziroi.tutor01_databindingdemo.model;

/**
 * Domain User (Bean)
 * @author hoangpt
 */
public class UserBean {
  private String firstName;
  private String lastName;
  private int age;

  public UserBean(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public UserBean(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public boolean isAdult(){
    return age>18;
  }

  public String getFullName(){
    return firstName+" "+lastName;
  }
}
