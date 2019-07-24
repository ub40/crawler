import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class CountPages implements Source {
    BufferedReader in;

    String inputLine;
    ArrayList<String> stringArrayList = new ArrayList<>();
    long begin = System.nanoTime();
    long end = System.nanoTime();
    int countPages = 0;
    int sumWords = 0;

    public void countPages() {

        url = new URL("https://en.wikipedia.org/wiki/Open-source_intelligence");
        in = new BufferedReader(new InputStreamReader(url.openStream()));
        Scanner scanner = new Scanner(url.openStream());
        while (scanner.hasNext()) {
            String line = scanner.next();
            sumWords++;
            if ( line.contains("href=\"http://")) {
                int startLine = line.indexOf("\"");
                int endLine = line.lastIndexOf("\"");
                countPages++;
                System.out.println(countPages + ") " + line.substring(startLine + 1, endLine) + " Bevat " + sumWords + " woorden");
                System.out.println("Verstreken tijd: " + (end - begin));
                System.out.println("--- End Binary Search ---");
            }
        }
    }

}
