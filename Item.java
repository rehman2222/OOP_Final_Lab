
import java.util.HashMap;


public class Item extends javax.swing.JFrame {
    
    private HashMap<String, Integer> itemPrices = new HashMap<>();
    
    private void calculateBill() {
        int total = 0;
        String[] items = basketArea.getText().split("\\n");
        for (String item : items) {
            if (!item.isEmpty()) {
                total += itemPrices.get(item);
            }
        }
        billField.setText(String.valueOf(total));
    }
      private void addToBasket() {
        for (String item : Itemlist.getSelectedValuesList()) {
            basketArea.append(item + "\n");
        }
    }
     
    /**
     * Creates new form Item
     */
    public Item() {
        initComponents();
        itemPrices = new HashMap<>();
        itemPrices.put("Java", 50);
        itemPrices.put("Web", 60);
        itemPrices.put("DSA", 70);
        itemPrices.put("C++", 80);
        itemPrices.put("AI", 90);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Itemlist = new javax.swing.JList<>();
        purchaseButton = new javax.swing.JButton();
        payableButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        basketArea = new javax.swing.JTextArea();
        billField = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shoping Cart");

        Itemlist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Java", "Web", "DSA", "C++", "AI" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Itemlist);
        Itemlist.getAccessibleContext().setAccessibleName("");

        purchaseButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        purchaseButton.setText("Purchase Selected Item  ");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        payableButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        payableButton.setText("Payble Amount");
        payableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payableButtonActionPerformed(evt);
            }
        });

        basketArea.setColumns(20);
        basketArea.setRows(5);
        jScrollPane2.setViewportView(basketArea);

        billField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billFieldActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l1.setText("BILL");

        l2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l2.setText("Basket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchaseButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(payableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l2)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(l2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(purchaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(payableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l1)
                            .addComponent(billField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        
      addToBasket();
             
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void payableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payableButtonActionPerformed
        // TODO add your handling code here:
        calculateBill();
    }//GEN-LAST:event_payableButtonActionPerformed

    private void billFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_billFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Itemlist;
    private javax.swing.JTextArea basketArea;
    private javax.swing.JTextField billField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JButton payableButton;
    private javax.swing.JButton purchaseButton;
    // End of variables declaration//GEN-END:variables
}
