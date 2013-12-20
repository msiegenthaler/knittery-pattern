package ch.knittery.pattern;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;


/**
 * The PatternConverter helps converting images to the knitting patterns which could be knitted on
 * the KH-930
 * 
 */
public class PatternConverter {
    /**
     * converts a given pattern image with high resolution to the knitting pattern for the KH-930
     * 
     * @param patternRawImg
     * @param widthInCm
     * @param heightInCm
     * @param gauge
     * @return
     */
    public static BufferedImage convertToPattern(Image patternRawImg, double widthInCm,
        double heightInCm, Gauge gauge) {
        int countStitches = (int) (widthInCm * gauge.getStitchesPerCm());
        int countRows = (int) (heightInCm * gauge.getRowsPerCm());

        Image scaledImg = patternRawImg.getScaledInstance(countStitches, countRows,
            BufferedImage.SCALE_DEFAULT);

        BufferedImage bufferedImage = new BufferedImage(countStitches, countRows,
            BufferedImage.TYPE_INT_RGB);

        bufferedImage.getGraphics().drawImage(scaledImg, 0, 0, Color.RED, null);

        return bufferedImage;
    }
}
