package spark.suikero.spark;

public class Sentinel {

    private String sentinelName;
    private int sentinelPoints;


    //Constructor
    public Sentinel() {

    }

    //Constructor for the name
    public Sentinel(String sentinelName) {

        this.sentinelName = sentinelName;

    }

    public Sentinel(String sentinelName, int sentinelPoints) {

        this.sentinelName = sentinelName;
        this.sentinelPoints = sentinelPoints;

    }

    public String getSentinelName() {
        return sentinelName;
    }

    public void setSentinelName(String sentinelName) {
        this.sentinelName = sentinelName;
    }

    public int getSentinelPoints() {
        return sentinelPoints;
    }

    public void setSentinelPoints(int sentinelPoints) {
        this.sentinelPoints = sentinelPoints;
    }

    @Override
    public String toString() {
        return "Sentinel{" +
                "sentinelName='" + sentinelName + '\'' +
                ", sentinelPoints=" + sentinelPoints +
                '}';
    }
}
