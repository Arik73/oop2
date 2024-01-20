package kz.aitu.dz;

import java.util.Objects;

public class Cat {
    private String name;
    private Integer weight;
    private String color;

    public Cat() {
        this.name = "";
        this.weight = 0;
        this.color = "";
    }

    public Cat(String name) {
        this();
        setName(name);
    }

    public Cat(String name, Integer weight) {
        this(name);
        setWeight(weight);
    }

    public Cat(String name, Integer weight, String color) {
        this(name, weight);
        setColor(color);
    }

    public Cat(String name, String color) {
        this(name);
        setColor(color);
    }

    public String getName() {
        System.out.println("Getter for name was called");
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Name cannot be null");
        System.out.println("Setter for name was called");
        this.name = name;
    }

    public Integer getWeight() {
        System.out.println("Getter for weight was called");
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Weight cannot be null");
        }
        System.out.println("Setter for weight was called");
        this.weight = weight;
    }

    public String getColor() {
        System.out.println("Getter for color was called");
        return color;
    }

    public void setColor(String color) {
        Objects.requireNonNull(color, "Color cannot be null");
        System.out.println("Setter for color was called");
        this.color = color;
    }

    public void meow() {
        System.out.println(getName() + " says meow");
    }

    public void meow(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(getName() + " says meow");
        }
    }

    public static void main(String[] args) {
        Cat firstCat = new Cat();
        firstCat.meow();

        Cat secCat = new Cat("urazbek");
        String nameOfSecCat = secCat.getName();
        System.out.println("Name of second cat:" + nameOfSecCat);

        Cat thirdCat = new Cat("cristiano ronaldo", 5);
        Integer weightOfThirdCat = thirdCat.getWeight();
        System.out.println("Weight of third cat: " + weightOfThirdCat);

        Cat fourthCat = new Cat("archibalt", "Orange");
        String colorOfFourthCat = fourthCat.getColor();
        System.out.println("Color of fourth cat: " + colorOfFourthCat);

        Cat fifthCat = new Cat("rar", 3, "White");
        String nameOfFifthCat = fifthCat.getName();
        System.out.println("Name of second cat:" + nameOfFifthCat);
        Integer weightOfFifthCat = fifthCat.getWeight();
        System.out.println("Weight of fifthCat: " + weightOfFifthCat);
        String colorOfFifthCat = fifthCat.getColor();
        System.out.println("Color of fifthCat: " + colorOfFifthCat);

        fifthCat.meow(3);
    }
}