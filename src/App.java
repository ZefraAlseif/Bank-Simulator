import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, CreateAccount> existAcc = new HashMap<String, CreateAccount>();
        /*
         * JFrame frame = new JFrame("Bank Account App");
         * JPanel panel = new JPanel();
         * panel.setLayout(new FlowLayout());
         * JLabel label = new JLabel("Main Menu");
         * // Create Account Button
         * JButton button1 = new JButton("Create Account");
         * // Login to Account Button
         * JButton button2 = new JButton("Login");
         * // Help Button
         * JButton button3 = new JButton("Help");
         * panel.add(label);
         * panel.add(button1);
         * panel.add(button2);
         * panel.add(button3);
         * frame.add(panel);
         * frame.setSize(200,300);
         * frame.setLocationRelativeTo(button1);;
         * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         * frame.setVisible(true);
         */
        CreateAccount temp = new CreateAccount("Carlos Otero", "8460 SW 156 PL apt 702 Miami, FL 33193",
                "305-303-9549");
        if (existAcc.isEmpty()) {
            existAcc.put(temp.generateAccNumber(), temp);
        }
        CreateAccount bd = new CreateAccount("John Doe", "8460 SW 156 PL apt 702 Miami, FL 33193", "305-303-9547");
        System.out.println(temp.getName());
        System.out.println(temp.getAddress());
        System.out.println(temp.getPhone());
        System.out.println(temp);
        System.out.println(temp.hashCode());
        System.out.println(bd.hashCode());
        System.out.println(temp.equals(bd));
        System.out.println(existAcc);
    }
}
