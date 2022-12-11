package org.example.CabInvoiceGenerator;

public interface IInvoice {

    //for single ride
    double calculateFare(double distance, double time);

    //for multiple rides
    double calculateFare(Ride[] rides);


}
