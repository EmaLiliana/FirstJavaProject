package AnimalRescue;

public class AppMain {
    public static void main(String[]arg) {
        Dog Charlie = new Dog();
        System.out.println("The dog's name is: "+ Charlie.name);

        System.out.println("The dog's weight is: "+ Charlie.weight + "kg");

        System.out.println("The dog's color is: "+Charlie.color);

        System.out.println("The dog's age is: "+ Charlie.age);

        System.out.println("The dog's breed is: "+ Charlie.breed);

        System.out.println("The dog's happiness level is: "+ Charlie.happinessLevel);

        System.out.println("The dog's gender is: "+ Charlie.gender);

        System.out.println("The dog's food preference is: "+ Charlie.foodPreference+ ","+Charlie.foodPrice + "ron," + Charlie.foodAvailability);

        System.out.println("The dog's health level is: "+ Charlie.health);

        System.out.println("The dog's appetite level is: "+ Charlie.appetite);

        System.out.println("The dog's favorite game is: "+ Charlie.favoriteGame);

        System.out.println("The dog's activities are: "+Charlie.dogActivities);
        System.out.println("Vet's name: " + Charlie.dogVet +", Specialization: " + Charlie.dogVetSpecialization);


        Charlie.adopterNameMoney();


    }
}
