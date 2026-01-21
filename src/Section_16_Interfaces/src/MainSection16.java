package Section_16_Interfaces.src;

import Section_16_Interfaces.src.EX01.Entities.CarRental;
import Section_16_Interfaces.src.EX01.Entities.Locacao;
import Section_16_Interfaces.src.EX01.Entities.Vehicle;
import Section_16_Interfaces.src.EX01.Services.BrazilTaxService;
import Section_16_Interfaces.src.EX01.Services.RentalService;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainSection16 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Ex01 - 172 - solução com Classe unica locação.
        /*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime pickupLocalDateTime = LocalDateTime.parse(sc.nextLine(),dtf);
        Instant pickupInstant = pickupLocalDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime returnLocalDateTime = LocalDateTime.parse(sc.nextLine(),dtf);
        Instant returnInstant = returnLocalDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.print("Enter price per hour: ");
        Double priceHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        Double priceDay = sc.nextDouble();

        Locacao locacao = new Locacao(carModel, pickupInstant, returnInstant, priceHour, priceDay);

        System.out.println(locacao);*/

        //Ex01 - 172 - solução com interface e desaclopação.
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime pickupLocalDateTime = LocalDateTime.parse(sc.nextLine(),dtf);
        Instant pickupInstant = pickupLocalDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime returnLocalDateTime = LocalDateTime.parse(sc.nextLine(),dtf);
        Instant returnInstant = returnLocalDateTime.atZone(ZoneId.systemDefault()).toInstant();
        System.out.print("Enter price per hour: ");
        BigDecimal priceHour = new BigDecimal(sc.nextLine());
        System.out.print("Enter price per day: ");
        BigDecimal priceDay = new BigDecimal(sc.nextLine());


        CarRental carRental = new CarRental(pickupInstant, returnInstant,new Vehicle(carModel));

        RentalService rentalService = new RentalService(priceHour, priceDay,new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoiceString());

    }
}
