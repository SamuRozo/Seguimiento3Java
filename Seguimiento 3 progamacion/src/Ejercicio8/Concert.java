package Ejercicio8;

public class Concert {
    private int maxGeneralTickets;
    private int maxVipTickets;
    private int soldGeneralTickets;
    private int soldVipTickets;
    private Ticket[] generalTickets;
    private Ticket[] vipTickets;


    public Concert(int maxGeneralTickets, int maxVipTickets) {
        this.maxGeneralTickets = maxGeneralTickets;
        this.maxVipTickets = maxVipTickets;
        this.soldGeneralTickets = 0;
        this.soldVipTickets = 0;
        this.generalTickets = new Ticket[maxGeneralTickets];
        this.vipTickets = new Ticket[maxVipTickets];
    }


    public boolean checkAvailability(String zone) {
        if (zone.equalsIgnoreCase("GENERAL")) {
            return soldGeneralTickets < maxGeneralTickets;
        } else if (zone.equalsIgnoreCase("VIP")) {
            return soldVipTickets < maxVipTickets;
        }
        return false;
    }


    public void sellTicket(String zone, double value) {
        if (zone.equalsIgnoreCase("GENERAL")) {
            if (checkAvailability(zone)) {
                Ticket ticket = new Ticket(soldGeneralTickets + 1, zone, value);
                ticket.markAsSold();
                generalTickets[soldGeneralTickets] = ticket;
                soldGeneralTickets++;
                System.out.println("Sold General Ticket: " + ticket);
            } else {
                System.out.println("No General tickets available.");
            }
        } else if (zone.equalsIgnoreCase("VIP")) {
            if (checkAvailability(zone)) {
                Ticket ticket = new Ticket(soldVipTickets + 1, zone, value);
                ticket.markAsSold();
                vipTickets[soldVipTickets] = ticket;
                soldVipTickets++;
                System.out.println("Sold VIP Ticket: " + ticket);
            } else {
                System.out.println("No VIP tickets available.");
            }
        } else {
            System.out.println("Invalid zone specified.");
        }
    }


    public void checkInTicket(String zone, int ticketNumber) {
        if (zone.equalsIgnoreCase("GENERAL")) {
            if (ticketNumber > 0 && ticketNumber <= soldGeneralTickets) {
                generalTickets[ticketNumber - 1].markAsCheckedIn();
                System.out.println("Checked in General Ticket: " + generalTickets[ticketNumber - 1]);
            } else {
                System.out.println("Invalid General ticket number.");
            }
        } else if (zone.equalsIgnoreCase("VIP")) {
            if (ticketNumber > 0 && ticketNumber <= soldVipTickets) {
                vipTickets[ticketNumber - 1].markAsCheckedIn();
                System.out.println("Checked in VIP Ticket: " + vipTickets[ticketNumber - 1]);
            } else {
                System.out.println("Invalid VIP ticket number.");
            }
        } else {
            System.out.println("Invalid zone specified.");
        }
    }
}

