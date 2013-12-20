package ch.knittery.pattern;

import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Before;
import org.junit.Test;


public class PatternConverterTest {

    BufferedImage patternRawImage;
    Gauge gauge;

    @Before
    public void setUp() throws Exception {
        patternRawImage = ImageIO.read(PatternConverterTest.class
            .getResource("/ch/knittery/pattern/testPattern.png"));
        gauge = new Gauge(18.0, 50, 10.0, 50);
    }

    @Test
    public void testConvertToSchnittmuster() throws IOException {
        BufferedImage bufferedImage = PatternConverter.convertToPattern(patternRawImage, 36.0, 60.0,
            gauge);
        ImageIO.write(bufferedImage, "png", new File("target/ch/patternResult.png"));

        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        assertTrue("resulting image should have 100 x 300 pixels, but was: " + width + " x " + height,
            width == 100 && height == 300);
    }
}
