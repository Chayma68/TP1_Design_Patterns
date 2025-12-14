package tp1.ex1;

public class TestPathName {

    public static void main(String[] args) {

        System.out.println("OS détecté = " + System.getProperty("os.name"));

        PathName unix = PathName.fromString("home/user/docs/file.txt");
        System.out.println("Unix : " + unix.getPathName());

        PathName windows = PathName.fromString("C:\\Users\\hp\\Docs\\file.txt");
        System.out.println("Windows : " + windows.getPathName());

        PathName mac = PathName.fromString("MacHD:Users:hp:Docs:file.txt");
        System.out.println("Mac : " + mac.getPathName());
        System.out.println("Singleton ? " +
                (FileSystemTokenizer.getInstance() == FileSystemTokenizer.getInstance()));

    }
}
