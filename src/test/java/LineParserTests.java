import domain.Dish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineParserTests {
    private final String TEST_LINE    = "FishAndChips        Main        10              1";
    private final String MISSING_DATAFIELD = "FishAndChips        Main        10";
    private final String INVALID_VOTES_FOR     = "FishAndChips        Main        -10       1";
    private final String INVALID_VOTES_AGAINST = "FishAndChips        Main        10       -1";
    private final String BOTH_VOTES_NEGATIVE = "FishAndChips        Main        -10       -1";

    private LineParser lineParser = new LineParser();

    @Test
    public void extractMealNameTest() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals("FishAndChips", returnedDish.getMealName());
    }

    @Test
    public void extractMealType() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals("Main", returnedDish.getMealType());
    }

    @Test
    public void extractVotesFor() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals(10, returnedDish.getVotesFor());
    }

    @Test
    public void extractVotesAgainst() {
        Dish returnedDish = lineParser.parseLine(TEST_LINE);
        Assertions.assertEquals(1, returnedDish.getVotesAgainst());
    }

    @Test
    public void nullInputAsLine() {
        Dish returnedDish = lineParser.parseLine(null);
        Assertions.assertNull(returnedDish);
    }

    @Test
    public void missingDataField() {
        Dish returnedDish = lineParser.parseLine(MISSING_DATAFIELD);
        Assertions.assertNull(returnedDish);
    }

    @Test
    public void votesForIsNegative() {
        Dish returnedDish = lineParser.parseLine(INVALID_VOTES_FOR);
        Assertions.assertNull(returnedDish);
    }

    @Test
    public void votesAgainstIsNegative() {
        Dish returnedDish = lineParser.parseLine(INVALID_VOTES_AGAINST);
        Assertions.assertNull(returnedDish);
    }

    @Test
    public void bothVotesAreNegative() {
        Dish returnedDish = lineParser.parseLine(BOTH_VOTES_NEGATIVE);
        Assertions.assertNull(returnedDish);
    }

}
