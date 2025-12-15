package tp1.ex2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class Convertir {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage : java Convertir filter.txt image.gif");
            return;
        }
        File filterFile = new File(args[0]);
        File imageFile = new File(args[1]);
        BufferedImage image = Images.load(imageFile);
        List<ImageFilter> filters = FilterLoader.loadFilters(filterFile);
        for (ImageFilter filter : filters) {
            image = filter.apply(image);
        }
        File output = new File(imageFile.getName() + ".png");
        Images.saveAsPNG(output, image);
        System.out.println("Conversion terminée : " + output.getName());
    }
}
