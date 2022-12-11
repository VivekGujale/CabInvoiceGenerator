package org.example.CabInvoiceGenerator;

public class InvoiceFactory {

    //Method for getting instance of invoice object
    public static IInvoice getInvoiceInstance() {
        return new Invoice();
    }

}
