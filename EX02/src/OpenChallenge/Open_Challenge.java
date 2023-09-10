package OpenChallenge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Open_Challenge extends JFrame {
    JLabel first,second,third, sameText;
    Open_Challenge(){
        setTitle("Open Challenge 10"); // 제목 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);


        setLayout(null); // 배치관리자 없음
        addKeyListener(new MyKeyAdapter());

        first = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
        second = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
        third = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
        sameText = new JLabel("시작합니다.",SwingConstants.CENTER);

        first.setBackground(Color.PINK);
        first.setSize(100,50);
        first.setLocation(40,80);
        first.setFont(new Font("Arial",Font.PLAIN,30));
        first.setOpaque(true);

        second.setBackground(Color.PINK);
        second.setSize(100,50);
        second.setLocation(180,80);
        second.setFont(new Font("Arial",Font.PLAIN,30));
        second.setOpaque(true);

        third.setBackground(Color.PINK);
        third.setSize(100,50);
        third.setLocation(320,80);
        third.setFont(new Font("Arial",Font.PLAIN,30));
        third.setOpaque(true);

        sameText.setSize(300,50);
        sameText.setLocation(80,150);


        add(first);
        add(second);
        add(third);
        add(sameText);

        setVisible(true);
        requestFocus();
        // 포커스 설정
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Open_Challenge();
    }

    class MyKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyChar() == '\n') {
                first.setText((int)(Math.random()*5)+"");
                second.setText((int)(Math.random()*5)+"");
                third.setText((int)(Math.random()*5)+"");
                if(first.getText().equals(second.getText())) {
                    if(second.getText().equals(third.getText()))
                        sameText.setText("축하합니다.");
                    else
                        sameText.setText("아쉽군요");
                }
                else
                    sameText.setText("아쉽군요");


            }
        }
    }
}
