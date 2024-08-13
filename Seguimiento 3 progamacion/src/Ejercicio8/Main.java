package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Concert c1 = new Concert(5, 3);


        System.out.println("Selling Tickets...");

        c1.sellTicket("GENERAL", 500);
        c1.sellTicket("GENERAL", 500);
        c1.sellTicket("VIP", 1000);
        c1.sellTicket("VIP", 1000);
        c1.sellTicket("VIP", 1000);


        c1.sellTicket("GENERAL", 500);
        c1.sellTicket("GENERAL", 500);
        c1.sellTicket("GENERAL", 500);
        c1.sellTicket("VIP", 1000);


        System.out.println("Checking in Tickets...");

        c1.checkInTicket("GENERAL", 1);
        c1.checkInTicket("VIP", 2);
        c1.checkInTicket("VIP", 4);


        c1.checkInTicket("GENERAL", 6);
    }
}

