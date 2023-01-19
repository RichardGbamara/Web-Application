import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double currentSalary;
        int rating;
        double raise;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating: ");

        rating = scan.nextInt();

        if (rating == 1)
            raise = 1.5 / 100 * currentSalary;
        else if (rating == 2)
            raise = 4.0 / 100 * currentSalary;
        else if (rating == 3)
            raise = 6.0 / 100 * currentSalary;
        else
            raise = 0;

        System.out.println("Amount of your raise: $" + raise);
        System.out.println("Your new salary: $" + (currentSalary + raise));

    }
}