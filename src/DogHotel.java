import java.time.LocalDateTime;
import java.util.Scanner;
public class DogHotel {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = null;
        Dog dog2 = null;
        Dog dog3 = null;

        while(true){
            System.out.println("Wat wil je doen?");
            System.out.println("(1) Een hond toevoegen");
            System.out.println("(2) Een hond verwijderen");
            System.out.println("(3) Overzicht");
            System.out.println("(4) Stoppen");
            int reply = scanner.nextInt();

            if(reply==1) {
                System.out.println("Naam: ");
                String name = scanner.next();

                System.out.println("Ras: ");
                String breed = scanner.next();

                System.out.println("Kleur: ");
                String color = scanner.next();

                System.out.println("Leeftijd: ");
                int age = scanner.nextInt();

                System.out.println("Geslacht: ");
                String gender = scanner.next();

                System.out.println("Gesteriliseerd (true/false): ");
                boolean sterilised = scanner.nextBoolean();

                System.out.println("Gevaccineerd (true/false): ");
                boolean vaccinated = scanner.nextBoolean();

                LocalDateTime broughtIn = LocalDateTime.now();

                if (dog1 == null) {
                    dog1 = new Dog(name, breed, color, age, gender, sterilised, vaccinated, broughtIn);
                    System.out.print("Hond succesvol toegevoegd!");
                    System.out.print("");
                } else if (dog2 == null) {
                    dog2 = new Dog(name, breed, color, age, gender, sterilised, vaccinated, broughtIn);
                    System.out.print("Hond succesvol toegevoegd!");
                    System.out.print("");
                } else if (dog3 == null) {
                    dog3 = new Dog(name, breed, color, age, gender, sterilised, vaccinated, broughtIn);
                    System.out.print("Hond succesvol toegevoegd!");
                    System.out.print("");
                }
                System.out.println("Hotel is vol! Hond niet toegevoegd.");
                System.out.println("");
            }
        }
    }
}
