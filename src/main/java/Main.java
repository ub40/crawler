public class Main {

    public static void main(String[] args) {

        CountWords countWords = new CountWords();
        CountPages countPages = new CountPages();
        try {
            countPages.countPages();
//            countWords.countCommonWords();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
