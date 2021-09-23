/*
Abid Talukder
APCS 
pd 9 
9/23/21
*/

public class CtoFTester{

    public static double celsiusToFahrenheit(double temp){
        return 1.8*temp + 32;
    }

    public static double fahrenheitToCelsius(double temp){
        return (temp-32)/1.8;
    }

    public static void main(String[] args) {
        System.out.print("1° C : ");
        System.out.print(celsiusToFahrenheit(1));
        System.out.println("°F");
        System.out.print("1° F : ");
        System.out.print(fahrenheitToCelsius(1));
        System.out.println("°C");
    }
}