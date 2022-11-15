import java.awt.*;
import javax.swing.*;
public class Parabel extends JFrame {
   private int a,b,c; 
   public Parabel(int a1,int b1,int c1) {
       a = a1;
       b = b1;
       c = c1; 
       setLocation(300, 300);
       setSize(500, 500);
       setTitle("Parabel");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
   }
   public void paint(Graphics g) {
       double xold=0, yold=0;
       g.setColor(Color.black);
       g.drawLine(0,250,500,250);
       g.drawLine(250,0,250,500);
       g.translate(250,250);
       double y=0;
       final int pixel=50;
       g.setColor(Color.blue);
       for(double x=-50;x<=50;x+=.1) {
           y=a*x*x+b*x+c; 
           y*=-1;
           if(x==-50) {
               xold=x;
               yold=y;
           }         
           g.drawLine((int)(xold*pixel),(int)(yold*pixel),(int)(x*pixel),(int)(y*pixel)); 
           xold=x; 
           yold=y; 
       } 
   }    
   public static void main(String[] args) { 
      Parabel p1 = new Parabel(3,-5,2); 
   } 
}

