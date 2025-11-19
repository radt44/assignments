//Name: Garrett Radtke
//Date: 11/18/2025

public class listNode {
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    String zipCode;
    String phoneNumber;
    listNode next;
    //constructor
    public listNode(String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}
