/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;


public class Point {
    int x;
    int y;
    boolean checked;
    
    Point() {
        x = y = 0;
    }
    
    Point(int inp_x, int inp_y) {
       this.x = inp_x;
       this.y = inp_y;   
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
//    public 
            
    public boolean getStatus(){
        return checked;
    }
    @Override      
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

