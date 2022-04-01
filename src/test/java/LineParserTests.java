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
}
