import java.net.MalformedURLException;
import java.net.URL;

public abstract class Source {

    public static URL url;
    static {
        try {
            url = new URL("https://en.wikipedia.org/wiki/Open-source_intelligence");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public int countPages;
    public int sumWords;
    public long beginTime;
    public long endTime;

    public int getCountPages() {
        return countPages++;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public int getSumWords() {
        return sumWords++;
    }

    public void setSumWords(int sumWords) {
        this.sumWords = sumWords;
    }

    public long getBeginTime() {
        return System.nanoTime();
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public long getEndTime() {
        return System.nanoTime();
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
