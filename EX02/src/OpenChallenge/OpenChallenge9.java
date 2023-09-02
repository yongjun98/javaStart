package OpenChallenge;

import javax.swing.*;
import java.awt.*;

public class OpenChallenge9 extends JFrame {
    OpenChallenge9(){
        setTitle("OpenChallenge9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        c.add(new NorthPanel(),BorderLayout.NORTH);
        c.add(new CenterPanel(),BorderLayout.CENTER);

        setSize(400,500);
        setVisible(true);
    }
}
class NorthPanel extends JPanel{
     NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());
        this.add(new JButton("Open"));
        this.add(new JButton("Read"));
        this.add(new JButton("Close"));
    }
}
class CenterPanel extends JPanel{
    CenterPanel(){
        this.setLayout(null);
        String text[] = {"Hello","Java","Love"};
        setLayout(null);
        int x,y;
        for(int i=0; i<text.length; i++){
            x = (int) (Math.random()*350);
            y = (int) (Math.random()*450);
            JLabel label = new JLabel(text[i]);
            label.setLocation(x,y);
            label.setSize(50,10);
            this.add(label);
        }
    }
    public static void main(String[] args) {
        new OpenChallenge9();
    }
}
