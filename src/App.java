import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Stores the Account Number and Account settings
        HashMap<String, CreateAccount> existAcc = new HashMap<String, CreateAccount>();
        // Stores the Account Number and Login info
        HashMap<String, Login> passcodes = new HashMap<String, Login>(); // encrypted hashMap
        // Stores the Account Number and Balance
        HashMap<String, Integer> balances = new HashMap<String, Integer>();
        /*
         * JFrame frame = new JFrame("Bank Account App");
         * JPanel panel = new JPanel();
         * panel.setLayout(new FlowLayout());
         * JLabel label = new JLabel("Main Menu");
         * // Create Account Button & actions
         * JButton button1 = new JButton("Create Account");
         * button1.addActionListener(new ActionListener() {
         * public void actionPerformed(ActionEvent args){
         * JFrame frameAcc = new JFrame("Create Account");
         * JPanel panelAcc = new JPanel(new FlowLayout());
         * frameAcc.add(panelAcc);
         * frameAcc.setSize(200, 300);
         * frameAcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frameAcc.setVisible(true);
         * }
         * });
         * // Login to Account Button
         * JButton button2 = new JButton("Login");
         * // Help Button
         * JButton button3 = new JButton("Help");
         * panel.add(label);
         * panel.add(button1);
         * panel.add(button2);
         * panel.add(button3);
         * frame.add(panel);
         * frame.setSize(200, 300);
         * frame.setLocationRelativeTo(button1);
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frame.setVisible(true);
         */

        boolean run = true;
        // It starts the program
        while (run) {
            String mainMenu = "1) Create Account" + "\n 2) Login" + "\n 3) Help"; // Which option do you want to access
            JFrame frame = new JFrame();

            Scanner sc = new Scanner(System.in);
            String option = JOptionPane.showInputDialog(frame, mainMenu); // Build the Starting menu
            switch (option) {
                case "1":
                    // Ask for the info regarding the User's account
                    String name = JOptionPane.showInputDialog(frame, "Enter full Name: ");
                    String address = JOptionPane.showInputDialog(frame, "Enter full address: ");
                    String phone = JOptionPane.showInputDialog(frame, "Enter phone number: ");
                    // Create a temporary account
                    CreateAccount temp = new CreateAccount(name, address, phone);
                    // Check if the Account exist or if the Hash Map is empty
                    if (existAcc.isEmpty() || !existAcc.containsValue(temp)) {
                        // Generate the account number
                        String tempP = temp.generateAccNumber();
                        existAcc.put(tempP, temp);
                        String username = JOptionPane.showInputDialog(frame, "Enter your username: ");
                        String password = JOptionPane.showInputDialog(frame, "Enter your password: ");
                        Login tempLogin = new Login(username, password);
                        if (passcodes.isEmpty() || !passcodes.containsValue(tempLogin))
                            passcodes.put(tempP, tempLogin);
                        else {
                            JOptionPane.showMessageDialog(frame, "Error username and password already exist");
                        }
                        // Check
                        // int pin = Integer.valueOf(JOptionPane.showInputDialog(frame, "Enter
                        // password"));
                        // encrypt password first

                        // passcodes.put(tempP,password);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Error account already exist");
                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    run = false;
                    break;
            }
            System.out.println(existAcc);
            for (Map.Entry m : existAcc.entrySet()) {
                System.out.println(existAcc.get(m.getKey()).getName());
                System.out.println(existAcc.get(m.getKey()).getAddress());
                System.out.println(existAcc.get(m.getKey()).getPhone());
            }       
        }
    }
}
