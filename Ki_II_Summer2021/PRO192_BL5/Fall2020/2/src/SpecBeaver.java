
/*
    + setData():void - Increase feature by 15
    + getValue():int - ccck if river contains "YS" then return feature * 3, otherwise return feature * 4;
*/
public class SpecBeaver extends Beaver {

    private int weight;

    public SpecBeaver() {
    }

    public SpecBeaver(String river, int feature, int weight) {
        super(river, feature);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.getRiver() + "," + super.getFeature() + "," + weight;
    }

    public void setData() {
        int newFeature = 15 + super.getFeature();
        super.setFeature(newFeature);
    }

    public int getValue() {
        int newFeature = 0;
        if (super.getRiver().contains("YX")) {
            newFeature = super.getFeature() * 3;
        } 
        else 
        {
            newFeature = super.getFeature() * 4;
        }
        return newFeature;
    }

}

/*
TEST1:
Enter river: bala
Enter feature: 6
Enter weight: 9
1. Test toString()
2. Test setData()
3. Test getValue()
Enter TC (1,2,3): 1
OUTPUT:
bala,6
bala,6,9
*/

/*
TEST2:
Enter river: bala
Enter feature: 6
Enter weight: 9
1. Test toString()
2. Test setData()
3. Test getValue()
Enter TC (1,2,3): 2
OUTPUT:
bala, 21
*/

/*
TEST3:
Enter river: balaYXla
Enter feature: 6
Enter weight: 9
1. Test toString()
2. Test setData()
3. Test getValue()
Enter TC (1,2,3): 3
OUTPUT:
18
*/

/*
TEST4:
Enter river: bala
Enter feature: 6
Enter weight: 9
1. Test toString()
2. Test setData()
3. Test getValue()
Enter TC (1,2,3): 3
OUTPUT:
24
*/
