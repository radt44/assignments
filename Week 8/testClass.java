public class testClass {
    public static void main(String[] args) {
        // list of random entries to add to phonebook
        listNode e1 = new listNode("John", "Doe", "10 Oak St", "Denver", "CO", "80210", "555-1111");
        listNode e2 = new listNode("Mary", "Smith", "22 Pine Rd", "Seattle", "WA", "98101", "555-2222");
        listNode e3 = new listNode("Alex", "Johnson", "35 Elm Ave", "Austin", "TX", "73301", "555-3333");
        listNode e4 = new listNode("Sarah", "Lee", "48 Maple Blvd", "Boston", "MA", "02108", "555-4444");
        listNode e5 = new listNode("David", "Kim", "57 Cedar Dr", "Chicago", "IL", "60601", "555-5555");

        phonebookManager manager = new phonebookManager();
        manager.addEntryBeginning(e1); //add to beginning
        manager.addEntryEnd(e2); //add to end
        manager.addEntryMiddle(e3); //add to middle
        manager.addEntryBeginning(e4); 
        manager.addEntryEnd(e5); 
        //expected order is e4, e1, e3, e2, e5
        manager.modifyEntry(1, "state", "CA"); // changes entry 1 (34) state to CA from MA
        manager.printPhonebook(); //print
        manager.search("Johnson"); //search by field
        manager.search(2); //search by index
    };
}
