public class Penguin extends Animal implements Walk, Swim{



    private boolean isSwimming;
    private boolean isWalking;
    private  int walkSpeed;
    private  int swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }


    public Penguin() {
        super("Penguin");
    }




    @Override
    public void eatingCompleted() {

        System.out.println("Penguin: I have eaten fish");

    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " nautical miles per hour");

    }

    @Override
    public void walking() {

        System.out.println("I am walking at the speed "+walkSpeed+" mph");


    }
}
