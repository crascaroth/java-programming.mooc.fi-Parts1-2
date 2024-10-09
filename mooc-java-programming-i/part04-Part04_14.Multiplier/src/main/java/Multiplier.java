
public class Multiplier {
    private int value = 0;

    public Multiplier(int number){
        value = number;
    }

    public int multiply(int number){
        this.value = this.value*number;
        
        
        return this.value;
    }

}
