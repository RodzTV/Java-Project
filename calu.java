import java.util.Scanner;
public class calu {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("input the valau of a");
        a = sc.nextDouble();

        System.out.println("input the valau of b");
        b = sc.nextDouble();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("the valua of c is : "+c);

        sc.close();
    }
}