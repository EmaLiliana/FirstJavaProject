package AnimalRescue;

public abstract class Animal {
    //name
    private String name;
    private String breed;
    private int age;
    private String color;
    private double weight;
    private String gender;
    private int appetite;
    private int health;
    private int happinessLevel;
    private String foodPreference;
    private float foodPrice;
    private int foodAvailability;
    private String favoriteGame;
    private String activities;
    private String vet;
    private String vetSpecialization;
    private String hairLoss;

    public abstract void speak();

    public abstract void eat();
    public abstract void run();
    public abstract void sleep ();


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //breed

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    //age

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //color

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //weight

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    //gender

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //appetite

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }
    //Health

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    //Happiness Level

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    //Food Preference

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    //Food Price

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public float getFoodPrice() {
        return foodPrice;
    }

    //Food Availability

    public void setFoodAvailability(int foodAvailability) {
        this.foodAvailability = foodAvailability;
    }

    public int getFoodAvailability() {
        return foodAvailability;
    }

    //Favorite Game

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    //Activities

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getactivities() {
        return activities;
    }

    //Dog'S VET

    public void setVet(String vet) {
        this.vet = vet;
    }

    public String getVet() {
        return vet;
    }

    //Vet's specialization

    public void setVetSpecialization(String vetSpecialization) {
        this.vetSpecialization = vetSpecialization;
    }

    public String getVetSpecialization() {
        return vetSpecialization;
    }


    //Hair loss

    public void setHairLoss(String hairLoss) {
        this.hairLoss = hairLoss;
    }

    ;

    public String getHairLoss() {
        return hairLoss;
    }



    }




