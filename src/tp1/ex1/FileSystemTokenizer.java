package tp1.ex1;

public class FileSystemTokenizer {

    private static FileSystemTokenizer instance;
    private final char[] separators;

    private FileSystemTokenizer() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            separators = new char[]{'\\'};
        } else if (os.contains("mac")) {
            separators = new char[]{'/', ':'};
        } else {
            separators = new char[]{'/'};
        }
    }

    public static FileSystemTokenizer getInstance() {
        if (instance == null) {
            instance = new FileSystemTokenizer();
        }
        return instance;
    }

    public int lastSeparatorIndex(String path) {
        int max = -1;
        for (char sep : separators) {
            int idx = path.lastIndexOf(sep);
            if (idx > max) {
                max = idx;
            }
        }
        return max;
    }

    public char[] getSeparators() {
        return separators;
    }
}
