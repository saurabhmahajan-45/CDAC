import java.util.Scanner;

class ReverseNumber14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();
        
        int reversed = 0;
        
        while(num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit;  
            num = num / 10;  
        }
        
        System.out.println("Reversed number: " + reversed);
    }
}
