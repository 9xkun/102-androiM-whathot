package com.n9xkun.iziroi.tutor01_databindingdemo.model;

/**
 * Created by hoangpt on 10/9/15.
 */
public class UserBean {
  private String firstName;
  private String lastName;

  public UserBean(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
