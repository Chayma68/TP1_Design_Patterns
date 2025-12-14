package tp1.ex1;

public class PathName {

    private final PathName directory;
    private final String name;

    public PathName(PathName directory, String name) {
        this.directory = directory;
        this.name = name;
    }

    public PathName getDirectory() {
        return directory;
    }

    public String getLocalName() {
        return name;
    }

    public String getPathName() {
        if (directory == null) {
            return name;
        }
        return directory.getPathName() + "/" + name;
    }

    public static PathName fromString(String path) {
        FileSystemTokenizer tokenizer = FileSystemTokenizer.getInstance();
        int index = tokenizer.lastSeparatorIndex(path);

        if (index == -1) {
            return new PathName(null, path);
        }

        PathName dir = fromString(path.substring(0, index));
        return new PathName(dir, path.substring(index + 1));
    }

}
