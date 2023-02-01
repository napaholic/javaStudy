package first;
import java.util.ArrayList;

public class Animal {
    public void move() {
        System.out.println("Animal is moving");
    }
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();
        Animal[] animals = {tiger, eagle};
        for (Animal animal : animals) {
            animal.move();
        }
        animals[0].hunting();
    }

    public void hunting() {
        System.out.println("Animal is moving");
    }
}

