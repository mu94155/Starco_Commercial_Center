package com.aqdar.construction.finance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WriteToFileAll {
  private String lastDirectory = null; // Store the last selected directory
  static Logger logger = Logger.getLogger(WriteToFileAll.class.getName());
  private String filePath = null;

  public <T> void writeToFile(List<T> list) {
    if (filePath == null) {
      filePath = getFilePathSaveDataTo();
    }

    if (filePath == null) {
      logger.warning("No file selected.");
      return;
    }
    try {
      File dataFile = new File(filePath);
      try (FileWriter fileWriter = new FileWriter(dataFile);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        for (T payment : list) {
          bufferedWriter.write(payment.toString());
          bufferedWriter.newLine();
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Optional: Add any cleanup code here
    }
    logger.info("Data written to file successfully.");
  }

  public String writeReportToFile(String report) {
    if (filePath == null) {
      filePath = getFilePathSaveDataTo();
    }

    if (filePath == null) {
      return "No file selected.";
    }
    try {
      File dataFile = new File(filePath);
      try (FileWriter fileWriter = new FileWriter(dataFile);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

        bufferedWriter.write(report);
        bufferedWriter.newLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
      return "Error writing to file.";
    } finally {
      // Optional: Add any cleanup code here
    }
    return "Report written to file successfully.";
  }


  public String getFilePathSaveDataTo() {
      JFrame frame = new JFrame();
      JFileChooser fileChooser = new JFileChooser();

      if (lastDirectory != null) {
          fileChooser.setCurrentDirectory(new File(lastDirectory)); // Set the last selected directory
      }
      fileChooser.setDialogTitle("Select a file to save data to");

      int userSelection = fileChooser.showSaveDialog(frame);

      if (userSelection == JFileChooser.APPROVE_OPTION) {
          lastDirectory = fileChooser.getSelectedFile().getParent(); // Remember the selected directory
          frame.dispose();
          File selectedFile = fileChooser.getSelectedFile();
          if (!selectedFile.exists()) {
              try {
                  boolean fileCreated = selectedFile.createNewFile(); // Create a new file if it doesn't exist
                  if (!fileCreated) {
                      JOptionPane.showMessageDialog(null, "File already exists.");
                  } else {
                      JOptionPane.showConfirmDialog(null, "File created successfully.");
                  }

              } catch (IOException e) {
                  e.printStackTrace();
                  return "Error: Unable to create new file";
              }
              JOptionPane.showMessageDialog(null, "file created successfully.");
          }
          return selectedFile.getAbsolutePath();
      } else {
          frame.dispose();
          return "Error: No file selected";
      }
  }


  public String getFilePathSourceData() {
    JFrame frame = new JFrame();
    JFileChooser fileChooser = new JFileChooser();

    if (lastDirectory != null) {
      fileChooser.setCurrentDirectory(new File(lastDirectory)); // Set the last selected directory
    }
    fileChooser.setDialogTitle("Select a file to retrieve data from");

    int userSelection = fileChooser.showSaveDialog(frame);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
      lastDirectory = fileChooser.getSelectedFile().getParent(); // Remember the selected directory
      frame.dispose();
      return fileChooser.getSelectedFile().getAbsolutePath();
    } else {
      frame.dispose();
      return "Error: No file selected";
    }
  }


}
