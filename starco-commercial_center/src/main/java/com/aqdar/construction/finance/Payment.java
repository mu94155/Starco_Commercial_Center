package com.aqdar.construction.finance;

public class Payment {
  private double amount;
  private String details;
  private String date;

  public Payment() {
  }

  public Payment(double amount, String details, String date) {
    this.amount = amount;
    this.details = details;
    this.date = date;
  }

  public double getAmount() {
    return amount;
  }

  public String getDetails() {
    return details;
  }

  public String getDate() {
    return date;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public String toString() {
    return "{" +
      " amount='" + getAmount() + "'" +
      ", details='" + getDetails() + "'" +
      ", date='" + getDate() + "'" +
      "}";
  }


}
