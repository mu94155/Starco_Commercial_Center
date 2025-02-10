package com.aqdar.construction.finance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Report {
    WriteToFileAll writeToFileAll = new WriteToFileAll();
    Logger logger = Logger.getLogger(Report.class.getName());
    List<String> filedata = new ArrayList<>();

    String filePath = writeToFileAll.getFilePathSourceData();
    /*
    "C:\\Users\\ssssh\\OneDrive\\Desktop\\Starco_Commercial_Center\\dataFiles\\fundsRecieved.txt";
 */
    
    public String generateReport() {
        // Read data from file
        File file = new File(filePath);
        readDataFromFile(file);

        // Generate report string
        return createReportString();
    }

    public String createReportString() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("This is a report\nFunds Received:");
        for (String data : filedata) {
            reportBuilder.append("\n").append(data);
        }
        return reportBuilder.toString();
    }

    public void readDataFromFile(File file) {
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    filedata.add(line);
                    // read data from file
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            logger.info("File does not exist: " + file.getAbsolutePath());
        }
    }
}