//import java.util.Arrays;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

class Contact {
    String id;
    String name;
    String phoneNumber;
    String company;
    int salary;
    String birthday;

    public Contact(String id, String name, String phoneNumber, String company, int salary, String birthday) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.salary = salary;
        this.birthday = birthday;
    }
}

public class Main {

    public static Contact[] contact = new Contact[0];

    ////////////Main screen function//////////////
    public static void mainScreen() {
        System.out.println("\t\n\n\n            /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$$$ /$$   /$$ /$$$$$$$ \n" +
                "\t        |__/| $$_____/| $$__  $$| $$_____/| $$$ | $$| $$__  $$\n" +
                "\t         /$$| $$      | $$  \\ $$| $$      | $$$$| $$| $$  \\ $$\n" +
                "\t        | $$| $$$$$   | $$$$$$$/| $$$$$   | $$ $$ $$| $$  | $$\n" +
                "\t        | $$| $$__/   | $$__  $$| $$__/   | $$  $$$$| $$  | $$\n" +
                "\t        | $$| $$      | $$  \\ $$| $$      | $$\\  $$$| $$  | $$\n" +
                "\t        | $$| $$      | $$  | $$| $$$$$$$$| $$ \\  $$| $$$$$$$/\n" +
                "\t        |__/|__/      |__/  |__/|________/|__/  \\__/|_______/ \n" +
                "                                                      \n" +
                "    _____            _             _      ____                        _              \n" +
                "   / ____|          | |           | |    / __ \\                      (_)             \n" +
                "  | |     ___  _ __ | |_ __ _  ___| |_  | |  | |_ __ __ _  __ _ _ __  _ _______ _ __ \n" +
                "  | |    / _ \\| '_ \\| __/ _` |/ __| __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|\n" +
                "  | |___| (_) | | | | || (_| | (__| |_  | |__| | | | (_| | (_| | | | | |/ /  __/ |   \n" +
                "   \\_____\\___/|_| |_|\\__\\__,_|\\___|\\__|  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|   \n" +
                "                                                     __/ |                           \n" +
                "                                                    |___/                            \n\n" +
                "=========================================================================================");
    }

    //////////////////////// main title functions////////////////////////
    public static void Hedder(String title) {
        if (Objects.equals(title, "add")) {
            System.out.println("+----------------------------------------------------------------------+");
            System.out.println("|                      Add Contact to the list                         |");
            System.out.println("+----------------------------------------------------------------------+\n\n");
        } else if (Objects.equals(title, "update")) {
            System.out.println("+----------------------------------------------------------------------+");
            System.out.println("|                           UPDATE contact                             |");
            System.out.println("+----------------------------------------------------------------------+\n\n");
        } else if (Objects.equals(title, "delete")) {
            System.out.println("+----------------------------------------------------------------------+");
            System.out.println("|                           DELETE contact                             |");
            System.out.println("+----------------------------------------------------------------------+\n\n");
        } else if (Objects.equals(title, "search")) {
            System.out.println("+----------------------------------------------------------------------+");
            System.out.println("|                           SEARCH Contact                             |");
            System.out.println("+----------------------------------------------------------------------+\n\n");
        } else if (Objects.equals(title, "list")) {
            System.out.println("+----------------------------------------------------------------------+");
            System.out.println("|                            SORT Contact                              |");
            System.out.println("+----------------------------------------------------------------------+\n\n");
        }
    }

    ///////////// List one of the Selection ///////////////////
    public static void listOne() {

        System.out.println("\n\n    [01] ADD Contact");
        System.out.println("    [02] UPDATE Contact");
        System.out.println("    [03] DELETE Contact");
        System.out.println("    [04] SEARCH Contact");
        System.out.println("    [05] LIST Contact");
        System.out.println("    [06] Exit");
    }

    ////////////////////// List two of the Selction //////////////////
    public static void listTwo() {

        System.out.println("    [01] Sorting by Name");
        System.out.println("    [02] Sorting by Salary");
        System.out.println("    [03] Sorting by Birthday");
        System.out.print("\n\nEnter an option to continue ->  ");
    }

