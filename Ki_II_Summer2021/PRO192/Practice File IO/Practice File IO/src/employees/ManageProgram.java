
package employees;

import java.io.IOException;
import java.util.Scanner;


public class ManageProgram {
    public static void main(String[] args){
        String filename= "Employee.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("1.Add new empoyee");
        menu.add("2.Remove new empoyee");
        menu.add("3.Promotin the empoyee's salary");
        menu.add("4.Print the list");
        menu.add("5.Save to files");
        menu.add("6.Quit");
        int userChoice;
        boolean changed = false;
        Emplist list = new Emplist();
        list.AddFromFile(filename);
        do{
            System.out.println("EMPLOYEE MANAGER\n");
            userChoice = menu.getUserChoice();
            switch(userChoice) {
                case 1: list.addNewEmp(); changed = true; break;
                case 2: list.removeEmp(); changed = true; break;
                case 3: list.promote();changed = true; break;
                case 4: list.print(); break;
                case 5: list.saveToFile(filename); changed = false; 
                default : if(changed) {
                    System.out.println("Save changed Y/N? ");
                    String response= sc.nextLine().toUpperCase();
                    if(response.startsWith("Y"))
                        list.saveToFile(filename);
                }
            }
        }
        while(userChoice >0 && userChoice < 6) ;
    }
}
