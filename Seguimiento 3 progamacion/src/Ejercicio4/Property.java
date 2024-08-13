package Ejercicio4;

public class Property {

        private String propertyId;
        private String address;
        private double area;
        private double price;
        private int numberOfRooms;
        private int numberOfBathrooms;
        private boolean hasGarage;
        private String status;


        public Property(String propertyId, String address, double area, double price, int numberOfRooms, int numberOfBathrooms, boolean hasGarage, String status) {
            this.propertyId = propertyId;
            this.address = address;
            this.area = area;
            this.price = price;
            this.numberOfRooms = numberOfRooms;
            this.numberOfBathrooms = numberOfBathrooms;
            this.hasGarage = hasGarage;
            this.status = status;
        }


        public String getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(String propertyId) {
            this.propertyId = propertyId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public void setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        public int getNumberOfBathrooms() {
            return numberOfBathrooms;
        }

        public void setNumberOfBathrooms(int numberOfBathrooms) {
            this.numberOfBathrooms = numberOfBathrooms;
        }

        public boolean isHasGarage() {
            return hasGarage;
        }

        public void setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }


        public void showDetails() {
            System.out.println("Property ID: " + propertyId);
            System.out.println("Address: " + address);
            System.out.println("Area: " + area + " m²");
            System.out.println("Price: $" + price);
            System.out.println("Rooms: " + numberOfRooms);
            System.out.println("Bathrooms: " + numberOfBathrooms);
            System.out.println("Garage: " + (hasGarage ? "Yes" : "No"));
            System.out.println("Status: " + status);
            System.out.println("-----------------------------------");
        }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId='" + propertyId + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", hasGarage=" + hasGarage +
                ", status='" + status + '\'' +
                '}';
    }
}


