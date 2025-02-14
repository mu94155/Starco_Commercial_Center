package com.aqdar.operation.finance;


public enum Opex {
  
  UTILITY1("Electricity", 1000, " e.g. Shop 1 Electricity bill", 1, ""),
  UTILITY2("Water", 500, "e.g. Shop 1 Water bill", 1, ""),
  UTILITY3("Internet", 500, " e.g. Shop 1 Internet bill", 1, ""),
  STAFF("Watch man", 5000, "Staff salary", 1, ""),
  RENT("Office Rent", 2000, "Office rent", 1, ""),
  MARKETING("Marketing", 3000, "Marketing expenses", 1, ""),
  MAINTENANCE("Maintenance", 500, "Maintenance expenses", 1, ""),
  INSURANCE("Insurance", 1000, "Insurance expenses", 1, ""),
  TRANSPORT("Transport", 500, "Transport expenses", 1, ""),
  MISCELLANEOUS("Miscellaneous", 1000, "Miscellaneous expenses", 1, "");
  private final String name;
  private final double amount;
  private final String description;
  private final int quantity;
  private final String date;


  Opex(String name, double amount, String description, int quantity,String date) {
    this.name = name;
    this.amount = amount;
    this.description = description;
    this.quantity = quantity;
    this.date = date;
  }

public String getName() {
    return name;
  }

  public double getAmount() {
    return amount;
  }

  public String getDescription() {
    return description;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getDate() {
    return date;
  }

}
