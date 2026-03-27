import java.time.LocalDateTime;
import java.util.Scanner;
public class DogHotel {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = null;
        Dog dog2 = null;
        Dog dog3 = null;

        boolean run = true;

        while(run){
            System.out.println("Wat wil je doen?"); // Keuze 1
            System.out.println("(1) Een hond toevoegen");
            System.out.println("(2) Een hond verwijderen");
            System.out.println("(3) Overzicht");
            System.out.println("(4) Een hond opzoeken");
            System.out.println("(5) Stoppen");
            int reply = scanner.nextInt();

            if(reply==1) { // Hond toevoegen
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
                    System.out.println("Hond succesvol toegevoegd!");
                    System.out.println("");
                }
                else if (dog2 == null) {
                    dog2 = new Dog(name, breed, color, age, gender, sterilised, vaccinated, broughtIn);
                    System.out.println("Hond succesvol toegevoegd!");
                    System.out.println("");
                }
                else if (dog3 == null) {
                    dog3 = new Dog(name, breed, color, age, gender, sterilised, vaccinated, broughtIn);
                    System.out.println("Hond succesvol toegevoegd!");
                    System.out.println("");
                }
                else { // hotel vol
                    System.out.println("Hotel is vol! Hond niet toegevoegd.");
                    System.out.println("");
                }
            }
            else if(reply==2){ // Hond verwijderen
                System.out.println("Naam van de hond die je wil verwijderen: ");
                String nameDelete = scanner.next();
                boolean found = false;

                if(dog1 != null && dog1.name.equalsIgnoreCase(nameDelete)){
                    dog1 = null;
                    found = true;
                }
                else if(dog2 != null && dog2.name.equalsIgnoreCase(nameDelete)){
                    dog2 = null;
                    found = true;
                }
                else if(dog3 != null && dog3.name.equalsIgnoreCase(nameDelete)){
                    dog3 = null;
                    found = true;
                }
                if(found){
                    System.out.println(nameDelete+" is succesvol verwijderd van het hotel.");
                    System.out.println("");
                }
                else{ // Ongeldige naam
                    System.out.println("Geen hond met de naam \""+nameDelete+"\" gevonden.");
                }
            }
            else if(reply==3){ // Overzicht
                System.out.println("Overzicht van honden in het hotel:");
                System.out.println("_____________________________________________");
                if (dog1 != null) dog1.showInfo();
                if (dog2 != null) dog2.showInfo();
                if (dog3 != null) dog3.showInfo();
                if (dog1 == null && dog2 == null && dog3 == null) {
                    System.out.println("Er zijn momenteel geen honden in het hotel.");
                }
            }
            else if(reply==4){ // Opzoeken
                System.out.println("Naam van de hond: ");
                String nameSearch = scanner.next();
                boolean found = false;

                if(dog1 != null && dog1.name.equalsIgnoreCase(nameSearch)){
                    found = true;
                    dog1.showInfo();
                }
                else if(dog2 != null && dog2.name.equalsIgnoreCase(nameSearch)) {
                    found = true;
                    dog2.showInfo();
                }
                else if(dog3 != null && dog3.name.equalsIgnoreCase(nameSearch)) {
                    found = true;
                    dog3.showInfo();
                }
                if(found==false){
                    System.out.println("Geen hond met de naam \""+nameSearch+"\" gevonden.");
                    System.out.print("");
                }
            }
            else if(reply==5){ // Stop
                System.out.println("Programma wordt afgesloten.");
                System.out.println("");
                System.out.println("          __\n" +
                        " \\ ______/ V`-,\n" +
                        "  }        /~~\n" +
                        " /_)^ --,r'\n" +
                        "|b      |b\n");
                run = false;
                scanner.close();
            }
        }
    }
}

