// Java program to create a blank text  
// field of definite number of columns. 
import java.awt.event.*; 
import javax.swing.*; 
class text extends JFrame implements ActionListener { 
    // JTextField 
    static JTextField t, t2, t3; 

    // JFrame 
    static JFrame f; 

    // JButton 
    static JButton b; 

    // label to display text 
    static JLabel l, l2, l3, l4; 

    // default constructor 
    text() 
    { 
    } 

    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to store text field and button 
        f = new JFrame("textfield"); 

        // create a label to display text 
        l = new JLabel("What state are you in? (Type USA for general info)"); 
        l2 = new JLabel("How many people are gathering together?");
        l3 = new JLabel("Are you meeting virtually, outdoors, or indoors?");
        l4 = new JLabel("");
        // create a new button 
        b = new JButton("submit"); 

        // create a object of the text class 
        text te = new text(); 

        // addActionListener to button 
        b.addActionListener(te); 

        // create a object of JTextField with 16 columns 
        t = new JTextField(25); 
        t2 = new JTextField(25); 
        t3 = new JTextField(25); 

        // create a panel to add buttons and textfield 
        JPanel p = new JPanel(); 

        // add buttons and textfield to panel 

        p.add(l); 
        p.add(t);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(b); 
        p.add(l4);

        // add panel to frame 
        f.add(p); 

        // set the size of frame 
        f.setSize(1400, 300); 

        f.show(); 
    } 

    // if the vutton is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = t.getText(); 
        int m = Integer.parseInt(t2.getText());
        String r = t3.getText();
        Risk_Calculator a = new Risk_Calculator(s, m);
        String temp = "";
        temp += "The chance that at least 1 person in your group has COVID is "+Math.round(a.RiskPercentage())+"%."+System.lineSeparator();
        if (r.equals("Virtually") || r.equals("virtually"))
        {
            temp += "However, the virus would likely not spread because you are meeting online. Good for you!";
        }
        else if (r.equals("Outdoors") || r.equals("outdoors"))
        {
            temp += "To reduce the virus' spreading, make sure to wear a mask, keep your distance, and wash your hands frequently.";
        }
        else
        {
            temp += "To reduce the virus' spreading, make sure to wear a mask, keep your distance, and wash your hands frequently. If possible, try moving to a venue outside.";
        }
        l4.setText(temp);
    } 
} 