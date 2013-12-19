package ch.knittery.pattern;

public class Gauge {

    private double width;
    private double height;
    private int countRows;
    private int countStitches;

    public Gauge(double width, double height, int countRows, int countMaschen) {
        super();
        this.width = width;
        this.height = height;
        this.countRows = countRows;
        this.countStitches = countMaschen;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getCountRows() {
        return countRows;
    }

    public int getCountStitches() {
        return countStitches;
    }

}
