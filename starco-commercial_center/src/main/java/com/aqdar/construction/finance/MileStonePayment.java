package com.aqdar.construction.finance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class MileStonePayment extends Payment {
  private Milestone milestone;
  private static final Logger logger = Logger.getLogger(MileStonePayment.class.getName());
  List<MileStonePayment> mileStonePayments= new ArrayList<>();

  public MileStonePayment() {
  }

  public MileStonePayment(double amount, String details, String date, Milestone milestone) {
    super(amount, details, date);
    this.milestone = milestone;
  }

  public Milestone getMilestone() {
    return milestone;
  }

  public void setMilestone(Milestone milestone) {
    this.milestone = milestone;
  }

  @Override
  public String toString() {
    return "{" +
        " amount='" + getAmount() + "'" +
        ", details='" + getDetails() + "'" +
        ", date='" + getDate() + "'" +
        ", milestone='" + getMilestone() + "'" +
        "}";
  }

  public void makePartialPayment(double amount, String details, Date date, Milestone milestone) {
    if (logger.isLoggable(Level.INFO)) {
        logger.info(String.format("partial payment amount of : %.2f is paid for: %s on %s of %s is paid.", amount, details, date, milestone.getMilestoneName()));}
    }

  public void makeFullPayment(double amount, String details, Date date, Milestone milestone) {
      if (logger.isLoggable(Level.INFO)) {
          logger.info(String.format("full amount of : %.2f is paid for: %s on %s of %s is paid", amount, details, date, milestone.getMilestoneName()));
      }
  }

  public void addMileStonePayment(MileStonePayment mileStonePayment) {
    mileStonePayments.add(mileStonePayment);
  }

  public void removeMileStonePayment(MileStonePayment mileStonePayment) {
    mileStonePayments.remove(mileStonePayment);
  }

  public List<MileStonePayment> getMileStonePayments() {
    return mileStonePayments;
  }

}
