package JUnitProblems;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileProcessor {
    public static void writeFile(String filename, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(content);
        }
    }
    public static String readFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString().trim();
        }
    }
    public static void main(String[] args) {
        try {
            writeFile("Data.txt", "Hello, JUnit File Testing!");
            System.out.println("Done");

            String data = readFile("Data.txt");
            System.out.println("File Content: " + data);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
class FileProcessorTest {
    @TempDir
    Path tempDir;

    @Test
    void testWriteAndReadFile() throws IOException {
        Path filePath = tempDir.resolve("Data.txt");
        FileProcessor.writeFile(filePath.toString(), "JUnit File Testing");

        assertTrue(Files.exists(filePath));
        assertEquals("JUnit File Testing", FileProcessor.readFile(filePath.toString()));
    }

    @Test
    void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFile("notExitFile.txt"));
    }
}