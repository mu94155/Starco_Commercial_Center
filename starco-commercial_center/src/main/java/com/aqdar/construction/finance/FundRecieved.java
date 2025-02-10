package com.aqdar.construction.finance;

import java.util.ArrayList;
import java.util.List;

public class FundRecieved {
    private double amount;
    private String description;
    private String date;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<FundRecieved> getFundsRecievedList() {
        return this.fundsRecievedList;
    }

    public void setfundsRecievedList(List<FundRecieved> fundsRecievedList) {
        this.fundsRecievedList = fundsRecievedList;
    }

    List<FundRecieved> fundsRecievedList = new ArrayList<>();

    public FundRecieved() {
    }

    public FundRecieved(double amount, String description, String date) {
        this.amount = amount;
        this.description = description;
        this.date = date;

    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                " amount='" + getAmount() + "'" +
                ", description='" + getDescription() + "'" +
                ", date='" + getDate() + "'"+
                "}";
    }

    public void addFundRecieved(FundRecieved fundRecieved) {
        fundsRecievedList.add(fundRecieved);
    }

    public void removeFundRecieved(FundRecieved fundRecieved) {
        fundsRecievedList.remove(fundRecieved);
    }

    public List<FundRecieved> getFundRecieveds() {
        return fundsRecievedList;
    }

}
