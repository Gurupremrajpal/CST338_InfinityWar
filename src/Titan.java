import java.util.HashMap;

public class Titan extends Person {

    private String name;
    private HashMap<String,IStone> gauntlet;

    public Titan(String name){
        this.name= name;
        this.power= 10;
        this.location= "Titan";
    }


    public HashMap<String, IStone> getGauntlet() {
        return gauntlet;
    }

    public void setGauntlet(HashMap<String, IStone> gauntlet) {
        this.gauntlet = gauntlet;
    }
    public void useGauntlet(){
        for(String stone : gauntlet.keySet()) {
            System.out.println("Using " + stone);
            System.out.println(gauntlet.get(stone));
            gauntlet.get(stone).special(this);
        }
    }
    @Override
    public String toString() {
        return "Titan{" +
                "power=" + power +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
