package Section_16_Interfaces.src;

import Section_16_Interfaces.src.EX01.Entities.CarRental;
import Section_16_Interfaces.src.EX01.Entities.Locacao;
import Section_16_Interfaces.src.EX01.Entities.Vehicle;
import Section_16_Interfaces.src.EX01.Services.BrazilTaxService;
import Section_16_Interfaces.src.EX01.Services.RentalService;
import Section_16_Interfaces.src.EX02.Entities.Contract;
import Section_16_Interfaces.src.EX02.Entities.Installment;
import Section_16_Interfaces.src.EX02.Services.ContractService;
import Section_16_Interfaces.src.EX02.Services.PayPalPaymentGateway;
import Section_16_Interfaces.src.EX02.Services.PaymentGateway;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
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
        BigDecimal priceHour = new BigDecimal(sc.nextLine());
        System.out.print("Enter price per day: ");
        BigDecimal priceDay = new BigDecimal(sc.nextLine());


        CarRental carRental = new CarRental(pickupInstant, returnInstant,new Vehicle(carModel));

        RentalService rentalService = new RentalService(priceHour, priceDay,new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoiceString());*/

        //EX02
        DateTimeFormatter dtfmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int contractNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(),dtfmt);
        System.out.print("Valor do contrato: ");
        BigDecimal contractValue = BigDecimal.valueOf(sc.nextDouble());
        System.out.print("Entre com o número de parcelas: ");
        int installmentCount = sc.nextInt();

        Contract contract = new Contract(contractNumber,contractDate,contractValue,installmentCount);

        ContractService contractService = new ContractService(new PayPalPaymentGateway());

        contractService.buildInstallments(contract);

        contractService.printInstallments(contract.getInstallments());



    }
}
