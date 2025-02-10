package com.aqdar.construction.finance;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdditionalScopePayment {
  private static final Logger logger = Logger.getLogger(AdditionalScopePayment.class.getName());
  private double amount;
  private String details;
  private String date;
  
  public AdditionalScopePayment() {
  }

  public AdditionalScopePayment(double amount, String details,String date) {
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

  public void makeFullPayment(double amount, String details, Date date) {
    if (logger.isLoggable(Level.INFO)) {
        logger.info(String.format("Amount of : %.2f is paid for: %s on %s", amount, details, date));
    }
  }

}
