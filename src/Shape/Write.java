package Shape;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {
    private final String pathToFile;
    private boolean append = false;

    public Write (String path) {
        pathToFile = path;
    }

    public Write (String path, boolean value) {
        pathToFile = path;
        append = value;
    }

    public void fileWrite (String text) throws IOException {
        FileWriter writeToFile = new FileWriter(pathToFile, append);
        PrintWriter print = new PrintWriter(writeToFile);
        print.print(text);
        print.close();
    }
}
