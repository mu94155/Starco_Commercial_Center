package com.aqdar.operation.finance;

import java.util.ArrayList;
import java.util.List;

public class ExpensesManager {
  enum FilterType{ALL_EXPENSES(List<Expense> expenses = new ArrayList<>()),
MONTHLY_EXPENSES(List<Expense> filteredExpensesByMonth = new ArrayList<>()),
YEARLY_EXPENSES(List<Expense> filteredExpensesByYear = new ArrayList<>()),
TYPE_EXPENSES(List<Expense> filteredExpensesByType = new ArrayList<>());}
  
List<Expense> expenses = new ArrayList<>();
FilterType filteredType;
Expense expense;

ExpensesManager(Expense expense, FilterType filteredType){
  this.expense = expense;
  this.filteredType = filteredType;
}

public void addExpense(){
  Expense expense = new Expense();
  expenses.add(expense);
}

public void removeExpense(Expense expense){
  expenses.remove(expense);
}

public List<Expense> getFilteredExpenses(Expense expense,String type){ {

  switch (expense.getExpense().getName().equalsIgnoreCase(type)){

  }
  return expenses;
}

public List<Expense> filterExpensesByMonth(List<Expense> expenses, String month) {
  for (Expense expense : expenses) {
    if (expense.getMonth() instanceof Month && expense.getMonth().name().equalsIgnoreCase(month)) {
      filteredExpensesByMonth.add(expense);
    }
  }
  return filteredExpensesByMonth;

}

public List<Expense> filterExpensesByYear(List<Expense> expenses, String year) {
  for (Expense expense : expenses) {
    if (expense.getYear() instanceof Year && expense.getYear().name().equalsIgnoreCase(year)) {
      filteredExpensesByMonth.add(expense);
    }
  }
  return filteredExpensesByMonth;

}

public List<Expense> getFilteredExpensebyType(List<Expense> expenses, Opex opex) {
  for (Expense expense : expenses) {
    if (expense.getOpex().name().equalsIgnoreCase(opex.name())) {
      filteredExpensesByType.add(expense);
    }
  }
  return filteredExpensesByType;
}
}