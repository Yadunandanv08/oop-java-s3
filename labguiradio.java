import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class labguiradio extends JFrame implements ActionListener{
    JFrame f=new JFrame("frame");
    JRadioButton b1= new JRadioButton("bit 1");
    JRadioButton b0= new JRadioButton("bit 0");
    JButton bb=new JButton("press");
    JTextField t=new JTextField("0");
    labguiradio(){
      f.add(b1);
      f.add(b0);
      f.add(bb);
      f.add(t);
      f.setBounds(200,200,200,200);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setVisible(true);
      bb.addActionListener(this);
      b0.addActionListener(this);
      b1.addActionListener(this);
      bb.setBounds(40,40,40,40);
      f.setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==bb){
                if(b0.isSelected()){
                    if(b1.isSelected()){
                        t.setText("3");
                    }
                    else{
                        t.setText("1");
                    }
                }
                else{
                    if(b1.isSelected()){
                        t.setText("2");
                    }
                }
            }
  
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    public static void main(String args[]){
        new labguiradio();
    }
    
}
