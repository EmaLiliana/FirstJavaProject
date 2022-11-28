package AnimalRescue;

public abstract class Cat extends Animal {

    public abstract void purr();
    public void animalSound(){
        System.out.println("The cat says: meow.");
    }
    public void hairLoss(){
        System.out.println("Hair Loss intensity: Medium");
    }

    @Override
    public void speak() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }
}
