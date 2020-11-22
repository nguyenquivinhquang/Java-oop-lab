import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class GUI extends JFrame {
    private JLabel JproductName;
    private JPanel FirstPanel;
    private JTextField getProductName;
    private JLabel Jamount;
    private JTextField getAmount;
    private JTextField getDescription;
    private JLabel Jdescription;
    private JButton addButton;
    private JButton removeButton;
    private JLabel productList;
    private JScrollPane showlist;
    private JList list1;
    private JButton jSearch;

    private String productName, description;
    int amount;
    public Manager manager = new Manager();

    public GUI(String title) throws IOException {
        super(title);
        this.setContentPane(FirstPanel);
//        this.pack();
        super.setSize(1500, 1500); // set JPanel size
        this.addWindowListener(new WindowAdapter() { // write data when closing program
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    manager.writeToCsv();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                super.windowClosing(e);
            }

        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue();
                manager.addProducts(new Product(productName, amount, description));
                update();
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue();
                manager.removeProducts(new Product(productName, amount, description));
                update();
            }
        });
        manager.readCsv();
        manager.updateList();
        //JList<String> list = new JList<String>(manager.list.toArray(new String[manager.list.size()]));

        list1.setListData(manager.list.toArray());

        jSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getValue();
                Product match = manager.search(productName);
                if (match.getProductName().equals("NULL"))
                    JOptionPane.showMessageDialog(null, "Cannot fuind the item");
                else {
                    String text = match.getProductInformation();
                    JOptionPane.showMessageDialog(null, text);
                }
            }
        });
    }

    public void getValue() {
        productName = getProductName.getText(); // get input product name
        description = getDescription.getText(); // get input description
        String num = getAmount.getText();
        amount = 0;
        if (isNumeric(num))
            amount = Integer.parseInt(getAmount.getText()); // get amount, and change it to integer because value from amount is string
    }

    private void update() { // this function update Jscroll panel to show list of items
        manager.updateList();
        list1.setListData(manager.list.toArray());

    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new GUI("WAREHOUSE MANAGER");
        frame.setVisible(true);
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
