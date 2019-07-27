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

        while ((inputLine = in.readLine()) != null) {
            stringArrayList.add(inputLine);
            Map<String, Long> map = stringArrayList
                    .stream()
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

            List<Map.Entry<String, Long>> result = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .collect(Collectors.toList());

            System.out.println("Gevonden aantaal : " + result);
            System.out.println("Verstreken tijd: " + (getEndTime() - getBeginTime()));
            System.out.println("--- End Binary Search ---");

        }
        in.close();


    }

}


