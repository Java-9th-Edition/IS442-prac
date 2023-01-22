import java.util.*;
import java.util.List;

public class Utility {
    // upper bounded wildcards like ArrayList<? extends Animal> aList means you can use anything
    // extends Animal to fill the ArrayList

    // lower bounded wildcards like ArrayList<? super Animal> aList means you can use anything
    // super Animal to fill the ArrayList

    // extends means the current class is extended from another class
    public static void doSomething(ArrayList<? extends Animal> aList) {
        for (Animal a : aList) {
            a.saySomething();
        }
//        aList.add(new Dog("pussy"));
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Snowy"));
        animals.add(new Dog("Brownie"));
        doSomething(animals);
        System.out.println();

        ArrayList<Dog> animals2 = new ArrayList<>();
        animals2.add(new Dog("Milky"));
        animals2.add(new Dog("Cocoa"));
        doSomething(new ArrayList<Animal>());
        doSomething(animals2);
    }
}