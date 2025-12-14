package tp1.ex2;

import java.awt.image.BufferedImage;

public class GrayFilter implements ImageFilter {
    @Override
    public BufferedImage apply(BufferedImage img) {
        return ImageOps.gray(img);
    }
}
