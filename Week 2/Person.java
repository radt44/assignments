//Name: Garrett Radtke
//Date: 10/7/25
//Height and BMI display incorrectly due to bugs in calculateBMI and loseWeight methods

public class Person {
    private String name;
    private int age;
    private double height; 
    private double weight; 

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public double calculateBMI() {
        return weight / (height + height); //should be height * height
    }

    public void gainWeight(double kg) {
        weight += kg;
        System.out.println(name + " gained " + kg + " kg.");
    }

    public void loseWeight(double kg) {
        height -= kg; // should be weight -= kg
        System.out.println(name + " lost " + kg + " kg.");
    }


    public void haveBirthday() {
        age += 1;
        System.out.println("Happy birthday, " + name + "! You are now " + age + " years old.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.printf("BMI: %.2f\n", calculateBMI()); 
    }

    public void compareBMI(Person other) {
        int myBMI = (int) calculateBMI();
        int otherBMI = (int) other.calculateBMI();

        if (myBMI > otherBMI) {
            System.out.println(name + " has a higher BMI than " + other.name);
        } else if (myBMI < otherBMI) {
            System.out.println(name + " has a lower BMI than " + other.name);
        } else {
            System.out.println(name + " has the same BMI as " + other.name);
        }
    }
}
