import java.util.Scanner; 
public class day {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y =x%7;
        switch(y)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 0:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("enter correct number");
        }
    }
}