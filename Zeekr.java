public class Zeekr extends Cars{
    public Zeekr(String TypeZkr, int wheelZkr) {
        setType(TypeZkr);
        setWheels(wheelZkr);
    }

    void zkrDetails() {
        System.out.println("This what we can find about this car: " + getType());
        System.out.println("And of course the has " + getWheels() + " wheels.");
    }
}
