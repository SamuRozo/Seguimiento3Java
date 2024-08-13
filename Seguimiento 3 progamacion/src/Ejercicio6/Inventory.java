package Ejercicio6;

public class Inventory {

        private Shoe shoe;
        private int[] sizes;
        private int[] quantities;


        public Inventory(Shoe shoe, int[] sizes, int[] quantities) {
            this.shoe = shoe;
            this.sizes = sizes;
            this.quantities = quantities;
        }


        public void registerStockEntry(int size, int quantity) {
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i] == size) {
                    quantities[i] += quantity;
                    break;
                }
            }
        }

        public void registerStockExit(int size, int quantity) {
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i] == size) {
                    quantities[i] -= quantity;
                    break;
                }
            }
        }


        public Shoe getShoe() {
            return shoe;
        }

        public void setShoe(Shoe shoe) {
            this.shoe = shoe;
        }

        public int[] getSizes() {
            return sizes;
        }

        public void setSizes(int[] sizes) {
            this.sizes = sizes;
        }

        public int[] getQuantities() {
            return quantities;
        }

        public void setQuantities(int[] quantities) {
            this.quantities = quantities;
        }

        public void displayInventory() {
            System.out.println(shoe);
            for (int i = 0; i < sizes.length; i++) {
                System.out.println("Size: " + sizes[i] + " - Quantity: " + quantities[i]);
            }
        }


}
