
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        
        // Check whether objects real type if Bird, otherwise return false
        if(!(object instanceof Bird)){
            return false;
        }
        
        // Since we now know it is an object we can convert it's type
        Bird bird = (Bird) object;
        
        if (!this.latinName.equals(bird.getLatinName())){
            return false;
        }
        
        if(this.ringingYear != bird.getRingingYear()){
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode(){
        return this.ringingYear * this.latinName.hashCode();
    }
    
    private String getLatinName(){
        return this.latinName;
    }
    
    private int getRingingYear(){
        return this.ringingYear;
    }
    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


