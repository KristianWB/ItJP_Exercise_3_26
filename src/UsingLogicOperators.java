import java.util.Scanner;

public class UsingLogicOperators {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter an integer: "
        );
        int choice = input.nextInt();

        if (choice % 4 == 0 && choice % 5 == 0)
            System.out.print(
                    "The integer is divisible by both 4 and 5"
            );
        else if (choice % 4 == 0 || choice % 5 == 0)
            System.out.print(
                    "The integer is divisible by either 4 or 5"
            );
        else if (choice % 4 == 0 ^ choice % 5 == 0)
            System.out.print(
                    "The integer is divisible by either 4 or 5 but not both"
            );
        else
            System.out.print(
                    "Error!!! something went wrong... try again"
            );

    }
}
