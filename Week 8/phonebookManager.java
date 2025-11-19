import java.util.LinkedList;

public class phonebookManager {
    // first name, last name, street address, city, zip code, phone number, next
    // add entry to beginning middle or end
    // modify entry, delete entry, search by index number, or field.
    // print list
    LinkedList<listNode> phonebook;

    public phonebookManager() {
        phonebook = new LinkedList<listNode>();
    }

    public void addEntryEnd(listNode entry) {
        phonebook.addLast(entry);
    }

    public void addEntryBeginning(listNode entry) {
        phonebook.addFirst(entry);
    }

    public void addEntryMiddle(listNode entry) {
        phonebook.add(phonebook.size() / 2, entry);
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
                break;
        }
    }

    public void printPhonebook() {
        for (listNode entry : phonebook) {
            System.out.println("Name: " + entry.firstName + " " + entry.lastName);
            System.out.println(
                    "Address: " + entry.streetAddress + ", " + entry.city + ", " + entry.state + ", " + entry.zipCode);
            System.out.println("Phone Number: " + entry.phoneNumber);
            System.out.println("---------------------------");
        }
    }
}
