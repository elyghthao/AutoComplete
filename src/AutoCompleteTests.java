import org.junit.Test;

public class AutoCompleteTests {

    @Test
    public void testOne(){
        String[] wordBank = {"hello", "high", "seattle", "seatac", "see", "hollow", "how"};
//        String[] wordBank = {"see", "sea","seattle"};
        AutoComplete Google = new AutoComplete(wordBank);
//        Google.search("se");
        System.out.println(Google.search("ho"));

    }


    @Test
    public void testTwo() {

    }
}
