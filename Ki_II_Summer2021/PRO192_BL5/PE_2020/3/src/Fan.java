/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Fan {
    
   double price;
   String code;

    public Fan() {
    }

    public Fan(String code, double price) {
        this.price = price;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }
          
    
   
   
   
    
}
