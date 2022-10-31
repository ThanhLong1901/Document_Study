
package mainstudent;



public class Student extends Person {
    
    public double score;
    
    public void setScore(double score) {
        this.score = score;
    }
       
    public double getScore() {
        return score;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Score\t\t:" + this.getScore());

   
}  
}
  
