public class Bicyclists
{
//Gear size(inches) * PI * (ft/inches) * (mile/ft) * cadence * (min/hour) = speed
//we are given gear size = 100 & cadence = 90 rpm
     public static void main(String[] args)
    {
        double gearSize = 50;
        double cadence = 90;
        double speed = gearSize * 3.14 * (1.0/12.0) * (1.0/5280.0) * cadence * 60.0;

        System.out.println(speed + " mph");

        double test = 1.0 / 12.0;
        System.out.println(test);

        System.out.println(5 + 5.0);
    }
}
