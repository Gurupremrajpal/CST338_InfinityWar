import java.util.HashMap;

public class InfinityWar {
    public static void main(String[] args){

        Titan thanos = new Titan("Thanos");

        HashMap<String, IStone> gauntlet = new HashMap<>();

//        PowerStone powerStone = PowerStone.getPowerStone();
//        SpaceStone spaceStone = SpaceStone.getSpaceStone();

        gauntlet.put("Power", PowerStone.getPowerStone());
        gauntlet.put("Space", SpaceStone.getSpaceStone());



        thanos.setGauntlet(gauntlet);


        SpaceStone spaceStone = SpaceStone.getSpaceStone();
        spaceStone.setStonelocation("Someplace new ");

        System.out.println(spaceStone);
        thanos.useGauntlet();


//        System.out.println("Before powerstone"+ thanos);
//        powerStone.special(thanos);
//        System.out.println("After powerstone"+ thanos);
//        spaceStone.setStonelocation("Knowwhere");
//
//        spaceStone.special(thanos);

//        Thanos thanos = new Thanos();
//        HashMap<String, IStone> stones = new HashMap<>();
//        PowerStone powerStone = new PowerStone();
//        powerStone.special(thanos);
//        SpaceStone spaceStone = SpaceStone.getInstance();
//        SpaceStone spaceStone2 = SpaceStone.getInstance();
//
//        spaceStone.setLocation("Knowwhere");
//        System.out.println(spaceStone2.getLocation());
//
//        stones.put("Space", spaceStone);
//        stones.put("Power",powerStone );
//
//        for(String stone : stones.keySet()){
//            stones.get(stone).special(thanos);
//        }
     }
}
