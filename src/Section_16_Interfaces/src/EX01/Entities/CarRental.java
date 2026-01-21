package Section_16_Interfaces.src.EX01.Entities;

import java.time.Instant;

public class CarRental {

    private Instant start;
    private Instant finish;

    private Invoice invoice;
    private Vehicle vehicle;

    public CarRental() {
    }

    public CarRental(Instant start, Instant finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public CarRental(Instant start, Instant finish, Vehicle vehicle, Invoice invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }

    public Instant getStart() {
        return start;
    }

    public Instant getFinish() {
        return finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("INVOICE: ");
        sb.append(String.format("%nBasic payment: %.2f%n", getInvoice().getBasicPayment()));
        sb.append(String.format("tax: %.2f%n", getInvoice().getTax()));
        sb.append(String.format("Total payment: %.2f%n", getInvoice().getTotalPayment()));
        return sb.toString();
    }*/

    public String getInvoiceString(){
        StringBuilder sb = new StringBuilder("INVOICE: ");
        sb.append(String.format("%nBasic payment: %.2f%n", getInvoice().getBasicPayment()));
        sb.append(String.format("tax: %.2f%n", getInvoice().getTax()));
        sb.append(String.format("Total payment: %.2f%n", getInvoice().getTotalPayment()));
        return sb.toString();
    }
}
