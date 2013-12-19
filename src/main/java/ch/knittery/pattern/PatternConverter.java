package ch.knittery.pattern;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;


public class PatternConverter {
    public static BufferedImage convertToPattern(Image schnittImg, Gauge maschenProbe) {
        int width = schnittImg.getWidth(null);
        int height = schnittImg.getHeight(null);

        Image scaledImg = schnittImg
            .getScaledInstance(width / 2, height / 2, BufferedImage.SCALE_SMOOTH);

        BufferedImage bufferedImage = new BufferedImage(width / 2, height / 2,
            BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(scaledImg, 0, 0, Color.RED, null);

        return bufferedImage;
    }
}
