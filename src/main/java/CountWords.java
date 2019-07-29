import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CountWords extends Source {

    BufferedReader in;
    String inputLine;
    ArrayList<String> stringArrayList = new ArrayList<>();


    public void countCommonWords() throws Exception {

        in = new BufferedReader(new InputStreamReader(Source.url.openStream()));

        String strRegEx = "<[^>]*>";
        while ((inputLine = in.readLine()) != null) {

            stringArrayList.add(inputLine.replaceAll(strRegEx, ""));


//            System.out.println("Gevonden aantaal : " + result);
            System.out.println("Verstreken tijd: " + (getEndTime() - getBeginTime()));
            System.out.println("--- End Binary Search ---");

        }
        in.close();


    }

}
