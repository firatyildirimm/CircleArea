import java.util.Scanner;

/**
 * @author Fırat YILDIRIM
 * @since 21.12.2021
 */
public class Main {

    public static void main(String[] args) {

        double r, alfa, pi=3.14, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        r = input.nextDouble();
        System.out.print("Enter the angle of circle : ");
        alfa = input.nextDouble();
        area = (pi*r*r*alfa)/360;


        System.out.println("Area : " + area);

    }
}
