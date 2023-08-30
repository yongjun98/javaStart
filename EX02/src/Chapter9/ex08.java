package Chapter9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
class NorthPanel extends JPanel{
    public NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class CenterPanel extends JPanel{
    public CenterPanel(){
        setLayout(null);
        for(int i =0; i<20; i++){
            int x = (int) (Math.random()*250);
            int y = (int) (Math.random()*250);
            JLabel label = new JLabel("*");
            label.setForeground(Color.RED);
            label.setLocation(x,y);
            label.setSize(20,20);
            label.setOpaque(true);
            add(label);
        }
    }
}
class SouthPanel extends JPanel{
    public SouthPanel(){
        setBackground(Color.YELLOW);
        add(new JButton("Integer Input"));
        add(new TextField(15));
    }
}
public class ex08 extends JFrame {
     ex08(){
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NorthPanel nPanel = new NorthPanel();
        CenterPanel nCenter = new CenterPanel();
        SouthPanel nSouth = new SouthPanel();
        add(nPanel, BorderLayout.NORTH);
        add(nCenter, BorderLayout.CENTER);
        add(nSouth, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex08();
    }
}
