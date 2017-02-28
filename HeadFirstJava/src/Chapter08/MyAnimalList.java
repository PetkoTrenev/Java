package Chapter08;

/**
 * Created by Petko on 13.3.2016 г..
 */
public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal myNewAnimal){
        if (nextIndex < animals.length){
            animals[nextIndex] = myNewAnimal;
            System.out.println("Animal added at "+ nextIndex);
        }
    }
}
