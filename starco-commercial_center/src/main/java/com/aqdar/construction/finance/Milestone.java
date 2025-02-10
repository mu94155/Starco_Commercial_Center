package com.aqdar.construction.finance;

public enum Milestone {
  ADVANCE_PAYMENT(1, "advance payment", "15%", 17250.0),
  FOUNDATION(2, "foundation", "10%", 11500.0),
  GROUND_FLOOR_COLUMNS_CONCRETE(3, "ground floor columns concrete", "15%", 17250.0),
  GROUND_FLOOR_SLAB_CONCRETE(4, "ground floor slab concrete", "10%", 11500.0),
  GROUND_FLOOR_BLASTER(5, "ground floor blaster", "8%", 9200.0),
  GROUND_FLOOR_CERAMIC_WORK(6, "ground floor ceramic work including toilets", "8%", 9200.0),
  GROUND_FLOOR_PRIMER_AND_UNDER_COAT(7, "ground floor primer and under coat", "8%", 9200.0),
  GROUND_FLOOR_PAINT_AND_ROOF_WATER_PROOF(8, "ground floor paint and roof water proof", "8%", 9200.0),
  GROUND_FLOOR_GLASS_DOORS_AND_ELECTRICAL_WORK(9, "ground floor glass doors and electrical work", "12%", 13800.0),
  GROUND_FLOOR_OUTSIDE_PAINT_AND_INTERLOCK(10, "ground floor outside paint and interlock", "3%", 3450.0),
  GROUND_FLOOR_CIVIL_DEFENCE_WORK(11, "ground floor civil defence work and building handover", "3%", 3450.0);

  private final int milestoneNumber;
  private final String milestoneName;
  private final String milestonePercentage;
  private final double milestoneAmount;

  Milestone(int milestoneNumber, String milestoneName, String milestonePercentage, double milestoneAmount) {
    this.milestoneNumber = milestoneNumber;
    this.milestoneName = milestoneName;
    this.milestonePercentage = milestonePercentage;
    this.milestoneAmount = milestoneAmount;
  }

  public int getMilestoneNumber() {
    return milestoneNumber;
  }

  public String getMilestoneName() {
    return milestoneName;
  }

  public String getMilestonePercentage() {
    return milestonePercentage;
  }

  public double getMilestoneAmount() {
    return milestoneAmount;
  }
}

