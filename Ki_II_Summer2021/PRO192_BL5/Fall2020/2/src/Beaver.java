/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dungc
 */
public class Beaver {
    String river;
    int feature;

    public Beaver() {
    }

    public Beaver(String river, int feature) {
        this.river = river;
        this.feature = feature;
    }

    public String getRiver() {
        return river;
    }

    public int getFeature() {
        return feature;
    }

    public void setFeature(int feature) {
        this.feature = feature;
    }
    

    public void setRiver(String river) {
        this.river = river;
    }

    @Override
    public String toString() {
        return river + "," + feature;
    }

    
    
    
    
    
}
