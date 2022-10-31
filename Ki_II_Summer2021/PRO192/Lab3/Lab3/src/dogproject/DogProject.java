
package dogproject;

public class DogProject {

    public static void main(String[] args) {
        Yorkshire yo = new Yorkshire("Yorkshire");
        System.out.println(yo.getName() + " says " + yo.speak());
        
        
        Dog injuredDog = new Dog("Kiki"){
            @Override
            public String speak(){;
            return null;
            }
            
            public String getInfo(){
                return name;
            }

            @Override
            int avgBreedWeight() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        System.out.println(injuredDog.getName() + " says " + injuredDog.speak() );
        
//        System.out.println("Avarage weight of Yorkshire: " + yo.avgBreedWeight());
//        
//        Labrador la = new Labrador("Labrador", "red");
//        System.out.println("Avarage weight of Labrador: " + la.avgBreedWeight());
//        
//        System.out.println(la.getName() + " says " + la.speak());
    }

}
