import java.util.Scanner;

class SeasonCheck26{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("Season is Winter");
                break;

            case 3: case 4: case 5:
                System.out.println("Season is Summer");
                break;

            case 6: case 7: case 8:
                System.out.println("Season is Monsoon");
                break;

            case 9: case 10: case 11:
                System.out.println("Season is Autumn");
                break;

            default:
                System.out.println("Invalid month number! Enter 1 to 12.");
        }
    }
}
