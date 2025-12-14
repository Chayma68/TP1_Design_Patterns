package tp1.ex2;

import java.awt.image.BufferedImage;

public class RotateFilter implements ImageFilter {
    @Override
    public BufferedImage apply(BufferedImage img) {
        return ImageOps.rotate(img);
    }
}
