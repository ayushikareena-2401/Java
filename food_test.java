import java.awt.*;
import java.awt.event.*;
public class food_test extends Frame implements 
ActionListener {
 String x,y,z;
 Button s;
 TextField tf,lf,d;
food_test() {
 Label fruitName = new Label("Fruit Name.");
 fruitName.setBounds(20,50,80,20);
 Label outerCol = new Label("Outer col.");
 outerCol.setBounds(20,80,80,20);
 Label innerCol = new Label("Inner col.");
 innerCol.setBounds(20,110,80,20);
 tf = new TextField();
 tf.setBounds(120,50,100,20);
 
 lf =new TextField();
 lf.setBounds(120,80,100,20);
 
 d = new TextField();
 d.setBounds(120,110,100,20);
 
 s = new Button("Submit.");
 s.setBounds(20,160,100,30);
 Button r = new Button("Reset.");
 r.setBounds(120,160,100,30);
 s.addActionListener(this);
 r.addActionListener(this);
 add(fruitName);
 add(outerCol);
 add(innerCol);
 add(tf);
 add(lf);
 add(d);
 add(s);
 add(r);
 setSize(300,300);
 setLayout(null);
 setVisible(true);
}
public void actionPerformed(ActionEvent e){
 x=tf.getText();
 y=lf.getText();
 z=d.getText();
 if(e.getSource()== s){
 switch(x){
 case "Apple":
 if(y=="Red" && z=="White"){
 System.out.println("It is Edible!");
 }
 else{
 System.out.println("Not Edible!");
 }
 break;
 case "Orange":
 if(y=="Orange" && z=="Orange"){
 System.out.println("It is Edible!");
 }
 else{
 System.out.println("Not Edible!");
 }
 break;
 case "Banana":
 if(y=="Yellow" && z=="White"){
 System.out.println("It is Edible!");
 }
 else{
 System.out.println("Not Edible!");
 }
 break;
 }
}
 
}
public static void main(String[] args) {
 new food_test();
}
}
