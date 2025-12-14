package tp1.ex2;

import java.awt.image.BufferedImage;
import java.io.File;

public class TestFilters {

    public static void main(String[] args) throws Exception {

        BufferedImage img = Images.load(new File("image.gif"));

        ImageFilter f1 = new GrayFilter();
        ImageFilter f2 = new RotateFilter();
        ImageFilter f3 = new BlurFilter();

        img = f1.apply(img);
        img = f2.apply(img);
        img = f3.apply(img);

        Images.saveAsPNG(new File("test_q2.png"), img);

        System.out.println("OK -> test_q2.png");
    }
}
