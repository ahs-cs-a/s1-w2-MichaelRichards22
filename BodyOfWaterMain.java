public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake", 400, 300, false);
        BodyOfWater b2 = new BodyOfWater("Pond", 85, 58.9, false);

        b.printState();
        b2.printState();
        b2.SetName("Slough");
        b2.printState();
    }
}
