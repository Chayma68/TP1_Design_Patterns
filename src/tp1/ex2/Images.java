package tp1.ex2;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {
    private Images() {
    }

    public static BufferedImage load(File file) throws IOException {
        BufferedImage image=ImageIO.read(file);
        if (ColorModel.getRGBdefault().equals(image.getColorModel()))
            return image;

        // normalize
        BufferedImage bufferedImage=new BufferedImage(
                image.getWidth(),image.getHeight(),BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);
        g2.dispose();
        return bufferedImage;
    }

    public static void saveAsPNG(File file,BufferedImage image) throws
            IOException {
        ImageIO.write(image,"png",file);
    }
}