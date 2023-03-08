import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0, i=1;
        while(i<=num/2) {
            if(num%i == 0) {
                sum = sum + i;                     //Calculating the sum of Factors
                System.out.print(sum+ ",");
            }
            i++;                                   //After each iteration value of i will increment
        }
        System.out.println();
        if(sum==num) {
            System.out.println(num+": is a Perfect Number");
        }
        else
            System.out.print(num+": is not a Perfect Number");
    }
}
