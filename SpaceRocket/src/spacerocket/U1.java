package spacerocket;
import java.util.Random;
public class U1 extends Rocket{
        public int rocket_coast=1;
        public String name="U1";
        public int weight=10000;
        public int weight_limit=18000;
   
        @Override
    public boolean land() {      
        Random rand = new Random();
        double a = rand.nextDouble();
        double landChance=0.01*this.weight/this.weight_limit;
        if(a<=landChance)
            return false;
        else{
            return true;
        }
    }

    @Override
    public boolean launch() {
        
        Random r=new Random();
        double a=r.nextDouble();
        double launchChance=0.04*this.weight/this.weight_limit;
        if(a<=launchChance)
            return false;
        else
            return true;
    }
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
