import java.util.Scanner;

 public class MAIN {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       double pi = 3.1416;
       double r;
       double total;

       
       System.out.println("Enter the radius of a circle: ");
       r = sc.nextDouble();

       total = r * pi;

       System.out.println("the area is "+total);
       

    }
 } 