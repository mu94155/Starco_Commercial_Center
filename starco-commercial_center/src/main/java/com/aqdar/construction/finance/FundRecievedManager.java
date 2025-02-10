package com.aqdar.construction.finance;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FundRecievedManager implements ListKeeper<FundRecieved> {
  private static final Logger logger = Logger.getLogger(FundRecievedManager.class.getName());

  private List<FundRecieved> fundsRecieved = new ArrayList<>();

  public void addFundRecieved(FundRecieved fundRecieved) {
    fundsRecieved.add(fundRecieved);
  }

  public void removeFundRecieved(FundRecieved fundRecieved) {
    for (int i = 0; i < fundsRecieved.size(); i++) {
      if (fundsRecieved.get(i).equals(fundRecieved)) {
        fundsRecieved.remove(i);
        break;
      }
    }
  }

  public void printFundsRecieved() {
    // Add your code here
    for (FundRecieved fundRecieved : fundsRecieved) {
      if (logger.isLoggable(java.util.logging.Level.INFO)) {
        logger.info(fundRecieved.toString());
      }
    }

  }

  @Override
  public List<FundRecieved> getList() {
    return fundsRecieved;
  }

}
