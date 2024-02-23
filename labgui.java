import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class labgui extends JFrame implements ActionListener{
  JFrame f=new JFrame("labgui");
  JButton imp=new JButton("import");
  JButton calc=new JButton("calculate");
  JTextArea l=new JTextArea("contents",15,15);
  JLabel m=new JLabel("marks");
  JTextField name= new JTextField("name");
  JTextField rollno= new JTextField("rollno");
  JTextField mark1= new JTextField("mark1");
  JTextField mark2= new JTextField("mark2");


  labgui(){
   f.add(imp);
   f.add(calc);
   f.add(l);
   f.add(m);
   f.add(name);
   f.add(rollno);
   f.add(mark1);
   f.add(mark2);
   f.setSize(200,200);
   f.setDefaultCloseOperation(EXIT_ON_CLOSE);
   f.setLayout(new FlowLayout());
   imp.addActionListener(this);
   calc.addActionListener(this);
   f.setVisible(true);
   l.setSize(50,50);
   m.setSize(50,50);
   name.setSize(50,50);
   mark1.setSize(50,50);

    
}

public void actionPerformed(ActionEvent e){
   try{
    if(e.getSource()==imp){
      File file= new File("det.txt");
      FileWriter writer=new FileWriter(file);
      writer.write("===========================\n");
      writer.write("name \troolno \tmark1 \tmark2 \t \n");
      writer.write(name.getText()+"\t");
      writer.write(rollno.getText()+"\t");
      writer.write(mark1.getText()+"\t");
      writer.write(mark2.getText()+"\t");
      writer.close();
      FileReader reader= new FileReader(file);
      int i;
      StringBuilder sb= new StringBuilder();
      while((i=reader.read())!=-1){
            sb.append((char)i);
      }
      reader.close();
      String str=sb.toString();
      l.setText(str);
    }
    else if(e.getSource()==calc){
      String str=l.getText();
      String[] k=str.split("\\t");
      int x=Integer.parseInt(k[6]);
      int y=Integer.parseInt(k[7]);
      int sum=x+y;
      String total=String.valueOf(sum);
      m.setText(total);
    }
  
    }catch(Exception a){
    a.printStackTrace();
  }
}
    public static void main(String args[]){
        new labgui();  
    }
}
