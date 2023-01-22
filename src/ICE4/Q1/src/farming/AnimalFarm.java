package ICE4.Q1.src.farming;

import ICE4.Q1.src.farming.type.Animal;
import ICE4.Q1.src.farming.type.Cat;
import ICE4.Q1.src.farming.type.Cow;
import ICE4.Q1.src.farming.type.Dog;

import java.util.ArrayList;

public class AnimalFarm {
    private ArrayList<Animal> animals = new ArrayList<>();

    public AnimalFarm() {
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cow());
    }

    public void makeNoise() {
        for (Animal a : animals) {
            a.makeNoise();
        }

    }
}
