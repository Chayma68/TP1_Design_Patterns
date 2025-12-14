package tp1.ex2;

import java.awt.image.BufferedImage;

public class BlurFilter implements ImageFilter {
    @Override
    public BufferedImage apply(BufferedImage img) {
        return ImageOps.blur(img);
    }
}
