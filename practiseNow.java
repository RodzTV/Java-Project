import java.util.Random;

public class PractiseNow {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Generate a random index
        int randomIndex = rand.nextInt(days.length);
        String randomDay = days[randomIndex];

        // Switch statement to print the corresponding message
        switch (randomDay) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Sorry, I think there's an issue with the days");
                break;
        }
    }
}
