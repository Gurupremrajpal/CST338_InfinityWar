/**
 * @author Guruprem
 *
 * Concrete implementation of the IStone class.
 * This class will raise the Power of a Person.
 */

//TODO: Make this a singleton, may need to update IStone
public class PowerStone implements IStone {
    private final int RAISE_POWER = 2;
    private static PowerStone powerStone = null;

    private PowerStone(){

    };
    public static PowerStone getPowerStone(){

      if(powerStone == null){
          powerStone = new PowerStone();
          //do any setup necessary to use the object
      }
        return powerStone;
    };

    @Override
    public void special(Person person) {
        //TODO: Implement PowerStone special
        System.out.println("Powering UP!");
        System.out.println("Current power "+ person.getPower());
        int power = person.getPower();
        power= power * RAISE_POWER;
        person.setPower(power);
        System.out.println("New power "+ person.getPower());

        /**
         * line 15,16,17 can also be done like this
         * person.setPower(person.getPower()*RAISE_POWER);
         */

    }
}
