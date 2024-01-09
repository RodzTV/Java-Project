import java.util.Scanner;

public class tryinghard {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Where are you now?");
        String place = scanner.nextLine();
        
        System.out.println("hello " +name+ " are you " +age+ " years Old " );
        System.out.println("I see that you are at "+place+" ");
        
    }
    
}