import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CountWords {

    BufferedReader in;
    URL url;
    String inputLine;
    ArrayList<String> stringArrayList = new ArrayList<>();
    long begin = System.nanoTime();
    long end = System.nanoTime();
    int countPages = 0;
    int sumWords = 0;

    public void coudnCommonWords() throws Exception {

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
            System.out.println("Verstreken tijd : " + (end - begin));
            System.out.println("--- End Binary Search ---");

        }
        in.close();


        }

}


