import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    public static void main(){
        JFrame frame = new JFrame();

        frame.setTitle("Car Rental");
        frame.setSize(540,380);
        frame.setLayout(new BorderLayout());

        JPanel jLeft = new JPanel();
        JPanel jRight = new JPanel();
        JPanel jTop = new JPanel();
        JPanel jBottom = new JPanel();

        frame.add(jLeft, "West");
        jLeft.setPreferredSize(new Dimension(40,380));
        jLeft.setBackground(Color.white);

        frame.add(jRight, "East");
        jRight.setPreferredSize(new Dimension(40,380));
        jRight.setBackground(Color.white);

        //North
        JLabel header = new JLabel("Car Rental Service");               //Creating the header and setting the font below
        header.setFont(new Font("Serif", Font.PLAIN, 24));


        jTop.setPreferredSize(new Dimension(480, 60));          //North panel that holds the header
        jTop.setBackground(Color.white);
        frame.add(jTop, "North");
        jTop.add(header);

        //South
        JButton submitButton = new JButton("Submit");                         //Creating the button for submitting the car information
        submitButton.setFont(new Font("Serif", Font.BOLD, 14));
        submitButton.setPreferredSize(new Dimension(100,28));

        JButton previewButton = new JButton("View Available Cars");
        previewButton.setFont(new Font("Serif", Font.BOLD, 14));
        previewButton.setPreferredSize(new Dimension(180,28));

        frame.add(jBottom, "South");
        jBottom.setPreferredSize(new Dimension(540, 37));       //Setting the dimensions of the south panel
        jBottom.setBackground(Color.white);

        jBottom.setLayout(new FlowLayout(FlowLayout.RIGHT));                //Setting the layout for the south to panel to add the button to submit all the info
        jBottom.add(previewButton);
        jBottom.add(submitButton);



        //  Center/Main

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraint1 = new GridBagConstraints();

        mainPanel.setBackground(Color.white);

        JLabel ownerName = new JLabel("Name");
        ownerName.setFont(new Font("Serif", Font.PLAIN, 17));

        constraint1.ipadx=3;                                        //Creates space to the left and right of the text
        constraint1.ipady=4;
        constraint1.gridx=0;                                        //Sets the column and row location
        constraint1.gridy=0;
        constraint1.fill = GridBagConstraints.HORIZONTAL;           //Fills out the remaining space in the cell
        mainPanel.add(ownerName, constraint1);                      //Adding the text with the constraints set above

        GridBagConstraints constraint2 = new GridBagConstraints();  //Setting up a new constraint object for the second item in the grid
        constraint2.ipadx=3;
        constraint2.gridx=1;
        constraint2.gridy=0;
        constraint2.fill = GridBagConstraints.HORIZONTAL;
        TextField ownNAME = new TextField((20));                    //Creating a text field object so we can get the text later on
        mainPanel.add(ownNAME,constraint2);

        JLabel ownerID = new JLabel("ID");
        ownerID.setFont(new Font("Serif", Font.PLAIN, 17));
        GridBagConstraints constraint3 = new GridBagConstraints();
        constraint3.ipadx=3;
        constraint3.ipady=4;
        constraint3.gridx=0;
        constraint3.gridy=1;
        constraint3.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(ownerID, constraint3);

        GridBagConstraints constraint4 = new GridBagConstraints();
        constraint4.ipadx=3;
        constraint4.gridx=1;
        constraint4.gridy=1;
        constraint4.fill = GridBagConstraints.HORIZONTAL;
        TextField ownID= new TextField((20));
        mainPanel.add(ownID,constraint4);

        JLabel carVIN = new JLabel("Car VIN Number");
        carVIN.setFont(new Font("Serif", Font.PLAIN, 17));
        GridBagConstraints constraint5 = new GridBagConstraints();
        constraint5.ipadx=3;
        constraint5.ipady=4;
        constraint5.gridx=0;
        constraint5.gridy=2;
        constraint5.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(carVIN, constraint5);

        GridBagConstraints constraint6 = new GridBagConstraints();
        constraint6.ipadx=3;
        constraint6.gridx=1;
        constraint6.gridy=2;
        constraint6.fill = GridBagConstraints.HORIZONTAL;
        TextField carVinNum = new TextField((20));
        mainPanel.add(carVinNum,constraint6);

        JLabel carBrand = new JLabel("Car Brand");
        carBrand.setFont(new Font("Serif", Font.PLAIN, 17));
        GridBagConstraints constraint7 = new GridBagConstraints();
        constraint7.ipadx=3;
        constraint7.ipady=4;
        constraint7.gridx=0;
        constraint7.gridy=3;
        constraint7.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(carBrand, constraint7);

        GridBagConstraints constraint8 = new GridBagConstraints();
        constraint8.ipadx=3;
        constraint8.gridx=1;
        constraint8.gridy=3;
        constraint8.fill = GridBagConstraints.HORIZONTAL;
        TextField carBRAND = new TextField((20));
        mainPanel.add(carBRAND,constraint8);

        JLabel carMiles = new JLabel("Number of Miles");
        carMiles.setFont(new Font("Serif", Font.PLAIN, 17));
        GridBagConstraints constraint9 = new GridBagConstraints();
        constraint9.ipadx=3;
        constraint9.ipady=4;
        constraint9.gridx=0;
        constraint9.gridy=4;
        constraint9.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(carMiles, constraint9);

        GridBagConstraints constraint10 = new GridBagConstraints();
        constraint10.ipadx=3;
        constraint10.gridx=1;
        constraint10.gridy=4;
        constraint10.fill = GridBagConstraints.HORIZONTAL;
        TextField numMILES = new TextField((20));
        mainPanel.add(numMILES,constraint10);

        JLabel pricePerDay = new JLabel("Renting Price/Day");
        pricePerDay.setFont(new Font("Serif", Font.PLAIN, 17));
        GridBagConstraints constraint11 = new GridBagConstraints();
        constraint11.ipadx=3;
        constraint11.ipady=4;
        constraint11.gridx=0;
        constraint11.gridy=5;
        constraint11.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(pricePerDay, constraint11);

        GridBagConstraints constraint12 = new GridBagConstraints();
        constraint12.ipadx=3;
        constraint12.gridx=1;
        constraint12.gridy=5;
        constraint12.fill = GridBagConstraints.HORIZONTAL;
        TextField pPD = new TextField((20));
        mainPanel.add(pPD,constraint12);

        frame.add(mainPanel, "Center");


        submitButton.addActionListener(new ActionListener() {                     //Creating button functionality
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = ownNAME.getText();
                int id = 0;
                int vin = 0;
                String brand = carBRAND.getText();
                int mile =0;
                int price =0;

                try {
                    id = Integer.parseInt(ownID.getText().trim());
                    vin=Integer.parseInt(carVinNum.getText().trim());
                    mile = Integer.parseInt(numMILES.getText().trim());
                    price = Integer.parseInt(pPD.getText().trim());
                } catch(Exception _) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter valid numbers for ID, VIN, miles, and price.",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                JDBC.inserter(name,id,vin,brand, mile, price);
                JOptionPane.showMessageDialog(
                        frame,
                        "Successfully Registered.",
                        "Successes",
                        JOptionPane.INFORMATION_MESSAGE
                );

            }
        });

        previewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.main();

            }
        });


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        
    }
}
