package dogproject;

/*
/* Labrador.java  
/* A class derived from Dog that holds information about 
/* a labrador retriever. Overrides Dog speak method and includes 
/* information about avg weight for this breed.  
 */
public class Labrador extends Dog {

    private String color; //black, yellow, or chocolate? 
    private static int breedWeight = 75;
    private static int numberOfLabrador = 0;
    private int weight;
    private String id;
           

    public Labrador(String name, String color) {
        super(name) ;
        this.color = color;
        numberOfLabrador++;
        id = "Lab" + numberOfLabrador;
    }
    
    /* 
    /* Big bark -- overrides speak method in Dog 
    */ 
    
    @Override
    public String speak() {
        return "WOOF";
    }
    
    public String getID(){
        return id;
}
    
    
    /*
    /* Returns weight 
    */ 
    public static int avgBreedWeight() {
        return breedWeight;
    }
}
