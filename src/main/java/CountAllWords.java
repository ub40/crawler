import java.io.*;

public class CountAllWords extends Source {
    BufferedReader in;
    String inputLine = "";

    public void countWords() throws Exception {

        in = new BufferedReader(new InputStreamReader(Source.url.openStream()));
        while ((inputLine = in.readLine()) != null) {
            String[] words = inputLine.split("\\s+");
            sumWords += words.length;
        }
        System.out.println("totaal aantal woorden is: " + sumWords);
        System.out.println("Verstreken tijd: " + (getEndTime() - getBeginTime()));
        System.out.println("--- End Binary Search ---");
        in.close();

    }
}