package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0){
            throw new IllegalArgumentException("Weight cannot be less than zero.");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        
        // Check whether objects real type if Thing, otherwise return false
        if(!(object instanceof Thing)){
            return false;
        }
        
        // Since we now know it is an object we can convert it's type
        Thing thing = (Thing) object;
        
        if (!this.name.equals(thing.getName())){
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }

    
}
