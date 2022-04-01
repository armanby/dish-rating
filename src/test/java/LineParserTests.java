import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineParserTests {
    private final String TEST_LINE = "FishAndChips        Main        10              1";

    LineParser lineParser = new LineParser(TEST_LINE);

    @Test
    public void extractMealNameTest() {
        String mealName = lineParser.getMealName();
        Assertions.assertEquals(mealName, "FishAndChips");
    }

    @Test
    public void extractVotesFor() {
        int votesFor = lineParser.getVotesFor();
        Assertions.assertEquals(votesFor, 10);
    }

    @Test
    public void extractVotesAgainst() {
        int votesFor = lineParser.getVotesAgainst();
        Assertions.assertEquals(votesFor, 1);
    }

    @Test
    public void extractMealType() {
        String mealType = lineParser.getMealType();
        Assertions.assertEquals(mealType, "Main");
    }
}
