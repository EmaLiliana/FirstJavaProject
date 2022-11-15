package AnimalRescue;

public class AppMain {
    public static void main(String[]arg) {
      Dog Charlie = new Dog();
      Charlie.setName("Charlie");
        System.out.println("The dog's name: " +Charlie.getName());


        Cat Hugo = new Cat();
        Hugo.setAge(2);
        System.out.println("The cat's age: " + Hugo.getAge() );



        Labrador Aki = new Labrador();
        Aki.setWeight(25);
        System.out.println("Labrador Aki - weight: " + Aki.getWeight());

        Cat Kiki = new Cat();
        Kiki.setHairLoss("Medium");
      System.out.println("Kiki - hair Loss level: " + Kiki.hairLoss);












    }
}
