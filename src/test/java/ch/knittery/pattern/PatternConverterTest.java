package ch.knittery.pattern;

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
        gauge = new Gauge(0, 0, 0, 0);
    }

    @Test
    public void testConvertToSchnittmuster() throws IOException {
        BufferedImage bufferedImage = PatternConverter.convertToPattern(patternRawImage, gauge);
        ImageIO.write(bufferedImage, "png", new File("target/ch/patternResult.png"));
    }
}
