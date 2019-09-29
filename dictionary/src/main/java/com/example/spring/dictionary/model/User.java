package com.example.spring.dictionary.model;


public class User {

  private String userid;
  private String username;
  private String password;
  private String age;
  private String privilege;
  private java.sql.Date registertime;


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }


  public String getPrivilege() {
    return privilege;
  }

  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }


  public java.sql.Date getRegistertime() {
    return registertime;
  }

  public void setRegistertime(java.sql.Date registertime) {
    this.registertime = registertime;
  }

  @Override
  public String toString() {
    return "User{" +
            "userid='" + userid + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", age='" + age + '\'' +
            ", privilege='" + privilege + '\'' +
            ", registertime=" + registertime +
            '}';
  }
}
