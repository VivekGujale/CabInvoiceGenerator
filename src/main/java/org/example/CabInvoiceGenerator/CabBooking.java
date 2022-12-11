package org.example.CabInvoiceGenerator;

public class CabBooking {

    //Method for calculating fare
    public double calculateRideFare(double distance, double time) {
        IInvoice iInvoice = InvoiceFactory.getInvoiceInstance();
        return iInvoice.calculateFare(distance, time);
    }
}
