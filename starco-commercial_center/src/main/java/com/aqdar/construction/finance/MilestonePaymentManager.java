package com.aqdar.construction.finance;

import java.util.ArrayList;
import java.util.List;

public class MilestonePaymentManager implements ListKeeper<MileStonePayment> {
  private List<MileStonePayment> milestonePayments = new ArrayList<>();

  public void addPayment(MileStonePayment payment) {
    milestonePayments.add(payment);

  }

  public void removePayment(MileStonePayment payment) {
    for (int i = 0; i < milestonePayments.size(); i++) {
      if (milestonePayments.get(i).equals(payment)) {
        milestonePayments.remove(i);
        break;
      }
    }
  }

  @Override
  public List<MileStonePayment> getList() {
    return milestonePayments;
  }

}
