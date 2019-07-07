import java.util.Scanner;

public class Main {
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("12345678");
        showMenu();
        menu(mobilePhone);

        scanner.close();
    }

    private static void menu(MobilePhone mobilePhone) {
        boolean isQuit = false;

        while (!isQuit) {
            int point = 0;
            boolean isInt = false;

            while (!isInt) {
                System.out.println();
                System.out.println("Enter an operation");
                isInt = scanner.hasNextInt();
                if (isInt) {
                    point = scanner.nextInt();
                }
                scanner.nextLine();
            }

            switch (point) {
                case 1:
                    showMenu();
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    String name2 = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phone2 = scanner.nextLine();
                    mobilePhone.addContact(new Contacts(name2, phone2));
                    break;
                case 3:
                    System.out.println("Enter find name: ");
                    String name3 = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phone3 = scanner.nextLine();
                    mobilePhone.modifyNumber(phone3, name3);
                    break;
                case 4:
                    System.out.println("Enter find name: ");
                    String name4 = scanner.nextLine();
                    System.out.println("Enter new name:");
                    String newName4 = scanner.nextLine();
                    mobilePhone.modifyName(newName4, name4);
                    break;
                case 5:
                    System.out.println("Enter name of remove contact: ");
                    String name5 = scanner.nextLine();
                    mobilePhone.removeContact(name5);
                    break;
                case 6:
                    System.out.println("Enter name of find contact: ");
                    String name6 = scanner.nextLine();
                    mobilePhone.findContact(name6);
                    break;
                case 7:
                    mobilePhone.getContacts();
                    break;
                case 8:
                    isQuit = true;
            }

        }
    }

    private static void showMenu() {
        System.out.println("Menu:\n1. Show menu\n2. Add contact\n3. Modify number of contact\n4. Modify name of contact\n5. Remove contact\n6. Find contact\n7. " +
                "Show all contacts\n8. Quit");
    }
}
