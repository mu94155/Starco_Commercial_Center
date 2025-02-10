package com.aqdar.construction.finance;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage2 extends JFrame {
        private JTextField descriptionField;
        private JTextField amountField;
        private JTextField dateField;
        private JTextArea displayArea;
        private JComboBox<Milestone> milestoneComboBox;
        private JButton addAdditionalScopePaymentButton;
        private JButton addMileStonePaymentButton;
        private JButton addFundButton;
        private JButton printAdditionalScopePaymentsButton;
        private JButton printMileStonePaymentsButton;
        private JButton printFundsButton;
        private JButton printReportButton;
        public final transient ButtonClickListener buttonClickListener;
        private static final Logger logger = Logger.getLogger(WelcomePage2.class.getName());

        public WelcomePage2() {
                setTitle("Payment and Fund Entry");
                setSize(800, 200);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());

                // Add project name label at the top
                JLabel projectNameLabel = new JLabel("Starco Commercial Center Project", SwingConstants.CENTER);
                projectNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
                add(projectNameLabel, BorderLayout.NORTH);

                JPanel inputPanel = new JPanel();
                inputPanel.setBorder(new EmptyBorder(10, 0, 10, 10)); // Add padding around the button panel
                GroupLayout layout = new GroupLayout(inputPanel);
                inputPanel.setLayout(layout);
                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);

                JLabel descriptionLabel = new JLabel("Description:");
                descriptionField = new JTextField(20);
                JLabel amountLabel = new JLabel("Amount:");
                amountField = new JTextField(20);
                JLabel dateLabel = new JLabel("Date:");
                dateField = new JTextField(20);
                JLabel milestoneLabel = new JLabel("Milestone:");
                milestoneComboBox = new JComboBox<>();
                milestoneComboBox.addItem(null);
                for (Milestone milestone : Milestone.values()) {
                milestoneComboBox.addItem(milestone);
                }
                milestoneComboBox.setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected,
                boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value == null) {
                setText("Select Milestone");
                } else {
                setText(value.toString());
                }
                return this;
                }
                });
                milestoneComboBox.setSelectedIndex(0);

                layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(descriptionLabel)
                .addComponent(amountLabel)
                .addComponent(dateLabel)
                .addComponent(milestoneLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(descriptionField)
                .addComponent(amountField)
                .addComponent(dateField)
                .addComponent(milestoneComboBox)));

                layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(descriptionLabel)
                .addComponent(descriptionField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(amountLabel)
                .addComponent(amountField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(dateLabel)
                .addComponent(dateField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(milestoneLabel)
                .addComponent(milestoneComboBox)));

                JPanel buttonPanelWest = new JPanel();
                buttonPanelWest.setLayout(new BoxLayout(buttonPanelWest, BoxLayout.Y_AXIS));
                buttonPanelWest.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between buttons
                buttonPanelWest.setBorder(new EmptyBorder(10, 10, 10, 5)); // Add padding around the button panel

                JPanel buttonPanelEast = new JPanel();
                GroupLayout buttonPanelEastLayout = new GroupLayout(buttonPanelEast);
                buttonPanelEast.setLayout(buttonPanelEastLayout);
                buttonPanelEast.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add padding around the button panel

                addAdditionalScopePaymentButton = new JButton("Add Additional Scope Payment");
                addMileStonePaymentButton = new JButton("Add MileStone Payment");
                addFundButton = new JButton("add fund");
                printAdditionalScopePaymentsButton = new JButton("Print Additional Scope Payments");
                printMileStonePaymentsButton = new JButton("Print MileStone Payments");
                printFundsButton = new JButton("Print funds");
                printReportButton = new JButton("Print report to file");

                // Initialize the button click listener with the WelcomePage2 instance
                buttonClickListener = new ButtonClickListener(this);
                addAdditionalScopePaymentButton.addActionListener(buttonClickListener);
                printAdditionalScopePaymentsButton.addActionListener(buttonClickListener);
                printMileStonePaymentsButton.addActionListener(buttonClickListener);
                addMileStonePaymentButton.addActionListener(buttonClickListener);
                addFundButton.addActionListener(buttonClickListener);
                printFundsButton.addActionListener(buttonClickListener);
                printReportButton.addActionListener(buttonClickListener);

                // Left justify text on buttons
                addAdditionalScopePaymentButton.setHorizontalAlignment(SwingConstants.LEFT);
                addMileStonePaymentButton.setHorizontalAlignment(SwingConstants.LEFT);
                addFundButton.setHorizontalAlignment(SwingConstants.LEFT);
                printAdditionalScopePaymentsButton.setHorizontalAlignment(SwingConstants.LEFT);
                printMileStonePaymentsButton.setHorizontalAlignment(SwingConstants.LEFT);
                printFundsButton.setHorizontalAlignment(SwingConstants.LEFT);
                printReportButton.setHorizontalAlignment(SwingConstants.LEFT);

                buttonPanelWest.add(addAdditionalScopePaymentButton);
                buttonPanelWest.add(addMileStonePaymentButton);
                buttonPanelWest.add(addFundButton);

                buttonPanelEastLayout.setHorizontalGroup(
                buttonPanelEastLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(printAdditionalScopePaymentsButton)
                .addComponent(printMileStonePaymentsButton)
                .addComponent(printFundsButton)
                .addComponent(printReportButton));

                buttonPanelEastLayout.setVerticalGroup(
                buttonPanelEastLayout.createSequentialGroup()
                .addComponent(printAdditionalScopePaymentsButton)
                .addComponent(printMileStonePaymentsButton)
                .addComponent(printFundsButton)
                .addComponent(printReportButton));

                add(buttonPanelWest, BorderLayout.WEST);
                add(buttonPanelEast, BorderLayout.EAST);
                add(inputPanel, BorderLayout.CENTER);

                displayArea = new JTextArea();
                displayArea.setEditable(false);
                add(new JScrollPane(displayArea), BorderLayout.SOUTH);
        }

        public JTextField getDescriptionField() {
                return descriptionField;
        }

        public JTextField getAmountField() {
                return amountField;
        }

        public JTextField getDateField() {
                return dateField;
        }

        public JTextArea getDisplayArea() {
                return displayArea;
        }

        public JComboBox<Milestone> getMilestoneComboBox() {
                return milestoneComboBox;
        }

        public JButton getAddAdditionalScopePaymentButton() {
                return addAdditionalScopePaymentButton;
        }

        public JButton getAddMileStonePaymentButton() {
                return addMileStonePaymentButton;
        }

        public JButton getaddFundButton() {
                return addFundButton;
        }

        public JButton getPrintFundsButton() {
                return printFundsButton;
        }

        public JButton getPrintAdditionalScopePaymentsButton() {
                return printAdditionalScopePaymentsButton;
        }

        public JButton getPrintMileStonePaymentsButton() {
                return printMileStonePaymentsButton;
        }

 // start of the inner class ButtonClickListener

        public class ButtonClickListener implements ActionListener {
                DataToFiles dataToFiles;
                List<AdditionalScopePayment> additionalScopePayments = new ArrayList<>();
                List<MileStonePayment> mileStonePayments = new ArrayList<>();
                List<FundRecieved> fundsRecieved = new ArrayList<>();
                private final WelcomePage2 welcomePage;
                public ButtonClickListener(WelcomePage2 welcomePage) {
                this.welcomePage = welcomePage;
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                        if (e.getSource() instanceof JButton sourceButton) {
                                String buttonText = sourceButton.getText();
                                switch (buttonText) {
                                case "add fund" -> handleFunds();
                                case "Add Additional Scope Payment" -> handleAddAdditionalScopePayment();
                                case "Add MileStone Payment" -> handleAddMileStonePayment();
                                case "Print funds" -> printFunds();
                                case "Print Additional Scope Payments" -> handleAddAdditionalScopePayment();
                                case "Print MileStone Payments" -> handlePrintMileStonePayments();
                                case "Print report to file" -> handlePrintReportToFile();
                                default -> {
                                if (logger.isLoggable(java.util.logging.Level.INFO)) {
                                        logger.info("Unknown button clicked: " + buttonText);
                                }
                                }
                                }
                        }
                }

                private void handlePrintReportToFile() {
                        Report report = new Report();
                        String reportData = report.generateReport();
                        // write data to file for additional payments
                        dataToFiles = new DataToFiles();
                        dataToFiles.writeToFileAll.writeReportToFile(reportData);
                        welcomePage.getDisplayArea().append(reportData + "\n");
                }
                

                private void handlePrintMileStonePayments() {
                        for (MileStonePayment payment : mileStonePayments) {
                        if (logger.isLoggable(java.util.logging.Level.INFO)) {
                        logger.info(payment.toString());
                        }
                        }
                }

                private void printFunds() {
                        for (FundRecieved payment : fundsRecieved) {
                        if (logger.isLoggable(java.util.logging.Level.INFO)) {
                        logger.info(payment.toString());
                        }
                        }
                }

                private void handleAddAdditionalScopePayment() {
                        String description = welcomePage.getDescriptionField().getText();
                        double amount = Double.parseDouble(welcomePage.getAmountField().getText());
                        String date = welcomePage.getDateField().getText();
                        AdditionalScopePayment payment = new AdditionalScopePayment(amount, description, date);
                        additionalScopePayments.add(payment);

                        // write data to file for additional payments
                        dataToFiles = new DataToFiles();
                        dataToFiles.writeToFileAll.writeToFile(additionalScopePayments);
                        welcomePage.getDisplayArea().append(payment.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                        welcomePage.getMilestoneComboBox().setSelectedIndex(0);

                        welcomePage.getDisplayArea().append(payment.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                }

                private void handleAddMileStonePayment() {
                        String description = welcomePage.getDescriptionField().getText();
                        double amount = Double.parseDouble(welcomePage.getAmountField().getText());
                        String date = welcomePage.getDateField().getText();
                        Milestone milestone = (Milestone) welcomePage.getMilestoneComboBox().getSelectedItem();
                        MileStonePayment payment = new MileStonePayment(amount, description, date, milestone);
                        mileStonePayments.add(payment);

                        // write data to file for milestone payments
                        dataToFiles = new DataToFiles();
                        dataToFiles.writeToFileAll.writeToFile(mileStonePayments);
                        welcomePage.getDisplayArea().append(payment.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                        welcomePage.getMilestoneComboBox().setSelectedIndex(0);
                }

                private void handleFunds() {
                        FundRecieved fundRecieved = new FundRecieved();
                        fundRecieved.setDescription(welcomePage.getDescriptionField().getText());
                        fundRecieved.setAmount(Double.parseDouble(welcomePage.getAmountField().getText()));
                        fundRecieved.setDate(welcomePage.getDateField().getText());

                        FundRecieved fund = new FundRecieved(fundRecieved.getAmount(), fundRecieved.getDescription(),
                        fundRecieved.getDate());
                        fundsRecieved.add(fundRecieved);
                        // write data to file for funds recieved
                        dataToFiles = new DataToFiles();
                        dataToFiles.writeToFileAll.writeToFile(fundsRecieved);
                        welcomePage.getDisplayArea().append(fund.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                        welcomePage.getMilestoneComboBox().setSelectedIndex(0);
                }
        }
}


