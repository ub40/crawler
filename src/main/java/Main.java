public class Main {

    public static void main(String[] args) {


        CountPages countPages = new CountPages();
        CountAllWords countAllWords = new CountAllWords();
        try {
            countPages.countPages();
            countAllWords.countWords();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
