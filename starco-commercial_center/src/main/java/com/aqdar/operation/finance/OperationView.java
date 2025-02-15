package com.aqdar.operation.finance;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.aqdar.construction.finance.FundRecieved;
import com.aqdar.construction.finance.Milestone;

import java.awt.*;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationView extends JFrame {

        private JLabel opexTypeLabel;
        private JLabel yearLabel;
        private JLabel monthLabel;
        private JLabel descriptionLabel;
        private JLabel amountLabel;
        private JLabel dateLabel;
        private JLabel quantityLabel;
        private JLabel displayLabel;
        private JTextField descriptionField;
        private JTextField amountField;
        private JTextField dateField;
        private JTextField quantityField;
        private JTextField displayField;
        private JTextArea displayArea;
        private JComboBox<Year> yearComboBox;
        private JComboBox<Month> monthComboBox;
        private JComboBox<Opex> opexComboBox;
        private JButton addExpenseButton;
        private JButton printTotalMaintenancePerMonthButton;
        private JButton printTotalExpensesCommonAreaPerMonthButton;
        private JButton printUtilityExpensesPerShopPerMonthButton;
        private JButton printRentPaymentPerShopButton;
        private JButton printCustomerDetailsPerShopButton;
        private JButton printReportToFile;
        public final transient ButtonClickListener buttonClickListener;
        private static final Logger logger = Logger.getLogger(OperationView.class.getName());

        public OperationView() {
                setTitle("Payment and Fund Entry");
                setSize(800, 200);
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setLayout(new BorderLayout());

                // Add project name label at the top
                JLabel projectNameLabel = new JLabel("Starco Commercial Center Project Operation View", SwingConstants.CENTER);
                projectNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
                add(projectNameLabel, BorderLayout.NORTH);

                JPanel inputPanel = new JPanel();
                inputPanel.setBorder(new EmptyBorder(10, 0, 10, 10)); // Add padding around the button panel
                GroupLayout layout = new GroupLayout(inputPanel);
                inputPanel.setLayout(layout);
                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);

                //instance of the operation view labels and textfields
                JLabel descriptionLabel = new JLabel("Description:");
                descriptionField = new JTextField(20);
                JLabel amountLabel = new JLabel("Amount:");
                amountField = new JTextField(20);
                JLabel dateLabel = new JLabel("Date:");
                dateField = new JTextField(20);
                JLabel quantityLabel = new JLabel("Quantity:");
                quantityField = new JTextField(20);
                JLabel monthLabel = new JLabel("Month:");
                JLabel opexLabel = new JLabel("Opex:");
                JLabel yearLabel = new JLabel("Year:");
                JLabel displayLabel = new JLabel("Display Area:");
                displayField = new JTextField(20);
                
                // year combo box
                yearComboBox = new JComboBox<>();
                yearComboBox.addItem(null);
                for (Year year : Year.values()) {
                yearComboBox.addItem(year);
                }
                yearComboBox.setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected,
                boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value == null) {
                setText("Select Year");
                } else {
                setText(value.toString());
                }
                return this;
                }
                });
                yearComboBox.setSelectedIndex(0);

                // month combo box
                monthComboBox = new JComboBox<>();
                monthComboBox.addItem(null);
                for (Month month : Month.values()) {
                monthComboBox.addItem(month);
                }
                monthComboBox.setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected,
                boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value == null) {
                setText("Select Month");
                } else {
                setText(value.toString());
                }
                return this;
                }
                });
                monthComboBox.setSelectedIndex(0);

                // opex combo box
                opexComboBox = new JComboBox<>();
                opexComboBox.addItem(null);
                for (Opex milestone : Opex.values()) {
                opexComboBox.addItem(milestone);
                }
                opexComboBox.setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected,
                boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value == null) {
                setText("Select Expense type");
                } else {
                setText(value.toString());
                }
                return this;
                }
                });
                opexComboBox.setSelectedIndex(0);
                
                // layout for the input panel
                layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(descriptionLabel)
                .addComponent(amountLabel)
                .addComponent(dateLabel)
                .addComponent(opexTypeLabel)
                .addComponent(yearLabel)
                .addComponent(monthLabel)
                .addComponent(quantityLabel)
                .addComponent(displayLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(descriptionField)
                .addComponent(amountField)
                .addComponent(dateField)
                .addComponent(opexComboBox)
                .addComponent(yearComboBox)
                .addComponent(monthComboBox)
                .addComponent(quantityField)
                .addComponent(displayField)));

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
                .addComponent(opexLabel)
                .addComponent(opexComboBox)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(yearLabel)
                .addComponent(yearComboBox))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(monthLabel)
                .addComponent(monthComboBox))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(quantityLabel)
                .addComponent(quantityField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(displayLabel)
                .addComponent(displayField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE))));

                //button panels layouts
                JPanel buttonPanelWest = new JPanel();
                buttonPanelWest.setLayout(new BoxLayout(buttonPanelWest, BoxLayout.Y_AXIS));
                buttonPanelWest.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between buttons
                buttonPanelWest.setBorder(new EmptyBorder(10, 10, 10, 5)); // Add padding around the button panel

                JPanel buttonPanelEast = new JPanel();
                GroupLayout buttonPanelEastLayout = new GroupLayout(buttonPanelEast);
                buttonPanelEast.setLayout(buttonPanelEastLayout);
                buttonPanelEast.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add padding around the button panel

                // Buttons for adding and printing expenses
                addExpenseButton = new JButton("Add Expense");
                printTotalMaintenancePerMonthButton = new JButton("Print Total Maintenance per month");
                printUtilityExpensesPerShopPerMonthButton = new JButton("Print utility per shop per month");
                printTotalExpensesCommonAreaPerMonthButton= new JButton("Print total expenses common area per month");
                printRentPaymentPerShopButton = new JButton("Print Rent payment per shop");
                printCustomerDetailsPerShopButton= new JButton("Print customer details per shop");
                printReportToFile = new JButton("Print report to file");

                // Initialize the button click listener with the Operation View instance
                buttonClickListener = new ButtonClickListener(this);
                addExpenseButton.addActionListener(buttonClickListener);
                printTotalMaintenancePerMonthButton.addActionListener(buttonClickListener);
                printUtilityExpensesPerShopPerMonthButton.addActionListener(buttonClickListener);
                printTotalExpensesCommonAreaPerMonthButton.addActionListener(buttonClickListener);
                printRentPaymentPerShopButton.addActionListener(buttonClickListener);
                printCustomerDetailsPerShopButton.addActionListener(buttonClickListener);
                printReportToFile.addActionListener(buttonClickListener);

                // Left justify text on buttons
                addExpenseButton.setHorizontalAlignment(SwingConstants.LEFT);
                printTotalMaintenancePerMonthButton.setHorizontalAlignment(SwingConstants.LEFT);
                printUtilityExpensesPerShopPerMonthButton.setHorizontalAlignment(SwingConstants.LEFT);
                printTotalExpensesCommonAreaPerMonthButton.setHorizontalAlignment(SwingConstants.LEFT);
                printRentPaymentPerShopButton.setHorizontalAlignment(SwingConstants.LEFT);
                printCustomerDetailsPerShopButton.setHorizontalAlignment(SwingConstants.LEFT);
                printReportToFile.setHorizontalAlignment(SwingConstants.LEFT);

                // Add buttons to the button panel
                buttonPanelWest.add(addExpenseButton);
                buttonPanelWest.add(printTotalMaintenancePerMonthButton);
                buttonPanelWest.add(printTotalExpensesCommonAreaPerMonthButton);

                buttonPanelEastLayout.setHorizontalGroup(
                buttonPanelEastLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(printUtilityExpensesPerShopPerMonthButton)
                .addComponent(printCustomerDetailsPerShopButton)
                .addComponent(printRentPaymentPerShopButton)
                .addComponent(printReportToFile));
                
                buttonPanelEastLayout.setVerticalGroup(
                buttonPanelEastLayout.createSequentialGroup()
                .addComponent(printUtilityExpensesPerShopPerMonthButton)
                .addComponent(printCustomerDetailsPerShopButton)
                .addComponent(printRentPaymentPerShopButton));

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

        public JComboBox<Opex> getOpexComboBox() {
                return opexComboBox;
        }

        // start of the inner class ButtonClickListener

        public class ButtonClickListener implements ActionListener {
                DataToFiles dataToFiles;
                List<Opex> costs = new ArrayList<>();
                List<Expense> expenses = new ArrayList<>();
                private final OperationView operationView;

                public ButtonClickListener(OperationView operationView) {
                        this.operationView = operationView;
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                        if (e.getSource() instanceof JButton sourceButton) {
                                String buttonText = sourceButton.getText();
                                switch (buttonText) {
                                        case "Add Expense" -> handleAddExpense();
                                        case "Print Total Maintenance per month" -> handlePrintTotalMaintenancePerMonth();
                                        case "Print utility per shop per month" -> handlePrintUtilityPerShopPerMonth();
                                        case "Print total expenses common area per month" -> handlePrintTotalExpensesCommonAreaPerMonth();
                                        case "Print Rent payment per shop" -> handlePrintRentPerShop();
                                        case "Print customer details per shop" -> handlePrintCustomerDetailsPerShop();
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
                        operationView.getDisplayArea().append(reportData + "\n");
                }

                private void handlePrintMaintenanceExpences() {
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

                private void handleAddExpense() {
                        String description = operationView.getDescriptionField().getText();
                        double amount = Double.parseDouble(operationView.getAmountField().getText());
                        String date = operationView.getDateField().getText();
                        Opex opex = (Opex) operationView.getOpexComboBox().getSelectedItem();
                        Month month = (Month) operationView.monthComboBox.getSelectedItem();
                        Year year = (Year) operationView.yearComboBox.getSelectedItem();
                        int quantity = Integer.parseInt(operationView.quantityField.getText());
                        expenses.add(new Expense(description,amount,date,opex,month,year,quantity));
                        

                        // write data to file for additional payments
                        dataToFiles = new DataToFiles();
                        dataToFiles.writeToFileAll.writeToFile(additionalScopePayments);
                        welcomePage.getDisplayArea().append(payment.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                        welcomePage.getopexComboBox().setSelectedIndex(0);

                        welcomePage.getDisplayArea().append(payment.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                }

                private void handleAddMileStonePayment() {
                        String description = welcomePage.getDescriptionField().getText();
                        double amount = Double.parseDouble(welcomePage.getAmountField().getText());
                        String date = welcomePage.getDateField().getText();
                        Milestone milestone = (Milestone) welcomePage.getopexComboBox().getSelectedItem();
                        MileStonePayment payment = new MileStonePayment(amount, description, date, milestone);
                        mileStonePayments.add(payment);

                        // write data to file for milestone payments
                        dataToFiles = new DataToFiles();
                        dataToFiles.writeToFileAll.writeToFile(mileStonePayments);
                        welcomePage.getDisplayArea().append(payment.toString() + "\n");
                        welcomePage.getDescriptionField().setText("");
                        welcomePage.getAmountField().setText("");
                        welcomePage.getDateField().setText("");
                        welcomePage.getopexComboBox().setSelectedIndex(0);
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
                        welcomePage.getopexComboBox().setSelectedIndex(0);
                }
        }
}