    /////////////////// Add contact function ///////////////////////
    /*public static void addContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name               :");
        String name = input.nextLine();


        System.out.println("Phone Number       :");
        String phoneNumber;
        while (true) {
            phoneNumber = input.nextLine();
            if (phoneNumber.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("Invalid phone number ..");
            }
        }

        System.out.println("Company Name       :");
        String companyName = input.nextLine();
        System.out.println("Salary             :");
        int salary = input.nextInt();
        // get input  yyyy mm dd
        System.out.println("B' Day(YYYY-m-DD)  :");
        String birthday;
        while (true) {
            birthday = input.nextLine();
            if (birthday.matches("\\d{4}-\\d{2}-\\d{2}")) {
                break;
            } else {
                System.out.println("Invalid Birthday");
            }
        }
        int counter = 5;

        counter++; //increese by one(have to change )
        String id = String.format("C%04d", counter);

        Contact gotContact = new Contact(id, name, phoneNumber, companyName, salary, birthday);
        Contact[] tempcontact = new Contact[contact.length + 1];
        for (int i = 0; i < contact.length; i++) {
            tempcontact[i] = contact[i];
        }
        contact = tempcontact;
        contact[tempcontact.length - 1] = gotContact;

        System.out.println("Do you want to add contact(Y/N) "); // use for break th the while loop if choise is == to N or n
        String ch = input.nextLine();
        if (ch.equals("Y") || ch.equals("y")) {
            addContact();
        }
    }*/

