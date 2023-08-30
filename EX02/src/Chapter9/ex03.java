package Chapter9;

import javax.swing.*;
import java.awt.*;

public class ex03 extends JFrame {
    ex03(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BorderLayout Practice");
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));

        for(int i=0; i<10; i++){
            c.add(new JButton(Integer.toString(i)));
        }
        setSize(600,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex03();
    }
}
