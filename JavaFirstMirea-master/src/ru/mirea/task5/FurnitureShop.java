package ru.mirea.task5;

import java.util.Arrays;

public class FurnitureShop {
    Furniture[] furnitures = new Furniture[2];

    public void addFurniture(Furniture chair, Furniture sofa) {
        furnitures[0] = chair;
        furnitures[1] = sofa;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "furnitures=" + Arrays.toString(furnitures) +
                '}';
    }
}