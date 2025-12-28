import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.*;
import java.util.List;


public class list {
    public static void main(){
        JFrame list = new JFrame();

        list.setResizable(false);
        list.setTitle("List of Cars");
        list.setLayout(new BorderLayout());
        list.setSize(480,300);


        JLabel header = new JLabel("Available Cars");               //Creating the header and setting the font below
        header.setFont(new Font("Serif", Font.PLAIN, 24));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        list.add(header,"North");


        String[] columnNames = {"VIN","Model","Miles","Price","Owner ID"};
        DefaultTableModel table = new DefaultTableModel(columnNames, 0 );


        List<String[]> carsData =JDBC.requester();
        for (String[] car : carsData) {
            table.addRow(car);
        }

        JTable carTable = new JTable(table);

        JScrollPane scroller = new JScrollPane(carTable);
        list.add(scroller,BorderLayout.CENTER);

        list.setLocationRelativeTo(null);
        list.setVisible(true);

    }

}
