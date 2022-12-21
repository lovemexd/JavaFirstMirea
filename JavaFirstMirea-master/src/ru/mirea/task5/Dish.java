package ru.mirea.task5;

public abstract class Dish {
    protected String material;
    protected Boolean dirty;

    Dish(String material, Boolean dirty) {
        this.material = material;
        this.dirty = dirty;
    }

    public abstract String washDishes();
}

class Plate extends Dish {
    private Boolean deep;

    Plate(String material, Boolean dirty, Boolean deep) {
        super(material, dirty);
        this.deep = deep;
    }

    public String washDishes() {
        if (dirty) {
            dirty = false;
            return "Dishes are washed!";
        } else {
            return "Dishes already clean!";
        }
    };

    public Boolean getDeep() {
        return deep;
    }

    public Boolean getDirty() {
        return dirty;
    }
}

class SoupPlate extends Dish {
    private Boolean deep;

    SoupPlate(String material, Boolean dirty, Boolean deep) {
        super(material, dirty);
        this.deep = deep;
    }

    public String washDishes() {
        if (dirty) {
            dirty = false;
            return "Dishes are washed!";
        } else {
            return "Dishes already clean!";
        }
    };

    public Boolean getDeep() {
        return deep;
    }

    public Boolean getDirty() {
        return dirty;
    }
}

