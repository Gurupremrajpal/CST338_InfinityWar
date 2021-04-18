public class SpaceStone implements IStone{
    /**
     * Used to change the location of person
     * @param person
     */
    private String stonelocation = "Earth";
    private static SpaceStone spaceStone = null;

    private SpaceStone(){

    }

    public static SpaceStone getSpaceStone(){
        if(spaceStone == null){
            spaceStone= new SpaceStone();
            spaceStone.setStonelocation("Earth");
        }
        return spaceStone;
    }

    @Override
    public void special(Person person) {
        System.out.println("person is moving from "+ person.getLocation() + " to " + this.stonelocation);
        person.setLocation(this.stonelocation);
    }

    public String getStonelocation() {
        return stonelocation;
    }

    public void setStonelocation(String stonelocation) {
        this.stonelocation = stonelocation;
    }
}
