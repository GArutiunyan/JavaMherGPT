class Animal{
    private String name,species;
    private int weight;

    public Animal(String name, String species, int weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + species + " " + weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("dasdaf","dfgdfgdfgdg",13453251);
        System.out.println(animal);
    }
}
