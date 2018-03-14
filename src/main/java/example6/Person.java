package example6;

public class Person {
    private String name;
    private String height;

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "person name: " + name + ", person height: " + height;
    }
}
