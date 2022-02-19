import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meters, miles, feet, inches;
        System.out.println("Convert a distance in meters to miles, feet, and inches: ");
        meters = in.nextDouble();

        if (meters > 0)
        {
            {
                // meters ~ miles
                miles = meters / 1609.344;
                System.out.println("Miles:" + miles);

            }
            { // meters ~ feet
                feet = meters * 3.280839895;
                System.out.println("Feet: " + feet);
            }
            { // meters ~ inches
                inches = meters / 0.0254;
                System.out.println("Inches: " + inches);
            }
        }
        else
        {
            System.out.println("Input a positive number!!");
        }

    }
}
