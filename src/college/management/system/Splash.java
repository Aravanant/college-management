package college.management.system;

import javax.swing.*; // for Jframe
import java.awt.*;   // for image

public class Splash extends JFrame implements Runnable
{ 
    Thread t;
 Splash()                       // constructor
 {  ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/first1.jpg"));
    Image i2=i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
    ImageIcon i3= new ImageIcon(i2);
    JLabel image= new JLabel(i3);
    add(image);

    t=new Thread(this);
    t.start();


    setVisible(true); 
    int x=1;
    for(int i=2;i<=580;i+=4,x+=1)            // to open display animatically
   { 
    setLocation(580-((i+x)/2),350-(i/2));         
     setSize(i+3*x,i+x/2);   // to set the size of display window for application
    
                // to pause code run for milliseconds using thread
     try                      
     {
       Thread.sleep(10);
     }catch(Exception e) {}
   }
    
 } 
 public void run()   // to override abstract method 'run' present in 'Runnable'
 {
   try
   {
     Thread.sleep(7000);
     setVisible(false);

     // next frame
     new Login(); // class constructor  to display login frame
   }catch(Exception e) {

   }
 }
    public static void main(String[] args) {
        new Splash();                            // class object
    }
}