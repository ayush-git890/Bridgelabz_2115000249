import java.util.*;
import java.io.*;
class WriterThread extends Thread {
    private PipedOutputStream pipeOutout;
    public WriterThread(PipedOutputStream pipeOutout) {
        this.pipeOutout = pipeOutout;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String str = "ayush " + i;
                pipeOutout.write(str.getBytes());
                pipeOutout.write('\n');
                System.out.println("wroted--> " + str);
                Thread.sleep(500);
            }
            pipeOutout.close();
        } catch (IOException | InterruptedException e) {
            System.out.println("writer error--> " + e.getMessage());
        }
    }
}
class ReaderThread extends Thread {
    private PipedInputStream pipeInput;
    public ReaderThread(PipedInputStream pipeInput) {
        this.pipeInput = pipeInput;
    }
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(pipeInput))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("read--> " + line);
            }
        } catch (IOException e) {
            System.out.println("reader error--> " + e.getMessage());
        }
    }
}
public class P8_PipedStreams {
    public static void main(String[] args) {
        try {
            PipedOutputStream pipeOutout = new PipedOutputStream();
            PipedInputStream pipeInput = new PipedInputStream(pipeOutout);

            WriterThread wt = new WriterThread(pipeOutout);
            ReaderThread rt = new ReaderThread(pipeInput);

            wt.start();
            rt.start();
        } catch (IOException e) {
            System.out.println("pipe error--> " + e.getMessage());
        }
    }
}