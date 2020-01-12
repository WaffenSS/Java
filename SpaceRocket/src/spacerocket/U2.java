package spacerocket;
import java.util.Random;

public class U2 extends Rocket{
        public int rocket_coast=1;
        public String name="U2";
        public int weight=18000;
        public int weight_limit=29000;
        
        @Override
    public boolean land()       {
        Random rand = new Random();
        double p = rand.nextDouble();
        double landChance = 0.08 *this.weight /this.weight_limit;
        if (landChance >= p){ 
            return false;
        }
        else{
            return true;
        }
    }

    
        @Override
    public boolean launch() {       
        Random rand = new Random();
        double p = rand.nextDouble();
        double launchChance = 0.04 *this.weight /this.weight_limit;
        if (launchChance >= p) {
            return false;
        }
        else{
            return true;
        }
    }
        @Override
    public boolean canCarry(İtem e) {
       if(e.weight+this.weight>weight_limit)
           return false;
       else if(e.weight+this.weight<=weight_limit)
           return true;
        return false;
    }

    public void carry(İtem e) {
       this.weight=this.weight+e.weight;
    }
}
