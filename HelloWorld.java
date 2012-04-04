import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloWorld extends JFrame{

class ButtonEvent implements ActionListener{
public void actionPerformed(ActionEvent e){
System.exit(0);
}
}


HelloWorld(String titel){
super(titel);

setLayout(new BorderLayout());

JButton hi=new JButton("Ohai back");
add(hi, BorderLayout.SOUTH);

JLabel hello=new JLabel("Hello World!");
add(hello, BorderLayout.NORTH);

hi.addActionListener(new ButtonEvent());
}


public static void main(String[] args){
HelloWorld wnd= new HelloWorld("Haaiiii");
wnd.setResizable(false);
wnd.pack();
wnd.setVisible(true);
}

}