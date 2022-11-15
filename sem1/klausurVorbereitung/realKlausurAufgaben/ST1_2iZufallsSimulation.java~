import java.util.*;         
public class ST1_2iZufallsSimulation {
    
    public static final int ROWS= 1000;
    public static final int RANDmax= 10;
    
    public static void main(String[] args) {
        int bigger5= 0;
        Random r= new Random();
        for (int i= 0; i<= ROWS; i++) {
            int temp= r.nextInt(RANDmax);
            if (RANDmax/2 < temp) {
                bigger5++;
            }
        }
        System.out.println("r(n)>5: " +bigger5 +"\nr(n)<=5: "+(ROWS-bigger5)); 
    }
}