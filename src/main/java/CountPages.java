import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountPages extends Source {
    BufferedReader in;

    public void countPages() throws Exception {
        in = new BufferedReader(new InputStreamReader(Source.url.openStream()));
        Scanner scanner = new Scanner(Source.url.openStream());

        while (scanner.hasNext()) {
            String line = scanner.next();

            setSumWords(sumWords++);

            if ( line.contains("href=\"http://")) {
                int startLine = line.indexOf("\"");
                int endLine = line.lastIndexOf("\"");
                setCountPages(countPages++);
                System.out.println(countPages + ") " + line.substring(startLine + 1, endLine) + " Bevat " + getSumWords() + " paginas");
                System.out.println("Verstreken tijd: " + (getEndTime() - getBeginTime()));
                System.out.println("--- End Binary Search ---");
            }
        }
    }

}
