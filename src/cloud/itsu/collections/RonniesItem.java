package cloud.itsu.collections;

import java.util.Comparator;
import java.util.Objects;

public class RonniesItem implements Comparable<RonniesItem>{

    private String description;
    private char charIdentifier;
    private int age;

    @Override
    public String toString() {
        return "Item description " + description +
                " charIdentifier " + charIdentifier +
                " age " + age;
    }

    public RonniesItem(String description, char charIdentifier, int age) {
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

    @Override
    public int compareTo(RonniesItem other) {
        return this.age - other.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RonniesItem)) return false;
        RonniesItem that = (RonniesItem) o;
        return getCharIdentifier() == that.getCharIdentifier() &&
                getAge() == that.getAge() &&
                Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getCharIdentifier(), getAge());
    }

    public static Comparator<RonniesItem> descriptionLengthComparator = new Comparator<RonniesItem> () {
        @Override
        public int compare(RonniesItem o1, RonniesItem o2) {
            return o1.getDescription().length() - o2.getDescription().length();
        }
    };

    public static class descriptionLengthComparatorReversed implements Comparator<RonniesItem> {
        @Override
        public int compare(RonniesItem o1, RonniesItem o2) {
            return o2.getDescription().length() - o1.getDescription().length();
        }
    }
}
