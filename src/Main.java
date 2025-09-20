import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            double Summer, Sping, Fall, Winter, totalYearly;
        System.out.printf("What was your maintence cost for the summer? $");
        Scanner input = new Scanner(System.in);
        Summer = input.nextDouble();
        System.out.printf("What was your maintence cost for the sping? $");
        Sping = input.nextDouble();
        System.out.printf("What was your maintence cost for the fall? $");
        Fall = input.nextDouble();
        System.out.printf("What was your maintence cost for the winter? $");
        Winter = input.nextDouble();
        totalYearly = Summer + Sping + Fall + Winter;
        System.out.printf("Your yearly maintence cost: $" + totalYearly);

    }
}