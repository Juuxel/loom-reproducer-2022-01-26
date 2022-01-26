package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of(args[0]), "subprojectB");
    }
}
