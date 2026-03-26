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
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Sterilised: " + sterilised);
        System.out.println("Vaccinated: " + vaccinated);
        System.out.println("Brought in: " + broughtIn);
    }
}    