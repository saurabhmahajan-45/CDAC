import java.util.Scanner;

class Ternary21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number: ");
        int day = sc.nextInt();

        String result = (day == 1) ? "Day is Monday"
                       : (day == 2) ? "Day is Tuesday"
                       : (day == 3) ? "Day is Wednesday"
                       : (day == 4) ? "Day is Thursday"
                       : (day == 5) ? "Day is Friday"
                       : (day == 6) ? "Day is Saturday"
                       : (day == 7) ? "Day is Sunday"
                       : "Invalid day number!";

        System.out.println(result);
    }
}
