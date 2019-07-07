import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;

    private ArrayList<Contacts> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contacts contact) {
        contacts.add(contact);

        if (contacts.get(contacts.size() - 1).getName().contains(contact.getName())) {
            System.out.println("Contact add successfully");
            return true;
        } else {
            System.out.println("Error of adding. Try again.");
            return false;
        }
    }

    public boolean removeContact(String name) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                contacts.remove(i);
                System.out.println("Contact remove successfully.");
                return true;
            }
        }

        System.out.println("Din't remove.");
        return false;

    }

    public void getContacts() {
        for (Contacts cont : contacts) {
            System.out.println("Contact list:\n" + "Name: " + cont.getName() + ", phone number: " + cont.getPhoneNumber() + ".");
        }
    }

    public boolean findContact(String name) {

        for (Contacts cont : contacts) {
            if (cont.getName().contains(name)) {
                System.out.println("Name: " + cont.getName() + ", phone number: " + cont.getPhoneNumber() + ".");
                return true;
            }
        }

        System.out.println("Contact was not found");
        return false;
    }

    public boolean modifyName(String newName, String name) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                contacts.get(i).setName(newName);
                System.out.println("Contact modify successfully");
                return true;
            }
        }

        System.out.println("Name was not found.");
        return false;
    }

    public boolean modifyNumber(String phoneNumber, String name) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                contacts.get(i).setPhoneNumber(phoneNumber);
                System.out.println("Phone number modify successfully");
                return true;
            }
        }

        System.out.println("Name was not found.");
        return false;

    }
}
