package com.aqdar.operation.finance;

import java.util.ArrayList;
import java.util.List;

public class Expense {
  private Opex opex;
  
  private Opex electricity;
  private Opex water;
  private Opex internet;
  private Opex salary;
  private Month month;
  private Year year;
  private double amount;
  private String description;
  private int quantity;

  List<Expense> filteredExpensesByMonth = new ArrayList<>();
  List <Expense> filteredExpensesByType = new ArrayList<>();

  public Expense() {
    this.electricity = Opex.DEFAULT;
    this.water = Opex.DEFAULT;
    this.internet = Opex.DEFAULT;
    this.salary = Opex.DEFAULT;
    this.month = Month.JANUARY;
    this.year = Year.DEFAULT;
    this.amount = 0.0;
    this.description = "";
    this.quantity = 0;
  }

  public List<Expense> filterExpensesByMonth(List<Expense> expenses, String month) {
    for (Expense expense : expenses) {
      if (expense.getMonth() instanceof Month && expense.getMonth().name().equalsIgnoreCase(month)) {
        filteredExpensesByMonth.add(expense);
      }
    }
    return filteredExpensesByMonth;
  }

  public void setMonth(Month month) {
    this.month = month;
  }

  public Month getMonth() {
    return month;
  }

  public void setYear(Year year) {
    this.year = year;
  }

  public Year getYear() {
    return year;
  } 

  public void setElectricity(Opex electricity) {
    this.electricity = electricity;
  }

  public Opex getElectricity() {
    return electricity;
  }

  public void setWater(Opex water) {
    this.water = water;
  }

  public Opex getWater() {
    return water;
  }

  public void setInternet(Opex internet) {
    this.internet = internet;
  }

  public Opex getInternet() {
    return internet;
  }

  public void setSalary(Opex salary) {
    this.salary = salary;
  }

  public Opex getSalary() {
    return salary;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setOpex(Opex opex){
    this.opex=opex;
  }

  public Opex getOpex() {
    return opex;
  }


}
