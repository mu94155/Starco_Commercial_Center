package com.aqdar.construction.finance;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AdditionalScopePaymentManager implements ListKeeper<AdditionalScopePayment> {
  private static final Logger logger = Logger.getLogger(AdditionalScopePaymentManager.class.getName());

  private List<AdditionalScopePayment> additionalScopePayments = new ArrayList<>();

  public void addPayment(AdditionalScopePayment additionalScopePayment) {
    additionalScopePayments.add(additionalScopePayment);
  }

  public void removePayment(AdditionalScopePayment additionalScopePayment) {
    for (int i = 0; i < additionalScopePayments.size(); i++) {
      if (additionalScopePayments.get(i).equals(additionalScopePayment)) {
        additionalScopePayments.remove(i);
        break;
      }
    }
  }

  public void printAdditioanlScopePayments() {
    // Add your code here
    for (AdditionalScopePayment additionalScopePayment : additionalScopePayments) {
      if (logger.isLoggable(java.util.logging.Level.INFO)) {
        logger.info(additionalScopePayment.toString());
      }
    }

  }

  @Override
  public List<AdditionalScopePayment> getList() {
    return additionalScopePayments;
  }

}
