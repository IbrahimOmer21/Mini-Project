import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Random Ass button");
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        panel.setBounds(0,0,250,250);
        panel.setBackground(Color.BLUE);

        button.setBounds(150,125,200,200);

        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Wagwan babes");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        
        frame.setLocationRelativeTo(null);        
        
        frame.setVisible(true);

        
    }
}