    //////////// this serch method use for get index for short array ///////////
    public static int search(String search) {
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].name.equalsIgnoreCase(search) || contact[i].phoneNumber.equals(search) || contact[i].birthday.equals(search)) {
                return i;
            }
        }
        return -1;
    }

    //////////// this serch method use for get index serch update and delete  ///////////
    /*public static int search() {
        Scanner input = new Scanner(System.in);

        System.out.print("Search Contact by Name or Phone Number: ");
        String search = input.nextLine();
        boolean found = false;


        for (int i = 0; i < contact.length; i++) {
            if (contact[i].name.equalsIgnoreCase(search) || contact[i].phoneNumber.equals(search)) {
                found = true;
                return i;
            }
        }

        if (!found) {
            System.out.println("contact not found");
        }
        return -1;

    }*/

    /*public static void updateContact() {


        Scanner input = new Scanner(System.in);

        int index = search();
        System.out.println("Contact ID        : " + contact[index].id);
        System.out.println("Name              : " + contact[index].name);
        System.out.println("Phone Nimber      : " + contact[index].phoneNumber);
        System.out.println("Company Name      : " + contact[index].company);
        System.out.println("Slary             : " + contact[index].salary);
        System.out.println("B'Day(YYYY-m-DD)  : " + contact[index].salary);

        if (index == -1) {

            return;
        }
        System.out.println("\nWhat do you want to update...");
        System.out.println("\n    [01] Name");
        System.out.println("    [02] Phone Number");
        System.out.println("    [03] Company Name");
        System.out.println("    [04] Salary");
        System.out.print("\nEnter an option to continue -> ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter new Name: ");
                contact[index].name = input.nextLine();
                contact[index].name = input.nextLine();// can't get input first time
                break;
            case 2:
                System.out.print("Enter new Phone Number: ");
                contact[index].phoneNumber = input.nextLine();
                contact[index].phoneNumber = input.nextLine();// can't get input first time
                break;
            case 3:
                System.out.print("Enter new Company Name: ");
                contact[index].company = input.nextLine();
                contact[index].company = input.nextLine();// can't get input first time
                break;
            case 4:
                System.out.print("Enter new Salary: ");
                contact[index].salary = input.nextInt();
                contact[index].salary = input.nextInt();// can't get input first time
                break;
            default:
                System.out.println("Invalid option. No updates made.");
                return;
        }
        System.out.println("Contact has been update successfully!\n");

        System.out.println("Do you wan to update another contact(Y/N) ? ");
        String ch = input.nextLine();

        if (ch.equals("Y") || ch.equals("y")) {
            updateContact();// call it self for reapt
        }

    }*/

    /*public static void deleteContact() {

        //////////make temp array for delete data without space////////////

        Scanner sc = new Scanner(System.in);
        Contact[] tempContact;
            int delindex = search();//////////// del index [from serch]//////////////
            System.out.println("\n\nContact ID        : " + contact[delindex].id);
            System.out.println("Name              : " + contact[delindex].name);
            System.out.println("Phone Nimber      : " + contact[delindex].phoneNumber);
            System.out.println("Company Name      : " + contact[delindex].company);
            System.out.println("Slary             : " + contact[delindex].salary);
            System.out.println("B'Day(YYYY-m-DD)  : " + contact[delindex].birthday);
            if (delindex != -1) {

                System.out.println("\nDo you want to delete this contact (Y/N)");
                String input = sc.nextLine();

                ////// all arrays in same length /////
                if (input.equals("Y") || input.equals("y")) {
                    tempContact = new Contact[contact.length - 1];

                    for (int i = 0; i < contact.length - 1; i++) {
                        tempContact[i] = contact[i];
                    }
                    ///// loop start fron delete index ///////
                    for (int i = delindex; i < tempContact.length; i++) {
                        tempContact[i] = contact[i + 1];
                    }
                    ///// change reference ///////
                    contact = tempContact;
                }
            }



        //System.out.println(Arrays.toString(ar));// for test
    }*/

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("IFriend Contact Organizer");
        frame.setLayout(new GridLayout(1,2));
        frame.setSize(799,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);




















        /*Scanner input = new Scanner(System.in);
        int index;
        while (true) {
            mainScreen();
            listOne();

            System.out.println("\nEnter an option to continue  -> ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    Hedder("add");
                    addContact();
                    break;
                case 2:
                    Hedder("update");
                    updateContact();
                    break;
                case 3:
                    Hedder("delete");
                    deleteContact();
                    break;
                case 4:
                    while (true) {
                        Hedder("search");
                        index = search();
                        if (index == -1) {
                            System.out.println("Do you want to search contact(Y/N) ");
                            String ch;
                            ch = input.nextLine();
                            if (ch.equals("N") || ch.equals("n")) {
                                break;
                            }
                            continue;
                        }
                        System.out.println("Contact ID        : " + contact[index].id);
                        System.out.println("Name              : " + contact[index].name);
                        System.out.println("Phone Nimber      : " + contact[index].phoneNumber);
                        System.out.println("Company Name      : " + contact[index].company);
                        System.out.println("Slary             : " + contact[index].salary);
                        System.out.println("B'Day(YYYY-m-DD)  : " + contact[index].birthday);

                        System.out.println("Do you want to search contact(Y/N) ");
                        String ch = input.nextLine();
                        ch = input.nextLine();
                        if (ch.equals("N") || ch.equals("n")) {
                            break;
                        }
                    }
                    break;
                case 5:
                    Hedder("list");
                    listTwo();

                    int option2 = input.nextInt();
                    switch (option2) {
                        case 1:
                            ///////////////// Make a copy of Originala array //////////////////
                            String[] NAMER = new String[contact.length];
                            for (int i = 0; i < contact.length; i++) {
                                NAMER[i] = contact[i].name;
                            }
                            for (int i = 0; i < NAMER.length - 1; i++) {
                                for (int j = 0; j < NAMER.length - 1 - i; j++) {
                                    if (NAMER[j].compareTo(NAMER[j + 1]) > 0) {
                                        String temp = NAMER[j];
                                        NAMER[j] = NAMER[j + 1];
                                        NAMER[j + 1] = temp;
                                    }
                                }
                            }
                            System.out.println("    +----------------------------------------------------------------------+");
                            System.out.println("    |                        List Contact by Nane                          |");
                            System.out.println("    +----------------------------------------------------------------------+\n\n");
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            System.out.println("|    Contact ID     |       Name        |    Phone Number   |     Company       |      Salary       |      Birthday     |");
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            for (String name : NAMER) {
                                int ind = search(name);
                                if (ind != -1) {
                                    System.out.printf("| %-17s | %-17s | %-17s | %-17s | %-17d | %-17s |\n", contact[ind].id, contact[ind].name, contact[ind].phoneNumber, contact[ind].company, contact[ind].salary, contact[ind].birthday);
                                }

                            }
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            break;
                        case 2:

                            int[] si = new int[contact.length];
                            for (int i = 0; i < contact.length; i++) {
                                si[i] = i;
                            }

                            for (int i = 0; i < si.length - 1; i++) {
                                for (int j = 0; j < si.length - 1 - i; j++) {
                                    if (contact[si[j]].salary > contact[si[j + 1]].salary) {

                                        int temp = si[j];
                                        si[j] = si[j + 1];
                                        si[j + 1] = temp;
                                    }
                                }
                            }
                            System.out.println("    +----------------------------------------------------------------------+");
                            System.out.println("    |                       List Contact by Salary                         |");
                            System.out.println("    +----------------------------------------------------------------------+\n\n");
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            System.out.println("|    Contact ID     |       Name        |    Phone Number   |     Company       |      Salary       |      Birthday     |");
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            for (int index2 : si) {
                                System.out.printf("| %-17s | %-17s | %-17s | %-17s | %-17d | %-17s5 |\n", contact[index2].id, contact[index2].name, contact[index2].phoneNumber, contact[index2].company, contact[index2].salary, contact[index2].birthday);
                            }
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            break;
                        case 3:

                            String[] BIRTHDAYR = new String[contact.length];
                            ///////////////// Make a copy of Originala array //////////////////
                            for (int i = 0; i < contact.length + 1; i++) {
                                BIRTHDAYR[i] = contact[i].birthday;
                            }
                            for (int i = 0; i < BIRTHDAYR.length - 1; i++) {
                                for (int j = 0; j < BIRTHDAYR.length - 1 - i; j++) {
                                    if (BIRTHDAYR[j].compareTo(BIRTHDAYR[j + 1]) > 0) {
                                        String temp = BIRTHDAYR[j];
                                        BIRTHDAYR[j] = BIRTHDAYR[j + 1];
                                        BIRTHDAYR[j + 1] = temp;
                                    }
                                }
                            }

                            System.out.println("    +-----------------------------------------------------------------------+");
                            System.out.println("    |                       List Contact by Birthday                        |");
                            System.out.println("    +-----------------------------------------------------------------------+\n\n");
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            System.out.println("|    Contact ID     |       Name        |    Phone Number   |     Company       |      Salary       |      Birthday     |");
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            for (String birthday : BIRTHDAYR) {
                                int ind = search(birthday);
                                if (ind != -1) {
                                    System.out.printf("| %-17s | %-17s | %-17s | %-17s | %-17d | %-17s |\n", contact[ind].id, contact[ind].name, contact[ind].phoneNumber, contact[ind].company, contact[ind].salary, contact[ind].birthday);
                                }
                            }
                            System.out.println("+-----------------------------------------------------------------------------------------------------------------------+");
                            break;
                    }
                    break;
                case 6:
                    System.exit(0);
            }

            ///////////////////// Reapt main home screen?////////////////////


            System.out.println("Do you want to go home page(Y/N) ");
            String ch = input.nextLine();
            ch = input.nextLine();
            if (ch.equals("N") || ch.equals("n")) {
                break;
            }

            //while loop bareak if input is == Y or y


        }

        ////    for final test    ////
        //System.out.println(Arrays.toString(idr));
        //System.out.println(Arrays.toString(namer));
        //System.out.println(Arrays.toString(phonenumberr));
        //System.out.println(Arrays.toString(companyr));
        //System.out.println(Arrays.toString(salaryr));
        //System.out.println(Arrays.toString(birthdayr));*/

    }
}