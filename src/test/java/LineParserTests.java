import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineParserTests {
    private final String TEST_LINE    = "FishAndChips        Main        10              1";
    private final String INVALID_LINE = "FishAndChips        Main        10";


    private LineParser lineParser = new LineParser();

    @Test
    public void extractMealNameTest() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals(returnedDish.getMealName(), "FishAndChips");
    }

    @Test
    public void extractMealType() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals(returnedDish.getMealType(), "Main");
    }

    @Test
    public void extractVotesFor() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals(returnedDish.getVotesFor(), 10);
    }

    @Test
    public void extractVotesAgainst() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals(returnedDish.getVotesAgainst(), 1);
    }

    @Test
    public void nullInputAsLine() {
        Dish returnedDish = lineParser.parseLine(null);
        Assertions.assertNull(returnedDish);
    }

    @Test
    public void invalidLineTest() {
        Dish returnedDish = lineParser.parseLine(INVALID_LINE);
        Assertions.assertNull(returnedDish);
    }


}
