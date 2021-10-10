package Java;

import java.time.YearMonth;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123", "email@email.com", "123"), "Chevrolet", "Spark");
    uberX.setPassenger(4);
    uberX.printDataCar();

    // Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876", "email@email.com", "123"));
    // car2.passenger = 3;
    // System.out.println("Car2 License " + car2.license);
    // car2.printDataCar();

    // Card card = new Card(123456, "415412341234", "123", YearMonth.of(2022, 6));
    // System.out.println("Card number " + card.number);
  }
  
}