import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(){
        JFrame frame = new JFrame();

        frame.setTitle("Car Rental");
        frame.setSize(640,480);
        frame.setLayout(new BorderLayout());

        JPanel jLeft = new JPanel();
        JPanel jRight = new JPanel();
        JPanel jTop = new JPanel();
        JPanel jBottom = new JPanel();

        frame.add(jLeft, "West");
        jLeft.setPreferredSize(new Dimension(40,480));
        jLeft.setBackground(Color.BLUE);

        frame.add(jRight, "East");
        jRight.setPreferredSize(new Dimension(40,480));
        jRight.setBackground(Color.RED);

        //North
        JLabel header = new JLabel("Car Rental Service");               //Creating the header and setting the font below
        header.setFont(new Font("Serif", Font.PLAIN, 24));


        jTop.setPreferredSize(new Dimension(480, 60));          //North panel that holds the header
        jTop.setBackground(Color.white);
        frame.add(jTop, "North");
        jTop.add(header);

        //South
        JButton button = new JButton("Submit");                         //Creating the button for submitting the car information
        button.setFont(new Font("Serif", Font.PLAIN, 14));
        button.setPreferredSize(new Dimension(100,28));

        frame.add(jBottom, "South");
        jBottom.setPreferredSize(new Dimension(640, 37));       //Setting the dimensions of the south panel
        jBottom.setBackground(Color.white);

        jBottom.setLayout(new FlowLayout(FlowLayout.RIGHT));                //Setting the layout for the south to panel to add the button to submit all the info
        jBottom.add(button);


        //  Center/Main
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.pink);
        mainPanel.setLayout(new GridLayout(6,2,10,8));
        
        frame.add(mainPanel, "Center");

        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        
    }
}
