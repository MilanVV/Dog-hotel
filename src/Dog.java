import java.time.LocalDateTime;
public class Dog {
    String name;
    String breed;
    String color;
    int age;
    String gender;
    boolean sterilised;
    boolean vaccinated;
    LocalDateTime broughtIn;

    public Dog(String name, String breed, String color, int age, String gender, boolean sterilised, boolean vaccinated, LocalDateTime broughtIn){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.sterilised = sterilised;
        this.vaccinated = vaccinated;
        this.broughtIn = LocalDateTime.now();
    }


    public void showInfo() {
        System.out.println("Naam: " + name);
        System.out.println("Ras: " + breed);
        System.out.println("Kleur: " + color);
        System.out.println("Leeftijd: " + age);
        System.out.println("Geslacht: " + gender);
        System.out.println("Gesteriliseerd: " + sterilised);
        System.out.println("Gevaccineerd: " + vaccinated);
        System.out.println("Binnengebracht: " + broughtIn);
        System.out.println("_____________________________________________");
    }
}    