package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Vishwakarma University");
            setBackground(new Color(173, 216, 230));
            setBounds(300, 150, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(450, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(110, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(40, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v11");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.ITALIC, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By :");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Yash Oswal: 41");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 30);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Rishabh Parmar: 43");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70,290,600,30);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Rajas Kondhare: 27");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 30);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Advait Lanjekar: 29");
            l10.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l10.setBounds(70, 350, 600, 30);
            contentPane.add(l10);
            contentPane.setBackground(Color.WHITE);
	}
}


