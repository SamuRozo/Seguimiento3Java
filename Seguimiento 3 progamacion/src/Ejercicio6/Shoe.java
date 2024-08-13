package Ejercicio6;

public class Shoe {

    private String name;
    private String material;
    private String color;
    private double price;
    private String collection;


        public Shoe(String name, String material, String color, double price, String collection) {
            this.name = name;
            this.material = material;
            this.color = color;
            this.price = price;
            this.collection = collection;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCollection() {
            return collection;
        }

        public void setCollection(String collection) {
            this.collection = collection;
        }

        @Override
        public String toString() {
            return "Shoe{" +
                    "name='" + name + '\'' +
                    ", material='" + material + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", collection='" + collection + '\'' +
                    '}';
        }


}
