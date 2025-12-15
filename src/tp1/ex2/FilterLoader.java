package tp1.ex2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FilterLoader {
    public static List<ImageFilter> loadFilters(File file) throws Exception {
        List<ImageFilter> filters = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String name = sc.nextLine().trim();
                if (name.isEmpty()) continue; // ignore lignes vides
                filters.add(FilterFactory.createFilter(name));
            }
        }
        return filters;
    }
}
