//Name: Garrett Radtke
//Date: 10/7/25 
//Height and BMI display incorrectly due to bugs in calculateBMI and loseWeight methods

public class PersonTest {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 25, 1.65, 60);
        Person bob = new Person("Bob", 30, 1.80, 90);

        System.out.println("--- Initial Info ---");
        alice.displayInfo();
        bob.displayInfo();

        alice.haveBirthday();
        bob.haveBirthday();


        alice.gainWeight(5); 
        

        bob.loseWeight(10); 

        System.out.println("\n--- After First Changes ---");
        alice.displayInfo();
        bob.displayInfo();

        alice.compareBMI(bob);  


        alice.loseWeight(3); 
        bob.gainWeight(2); 

        System.out.println("\n--- After Second Changes ---");
        alice.displayInfo(); 
        bob.displayInfo();


        alice.compareBMI(bob); 
    }
}