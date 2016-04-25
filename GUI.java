import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class GUI extends Frame implements ActionListener{
private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
private JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
private JButton button;

public GUI(){
label1=new JLabel("first number");
label2=new JLabel("second number");
label3=new JLabel("thired number");
label4=new JLabel("forth number");
label5=new JLabel("fifth number");
label6=new JLabel("sixth number");
label7=new JLabel("seventh number");
label8=new JLabel("eighth number");
label9=new JLabel("ninth number");
label10=new JLabel("tenth number");
txt1=new JTextField();
txt2=new JTextField();
txt3=new JTextField();
txt4=new JTextField();
txt5=new JTextField();
txt6=new JTextField();
txt7=new JTextField();
txt8=new JTextField();
txt9=new JTextField();
txt10=new JTextField();
button=new JButton("turn in");
setLayout(new GridLayout(11,2));
add(label1);
add(txt1);
add(label2);
add(txt2);
add(label3);
add(txt3);
add(label4);
add(txt4);
add(label5);
add(txt5);
add(label6);
add(txt6);
add(label7);
add(txt7);
add(label8);
add(txt8);
add(label9);
add(txt9);
add(label10);
add(txt10);
add(button);

button.addActionListener(this);

setVisible(true);
setSize(new Dimension(500,500));

}

@Override
public void actionPerformed(java.awt.event.ActionEvent e) {
	// TODO Auto-generated method stub
	int s1=Integer.parseInt(txt1.getText());
	int s2=Integer.parseInt(txt2.getText());
	int s3=Integer.parseInt(txt3.getText());
	int s4=Integer.parseInt(txt4.getText());
	int s5=Integer.parseInt(txt5.getText());
	int s6=Integer.parseInt(txt6.getText());
	int s7=Integer.parseInt(txt7.getText());
	int s8=Integer.parseInt(txt8.getText());
	int s9=Integer.parseInt(txt9.getText());
	int s10=Integer.parseInt(txt10.getText());
	int [] array= new int[10];
	array[0]=s1;
	array[1]=s2;
	array[2]=s3;
	array[3]=s4;
	array[4]=s5;
	array[5]=s6;
	array[6]=s7;
	array[7]=s8;
	array[8]=s9;
	array[9]=s10;
	Arrays.sort(array);
	JOptionPane.showMessageDialog(null,"the number from small to large is : " + array[0]+"  "+ array[1]+"  "+ array[2]+"  "+ array[3]+"  "+ array[4]+"  "+ array[5]+"  "
	+ array[6]+"  "+ array[7]+"  "+ array[8]+"  "+ array[9]);
}
}