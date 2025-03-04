import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Kelvin to Celsius");

        int choice = scanner.nextInt();

        System.out.println("Enter the temperature value:");
        double value = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println(value + "°C is " + celsiusToFahrenheit(value) + "°F");
                break;
            case 2:
                System.out.println(value + "°C is " + celsiusToKelvin(value) + "K");
                break;
            case 3:
                System.out.println(value + "°F is " + fahrenheitToCelsius(value) + "°C");
                break;
            case 4:
                System.out.println(value + "K is " + kelvinToCelsius(value) + "°C");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}


