package dogproject;

/*
/* Yorkshire.java 
/* A class derived from Dog that holds information about 
/* a Yorkshire terrier. Overrides Dog speak method.  
 */
public class Yorkshire extends Dog {

    public Yorkshire(String name) {
        super(name);
    }
    int weight = 50;
    /*
    /* Small bark -- overrides speak method in Dog 
    */
    public String speak() {
        return "woof";
    }
    public int avgBreedWeight() {
        return this.weight;
    }
}
