import java.util.Scanner;

public class HW1P2_Code {
    public static void main(String[] args) throws Exception {
        Scanner radius_input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = radius_input.nextDouble();
        while (radius <=0) {
            System.out.println("Please enter a positive number: ");
            radius = radius_input.nextDouble();
        }
        double volume = radius * radius * radius * 3.1415926 * 4 / 3;
        double surface_area = radius * radius * 3.1415926 * 4;

        System.out.println("The volume of the sphere is: " + volume + "^3");
        System.out.println("The surface area of the sphere is: " + surface_area + "^2");
        radius_input.close();
    }
}
