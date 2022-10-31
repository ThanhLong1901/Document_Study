/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dungc
 */
public class Balloon {
    private String owner;
    private int color;

    public Balloon() {
    }

    public Balloon(String owner, int color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner.toUpperCase();
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
/*
TEST1:
Enter owner: canh
Enter color: 7
1. Test getOwner()
2. Test setColor()
Enter TC (1 or 2): 1
OUTPUT:
CANH
*/
    
/*
TEST2:
Enter owner: canh
Enter color: 7
1. Test getOwner()
2. Test setColor()
Enter TC (1 or 2): 2
Enter new color: 15
OUTPUT:
15
*/
    
}
