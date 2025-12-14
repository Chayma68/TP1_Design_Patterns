package tp1.ex2;

import java.util.Map;

public class FilterFactory {

    private static final Map<String, ImageFilter> FILTERS = Map.of(
            "gray", new GrayFilter(),
            "blur", new BlurFilter(),
            "rotate", new RotateFilter()
    );

    public static ImageFilter createFilter(String name) {
        ImageFilter filter = FILTERS.get(name.toLowerCase());
        if (filter == null) {
            throw new IllegalArgumentException("Filtre inconnu : " + name);
        }
        return filter;
    }
}
