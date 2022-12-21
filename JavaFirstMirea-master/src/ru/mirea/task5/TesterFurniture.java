package ru.mirea.task5;

public class TesterFurniture {
    public static void main(String[] args) {

        Chair chair = new Chair("wood", 5,
                false, 450.25);
        System.out.print("\nChair's Material: " + chair.getMaterial());
        System.out.print("\nChair's Weight: " + chair.getWeight());
        System.out.print("\nSoft: " + chair.getSoft());
        System.out.print("\n" + chair.breakIt());

        Sofa sofa = new Sofa("skin", 30,
                true, 500);
        System.out.print("\n\nSofa's Material: " + sofa.getMaterial());
        System.out.print("\nSofa's Weight: " + sofa.getWeight());
        System.out.print("\nSoft: " + sofa.getSoft());
        System.out.print("\n" + sofa.breakIt() + "\n");


        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.addFurniture(chair, sofa);

        for(int i = 0; i < furnitureShop.furnitures.length; i++) {
            System.out.print("\nFurniture[" + i + "]:");
            System.out.print("\n" + furnitureShop.furnitures[i].toString());
        }
    }
}