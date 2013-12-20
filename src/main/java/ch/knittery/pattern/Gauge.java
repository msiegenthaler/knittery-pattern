package ch.knittery.pattern;

public class Gauge {

    private double width;
    private double height;
    private int countRows;
    private int countStitches;

    public Gauge(double widthInCm, int countStitches, double heightInCm, int countRows) {
        super();
        this.width = widthInCm;
        this.height = heightInCm;
        this.countRows = countRows;
        this.countStitches = countStitches;
    }

    public double getStitchesPerCm() {
        return countStitches / width;
    }

    public double getRowsPerCm() {
        return countRows / height;
    }

}
