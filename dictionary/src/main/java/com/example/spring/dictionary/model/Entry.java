package com.example.spring.dictionary.model;


public class Entry {

  private String entryid;
  private String entryname;
  private String category;
  private String paraphrase;
  private String fathernodeid;
  private java.sql.Timestamp registertime;
  private java.sql.Timestamp updatetime;


  public String getEntryid() {
    return entryid;
  }

  public void setEntryid(String entryid) {
    this.entryid = entryid;
  }


  public String getEntryname() {
    return entryname;
  }

  public void setEntryname(String entryname) {
    this.entryname = entryname;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getParaphrase() {
    return paraphrase;
  }

  public void setParaphrase(String paraphrase) {
    this.paraphrase = paraphrase;
  }


  public String getFathernodeid() {
    return fathernodeid;
  }

  public void setFathernodeid(String fathernodeid) {
    this.fathernodeid = fathernodeid;
  }


  public java.sql.Timestamp getRegistertime() {
    return registertime;
  }

  public void setRegistertime(java.sql.Timestamp registertime) {
    this.registertime = registertime;
  }


  public java.sql.Timestamp getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }

  @Override
  public String toString() {
    return "Entry{" +
            "entryid='" + entryid + '\'' +
            ", entryname='" + entryname + '\'' +
            ", category='" + category + '\'' +
            ", paraphrase='" + paraphrase + '\'' +
            ", fathernodeid='" + fathernodeid + '\'' +
            ", registertime=" + registertime +
            ", updatetime=" + updatetime +
            '}';
  }
}
