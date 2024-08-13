package Ejercicio8;

public class Ticket {
    private int ticketNumber;
    private String zone; // GENERAL, VIP
    private double value;
    private boolean isSold;
    private boolean isCheckedIn;


    public Ticket(int ticketNumber, String zone, double value) {
        this.ticketNumber = ticketNumber;
        this.zone = zone;
        this.value = value;
        this.isSold = false;
        this.isCheckedIn = false;
    }


    public void markAsSold() {
        this.isSold = true;
    }


    public void markAsCheckedIn() {
        if (this.isSold) {
            this.isCheckedIn = true;
        } else {
            System.out.println("Ticket not sold yet!");
        }
    }


    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isSold() {
        return isSold;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", zone='" + zone + '\'' +
                ", value=" + value +
                ", isSold=" + isSold +
                ", isCheckedIn=" + isCheckedIn +
                '}';
    }
}

