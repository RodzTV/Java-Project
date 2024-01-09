/**
 * accept
 */
public class accept {

    public static void main(String[] args) throws Exception{

        int age = 70;

        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else if (age>=70) {
            System.out.println("you are too old right now!!!");
        }
        else 
        {
            throw new Exception("Sorry, you are not eligible to vote yet");
        }

    }  
}