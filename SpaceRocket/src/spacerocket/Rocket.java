package spacerocket;
public class Rocket implements SpaceShip{
    public String name;
    public int weight;
    public int weight_limit;
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(İtem e) {
       if(e.weight+this.weight>weight_limit)
           return false;
       else if(e.weight+this.weight<=weight_limit)
           return true;
        return false;
    }

    @Override
    public void carry(İtem e) {
       this.weight=this.weight+e.weight;
    }
}