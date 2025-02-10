package com.aqdar.construction.finance;


import java.util.List;
import java.util.logging.Logger;

public class DataToFiles {
    WriteToFileAll writeToFileAll = new WriteToFileAll();
    Logger logger = Logger.getLogger(DataToFiles.class.getName());

    public<T> void saveAllPayments(List<T> list) {
      if (list instanceof AdditionalScopePayment) {
        // Write additional payments to file
        writeToFileAll.writeToFile(list);
      } else if (list instanceof MilestonePaymentManager) {
        // Write milestone payments to file
        writeToFileAll.writeToFile(list);
      } else if (list instanceof FundRecieved) {
        // Write funds received to file
        writeToFileAll.writeToFile(list);
      } else {
        logger.info("All data written to files");
    }
}

    // Overloaded method to save a single String
    public void saveAllPayments(String data) {
      if (data != null && !data.isEmpty()) {
          // Write string data to file
          writeToFileAll.writeReportToFile(data);
          logger.info("String data written to file");
      }
  }

}
