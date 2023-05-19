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
        HashMap<String, CreateAccount> existAcc = new HashMap<String, CreateAccount>();
        HashMap<String, String> passcodes = new HashMap<String, String>(); // encrypted hashMap
        HashMap<String, Integer> balances = new HashMap<String, Integer>();
/* 
        JFrame frame = new JFrame("Bank Account App");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Main Menu");
        // Create Account Button & actions
        JButton button1 = new JButton("Create Account");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent args){
                JFrame frameAcc = new JFrame("Create Account");
                JPanel panelAcc = new JPanel(new FlowLayout());
                frameAcc.add(panelAcc);
                frameAcc.setSize(200, 300);
                frameAcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameAcc.setVisible(true);
            }
        });
        // Login to Account Button
        JButton button2 = new JButton("Login");
        // Help Button
        JButton button3 = new JButton("Help");
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(button1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
*/
        
        boolean run = true;
        while(run){
            String mainMenu = "1) Create Account"+"\n 2) Login" + "\n 3) Help"; 
            JFrame frame = new JFrame();
            
            Scanner sc = new Scanner(System.in);
            String option = JOptionPane.showInputDialog(frame,mainMenu);
            switch (option) {
                case "1":
                String name = JOptionPane.showInputDialog(frame, "Enter full Name ex. John Doe");
                String address = JOptionPane.showInputDialog(frame, "Enter full address ex. 8460 SW 156 PL #702 Miami, FL 33193");
                String phone = JOptionPane.showInputDialog(frame, "Enter phone number ex. 305-303-9549");
                CreateAccount temp = new CreateAccount(name,address,phone);
                if (existAcc.isEmpty() || !existAcc.containsValue(temp)) {
                    String tempP = temp.generateAccNumber();
                    existAcc.put(tempP, temp);
                    // Set up a password or pin
                    //int pin = Integer.valueOf(JOptionPane.showInputDialog(frame, "Enter password"));
                    // encrypt password first

                    // passcodes.put(tempP,password);
                }
                else{
                    JOptionPane.showMessageDialog(frame,"Error");
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
        }
        System.out.println(existAcc);
        for (Map.Entry m : existAcc.entrySet()){
            System.out.println(existAcc.get(m.getKey()).getName());
            System.out.println(existAcc.get(m.getKey()).getAddress());
            System.out.println(existAcc.get(m.getKey()).getPhone());
        }
    } 
}
