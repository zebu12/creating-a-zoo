public class Dolphin extends Animal implements Swim {


    private String colorOfDolphin;
    private int swimmingSpeed;

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin() {

        super("Dolphin");
    }


    @Override
    public void eatingCompleted() {

        System.out.println("Dolphin: I have eaten fish");

    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
}
