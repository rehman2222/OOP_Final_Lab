package fastfoodgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fastfood extends JFrame implements ActionListener {
    JComboBox<String> fastFoodList;
    JComboBox<String> softDrinkList;
    JTextField quantityFastFood;
    JTextField quantitySoftDrink;
    JTextField totalBill;
    JButton clickOnceButton;

    public Fastfood() {
        super("Fast Food Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLayout(new GridLayout(5, 2));
        JLabel fastFoodLabel = new JLabel("Fast Food");
        add(fastFoodLabel);

        String[] fastFoodItems = {"Burger", "Pizza", "Fries", "Sandwich"};
        fastFoodList = new JComboBox<>(fastFoodItems);
        add(fastFoodList);

        JLabel quantityFastFoodLabel = new JLabel("Quantity");
        add(quantityFastFoodLabel);

        quantityFastFood = new JTextField();
        add(quantityFastFood);

        JLabel softDrinkLabel = new JLabel("Soft Drinks");
        add(softDrinkLabel);

        String[] softDrinkItems = {"Pepsi", "Coke", "Sprite", "7Up"};
        softDrinkList = new JComboBox<>(softDrinkItems);
        add(softDrinkList);

        JLabel quantitySoftDrinkLabel = new JLabel("Quantity");
        add(quantitySoftDrinkLabel);

        quantitySoftDrink = new JTextField();
        add(quantitySoftDrink);
        JLabel totalBillLabel = new JLabel("Total Bill");
        add(totalBillLabel);

        totalBill = new JTextField();
        totalBill.setEditable(false);
        add(totalBill);
        clickOnceButton = new JButton("Click Once");
        clickOnceButton.addActionListener(this);
        add(clickOnceButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickOnceButton) {
            String selectedFastFood = (String) fastFoodList.getSelectedItem();
            String selectedSoftDrink = (String) softDrinkList.getSelectedItem();
            int fastFoodQuantity = Integer.parseInt(quantityFastFood.getText());
            int softDrinkQuantity = Integer.parseInt(quantitySoftDrink.getText());
            double totalCost = calculateTotalCost(selectedFastFood, fastFoodQuantity, selectedSoftDrink, softDrinkQuantity);
            totalBill.setText(String.format("$%.2f", totalCost));
        }
    }
 private double calculateTotalCost(String fastFood, int fastFoodQuantity, String softDrink, int softDrinkQuantity) {
        double totalCost = 0;
        switch (fastFood) {
            case "Burger":
                totalCost += fastFoodQuantity * 5.99;
                break;
            case "Pizza":
                totalCost += fastFoodQuantity * 12.99;
                break;
            case "Fries":
                totalCost += fastFoodQuantity * 2.99;
                break;
            case "Sandwich":
                totalCost += fastFoodQuantity * 4.99;
                break;
        }

        switch (softDrink) {
            case "Pepsi":
                totalCost += softDrinkQuantity * 1.99;
                break;
            case "Coke":
                totalCost += softDrinkQuantity * 1.99;
                break;
            case "Sprite":
                totalCost += softDrinkQuantity * 1.99;
                break;
            case "7Up":
                totalCost += softDrinkQuantity * 1.99;
                break;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FastFoodGUI());
    }
}
