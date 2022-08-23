public class Character {

    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyName() {
     System.out.println("\nHello I am " + name + "\nmy strength is: " + strength + "\nmy agility is: " + agility + "\nmy intelligence is: " + intelligence);

    }

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }

}
