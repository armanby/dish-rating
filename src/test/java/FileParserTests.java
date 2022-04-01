import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParserTests {

    private static final String[] TEST_LINE = {"FishAndChips        Main        10              1",
                                               "BeansAndChips        Main        4              2"};

    private static FileParser fileParser;

    @BeforeAll
    public static void setUp() throws IOException {
        BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.readLine()).thenReturn(TEST_LINE[0]).thenReturn(TEST_LINE[1]).thenReturn(null);

        fileParser = new FileParser(bufferedReader);
    }

    @Test
    public void parseFileTest() throws IOException {
        Dish first = new Dish("FishAndChips", "Main", 10, 1);
        Dish second = new Dish("BeansAndChips", "Main", 4, 2);
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(first);
        dishes.add(second);
        ArrayList returnedDishes = fileParser.parseFile();

        // Convert to JSON and assert on not equals?
    }
}
