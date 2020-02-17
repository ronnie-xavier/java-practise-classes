package cloud.itsu.collections;

public class RonniesItems {

    private String description;
    private char charIdentifier;
    private int age;

    @Override
    public String toString() {
        return "Item description " + description +
                " charIdentifier " + charIdentifier +
                " age " + age;
    }

    public RonniesItems(String description, char charIdentifier, int age) {
        this.description = description;
        this.charIdentifier = charIdentifier;
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getCharIdentifier() {
        return charIdentifier;
    }

    public void setCharIdentifier(char charIdentifier) {
        this.charIdentifier = charIdentifier;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
