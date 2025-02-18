package com.aqdar.operation.finance;

public enum Shop {
  SHOP_1("electricityAccount01", "waterAccount01", "rent01", "shopNumber01"),
  SHOP_2("electricityAccount02", "waterAccount02", "rent02", "shopNumber02"),
  SHOP_3("electricityAccount03", "waterAccount03", "rent03", "shopNumber03"),
  SHOP_4("electricityAccount04", "waterAccount04", "rent04", "shopNumber04"),
  SHOP_5("electricityAccount05", "waterAccount05", "rent05", "shopNumber05"),
  SHOP_6("electricityAccount06", "waterAccount06", "rent06", "shopNumber06"),
  SHOP_7("electricityAccount07", "waterAccount07", "rent07", "shopNumber07"),
  SHOP_8("electricityAccount08", "waterAccount08", "rent08", "shopNumber08"),
  SHOP_9("electricityAccount09", "waterAccount09", "rent09", "shopNumber09"),
  SHOP_10("electricityAccount10", "waterAccount10", "rent10", "shopNumber10"),
  SHOP_11("electricityAccount11", "waterAccount11", "rent11", "shopNumber11"),
  SHOP_12("electricityAccount12", "waterAccount12", "rent12", "shopNumber12"),
  SHOP_13("electricityAccount13", "waterAccount13", "rent13", "shopNumber13"),
  SHOP_14("electricityAccount14", "waterAccount14", "rent14", "shopNumber14"),
  SHOP_15("electricityAccount15", "waterAccount15", "rent15", "shopNumber15"),
  SHOP_16("electricityAccount16", "waterAccount16", "rent16", "shopNumber16"),
  SHOP_17("electricityAccount17", "waterAccount17", "rent17", "shopNumber17"),
  SHOP_18("electricityAccount18", "waterAccount18", "rent18", "shopNumber18"),
  SHOP_19("electricityAccount19", "waterAccount19", "rent19", "shopNumber19"),
  SHOP_20("electricityAccount20", "waterAccount20", "rent20", "shopNumber20"),
  SHOP_21("electricityAccount21", "waterAccount21", "rent21", "shopNumber21"),
  SHOP_22("electricityAccount22", "waterAccount22", "rent22", "shopNumber22"),
  SHOP_23("electricityAccount23", "waterAccount23", "rent23", "shopNumber23"),
  SHOP_24("electricityAccount24", "waterAccount24", "rent24", "shopNumber24"),
  SHOP_25("electricityAccount25", "waterAccount25", "rent25", "shopNumber25"),
  SHOP_26("electricityAccount26", "waterAccount26", "rent26", "shopNumber26"),
  SHOP_27("electricityAccount27", "waterAccount27", "rent27", "shopNumber27"),
  SHOP_28("electricityAccount28", "waterAccount28", "rent28", "shopNumber28"),
  SHOP_29("electricityAccount29", "waterAccount29", "rent29", "shopNumber29"),
  SHOP_30("electricityAccount30", "waterAccount30", "rent30", "shopNumber30"),
  SHOP_31("electricityAccount31", "waterAccount31", "rent31", "shopNumber31"),
  SHOP_32("electricityAccount32", "waterAccount32", "rent32", "shopNumber32"),
  SHOP_33("electricityAccount33", "waterAccount33", "rent33", "shopNumber33"),
  SHOP_34("electricityAccount34", "waterAccount34", "rent34", "shopNumber34"),
  SHOP_35("electricityAccount35", "waterAccount35", "rent35", "shopNumber35"),
  SHOP_36("electricityAccount36", "waterAccount36", "rent36", "shopNumber36");

  private String electricityAccount;
  private String waterAccount;
  private String rent;
  private String shopNumber;

  Shop(String electricityAccount, String waterAccount, String rent, String shopNumber) {
    this.electricityAccount = electricityAccount;
    this.waterAccount = waterAccount;
    this.rent = rent;
    this.shopNumber = shopNumber;
  }

  public void setDetails(String electricityAccount, String waterAccount, String rent, String shopNumber) {
    this.electricityAccount = electricityAccount;
    this.waterAccount = waterAccount;
    this.rent = rent;
    this.shopNumber = shopNumber;
  }

  public String getElectricityAccount() { return electricityAccount; }

  public String getWaterAccount() { return waterAccount; }

  public String getRent() { return rent; }

  public String getShopNumber() { return shopNumber; }

@Override
  public String toString() {
    return "Shop: " + shopNumber + "\n" + "Electricity Account: " + electricityAccount + "\n" + "Water Account: " + waterAccount + "\n" + "Rent: " + rent;
  }

  


}



