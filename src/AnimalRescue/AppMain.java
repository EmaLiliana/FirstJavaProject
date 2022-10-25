package AnimalRescue;

public class AppMain {
    public static void main(String[]arg) {
        Dog Charlie = new Dog();
        System.out.println("The dog's name is: "+ Charlie.getName());

        System.out.println("The dog's weight is: "+ Charlie.getWeight() + "kg");

        System.out.println("The dog's color is: "+Charlie.getColor());

        System.out.println("The dog's age is: "+ Charlie.getAge());

        System.out.println("The dog's breed is: "+ Charlie.getBreed());

        System.out.println("The dog's happiness level is: "+ Charlie.getHappinessLevel());

        System.out.println("The dog's gender is: "+ Charlie.getGender());

        System.out.println("The dog's food preference is: "+ Charlie.getFoodPreference()+ ","+Charlie.getFoodPrice() + " ron," + Charlie.getFoodAvailability());

        System.out.println("The dog's health level is: "+ Charlie.getHealth());

        System.out.println("The dog's appetite level is: "+ Charlie.getAppetite());

        System.out.println("The dog's favorite game is: "+ Charlie.getFavoriteGame());

        System.out.println("The dog's activities are: "+Charlie.getDogActivities());
        System.out.println("Vet's name: " + Charlie.getDogVet() +", Specialization: " + Charlie.getDogVetSpecialization());





    }
}
