package com.aqdar.operation.finance;

import java.util.ArrayList;
import java.util.List;

public class Expense {
  private final Opex electricity;
  private final Opex water;
  private final Opex internet;
  private final Opex salary;
  private final Month month;
  private final Year year;
  private final double amount;
  private final String description;
  private final int quantity;

  public Expense(Opex electricity, Opex water, Opex internet, Opex salary, String month, String year, double amount,
      String description, int quantity) {
    this.electricity = electricity;
    this.water = water;
    this.internet = internet;
    this.salary = salary;
    this.month = Month.valueOf(month.toUpperCase());
    this.year = Year.of(Integer.parseInt(year));
    this.amount = amount;
    this.description = description;
    this.quantity = quantity;
  }

  public List<Expense> filterExpensesByMonth(List<Expense> expenses, String month) {
    List<Expense> filteredExpenses = new ArrayList<>();
    for (Expense expense : expenses) {
      if (expense.getMonth().equals(month)) {
        filteredExpenses.add(expense);
      }
    }
    return filteredExpenses;
  }

  public String getMonth() {
    return month;
  }

}
