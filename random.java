import java.util.Random;
import java.util.Scanner;
public class random 
{

    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int x = random.nextInt(100)+1; // it will generate a ramdom number from 1 to 100\
        while(true)
        {
        int y; 
        System.out.println("plz enter the number from 1 to 100\n");
        y = sc.nextInt();// it will receive the numnber from 1 to 100
            if(y == x)
            {
            System.out.println("you guessed it right");
            System.out.println("you have 50 pesos now!\n");
            break;
            }
            else if (y < x)
            {   
                System.out.println("your number is too small");
                System.out.println("plz try again!\n");
            }
            else if (y > x)
            {
                System.out.println("your number is too big");
                System.out.println("plz try again!\n");
            }
            else if (y > 100)
            {
                System.out.println("plz input number from 1 to 100");
            }
            else if (y < 0)
            {
                System.out.println("plz input number from 1 to 100");
            }
            
        }
       
        
    }
}