
package CaseStudy3;

import java.util.Scanner;


public class BookManager {
    public static void main(String[] args) {
        String filename = "books.dat";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("1.View books");
        menu.add("2.Add new book");
        menu.add("3.Save to file");
        menu.add("4.Quit");
        int userChoice;
        BookList list = new BookList();
        list.loadBookFromFile(filename);
        do{
            System.out.println("BOOK MANAGER\n");
            userChoice = menu.getUserChoice();
            switch(userChoice) {
                case 1: list.print(); break;
                case 2: list.addNewBook(); break;
                case 3: list.saveToFile(filename);
            }
        }
        while(userChoice > 0 && userChoice < menu.size());
    }
}
