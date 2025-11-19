public class testClass {
    public static void main(String[] args) {
        //list of random entries to add to phonebook
        listNode e1 = new listNode();
        e1.firstName = "e1";
        e1.lastName = "Doe";
        e1.streetAddress = "123 Main St";
        e1.city = "Springfield";
        e1.state = "WA";
        e1.zipCode = "98101";
        e1.phoneNumber = "555-1111";

        listNode e2 = new listNode();
        e2.firstName = "e2";
        e2.lastName = "Smith";
        e2.streetAddress = "42 Oak Ave";
        e2.city = "Everett";
        e2.state = "WA";
        e2.zipCode = "98201";
        e2.phoneNumber = "555-2222";

        listNode e3 = new listNode();
        e3.firstName = "e3";
        e3.lastName = "Brown";
        e3.streetAddress = "9 Pine Rd";
        e3.city = "Lynnwood";
        e3.state = "WA";
        e3.zipCode = "98036";
        e3.phoneNumber = "555-3333";

        listNode e4 = new listNode();
        e4.firstName = "e4";
        e4.lastName = "Johnson";
        e4.streetAddress = "88 Maple St";
        e4.city = "Seattle";
        e4.state = "WA";
        e4.zipCode = "98109";
        e4.phoneNumber = "555-4444";

        listNode e5 = new listNode();
        e5.firstName = "e5";
        e5.lastName = "Davis";
        e5.streetAddress = "500 Cedar Blvd";
        e5.city = "Bellevue";
        e5.state = "WA";
        e5.zipCode = "98004";
        e5.phoneNumber = "555-5555";

        phonebookManager manager = new phonebookManager();
        manager.addEntryEnd(e1);
        manager.modifyEntry(0, "state", "CA"); //changes entry 1 (e1) state to CA from WA
        manager.printPhonebook();
    };
}
