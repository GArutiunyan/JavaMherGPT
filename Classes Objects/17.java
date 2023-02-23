class Plant{
    private String name,species;
    private int height;

    public Plant(String name, String species, int height) {
        this.name = name;
        this.species = species;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.height = weight;
    }

    @Override
    public String toString() {
        return name + " " + species + " " + height;
    }
}
public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant("adgw","g",1251);
        System.out.println(plant);
    }
}
