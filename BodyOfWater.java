public class BodyOfWater {
    String name;
    int largestDiameter;
    double avgDepth;
    boolean isSaltWater;

    public BodyOfWater (String n, int x, double avg, boolean i) {
        name = n;
        largestDiameter = x;
        avgDepth = avg;
        isSaltWater = i;
    }

    public void SetName (String n) {
        name = n;
    }

    public void SetAvg (double d) {
        avgDepth = d;
    }

    public void printState () {
        System.out.println("Name: " + name);
        System.out.println("Largest Diameter: " + largestDiameter);
        System.out.println("Average Depth: " + avgDepth);
        System.out.println("Water is salty: " + isSaltWater);
    }
}
