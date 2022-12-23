package ru.mirea.task2;

public class ClassTester {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.width = 3;
        shape.length = 3;
        System.out.print(shape.toString());

        Ball ball = new Ball();
        ball.setData(6.3, "red");
        System.out.print(ball.toString());

        Book book = new Book();
        book.setData("The witcher lady of the lake", "Novel",
                "Andrzej Sapkowski", 2000, 512);
        System.out.print(book.toString());

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog.setData("Genry", 3);
        dog1.setData("Barsik", 6);
        dog2.setData("King", 10);

        TestDogs testDogs = new TestDogs();
        testDogs.addDogs(dog, dog1, dog2);

        for(int i = 0; i < testDogs.dogs.length; i++) {
            System.out.print("\nDog[" + i+ "]");
            System.out.print(testDogs.dogs[i].toString());
        }
    }
}
