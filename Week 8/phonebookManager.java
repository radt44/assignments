import java.util.LinkedList;

public class phonebookManager {
    // first name, last name, street address, city, zip code, phone number, next
    // add entry to beginning middle or end
    // modify entry, delete entry, search by index number, or field.
    // print list
    LinkedList<listNode> phonebook;

    // constructor
    public phonebookManager() {
        phonebook = new LinkedList<listNode>();
    }

    // adds entry to end of list
    public void addEntryEnd(listNode entry) {
        phonebook.addLast(entry);
    }

    // adds entry to beginning of list
    public void addEntryBeginning(listNode entry) {
        phonebook.addFirst(entry);
    }

    // adds entry to middle of list
    public void addEntryMiddle(listNode entry) {
        phonebook.add(phonebook.size() / 2, entry);
    }

    // deletes entry at given index
    public void deleteEntry(int index) {
        phonebook.remove(index);
    }

    // Modifies a field at given index
    public void modifyEntry(int index, String field, String newValue) {
        listNode entry = phonebook.get(index);

        switch (field.toLowerCase()) {
            case "firstname":
                entry.firstName = newValue;
                break;
            case "lastname":
                entry.lastName = newValue;
                break;
            case "streetaddress":
                entry.streetAddress = newValue;
                break;
            case "city":
                entry.city = newValue;
                break;
            case "state":
                entry.state = newValue;
                break;
            case "zipcode":
                entry.zipCode = newValue;
                break;
            case "phonenumber":
                entry.phoneNumber = newValue;
                break;
            default:
                System.out.println("Unknown field: " + field);
                System.out.println("");
                break;
        }
    }

    // search and print by index
    public void search(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= phonebook.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        listNode entry = phonebook.get(index);
        System.out.println("Search result for index: " + index);
        printEntry(entry);
        System.out.println("");
    }

    // search and print by field value
    public void search(String value) throws RuntimeException {
        boolean found = false;
        System.out.println("Search results for value: " + value);
        for (listNode entry : phonebook) {
            if (entry.firstName.equals(value) || entry.lastName.equals(value) ||
                    entry.streetAddress.equals(value) || entry.city.equals(value) ||
                    entry.state.equals(value) || entry.zipCode.equals(value) ||
                    entry.phoneNumber.equals(value)) {
                printEntry(entry);
                found = true;
            }
        }
        System.out.println("");
        if (!found) {
            throw new RuntimeException("No entry found with value: " + value);
        }
    }

    public void printPhonebook() {
        for (listNode entry : phonebook) {
            printEntry(entry);
        }
        System.out.println("");
    }

    private void printEntry(listNode entry) {
        System.out.println("Name: " + entry.firstName + " " + entry.lastName);
        System.out.println(
                "Address: " + entry.streetAddress + ", " + entry.city + ", " + entry.state + ", " + entry.zipCode);
        System.out.println("Phone Number: " + entry.phoneNumber);
        System.out.println("---------------------------");
    }
}
