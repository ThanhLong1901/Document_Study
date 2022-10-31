package mainstudent;

import java.util.Calendar;

public class Person {    
    public String name;
    public String code;
    public int Year;
    
    
    //Contructor
//    public Person(String vName, String vCode, int vYear) {
//        this.name = vName;
//        this.code = vCode;
//        this.Year = vYear;
//    }

    
    
    //Setter
    public void setName(String vName) {
        this.name = vName;
    }
    
    public void setCode(String vCode) {
        this.code = vCode;
    }

    public void setYear(int vYear) {
        this.Year = vYear;
    }

    
    
    //Getter
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getYear() {
        return Year;
    }
    
    public int getAge() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getYear();
    }
    
    //Show Person Info
    public void showInfo(){
        System.out.println("====================");
        System.out.println("Person Info: ");
        System.out.println("Name\t\t:" + this.getName());
        System.out.println("ID\t\t:" + this.getCode());
        System.out.println("Date\t\t:" + this.getYear());
        System.out.println("Age\t\t:" + this.getAge());
    }
}
    

