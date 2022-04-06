import domain.Dish;
import dto.DishDTO;
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
    private static BufferedReader bufferedReader;

    @BeforeAll
    public static void setUp() throws IOException {
        bufferedReader = Mockito.mock(BufferedReader.class);

        fileParser = new FileParser(bufferedReader);
    }

    @Test
    public void parseFileTest() throws IOException {
        Mockito.when(bufferedReader.readLine()).thenReturn(TEST_LINE[0]).thenReturn(TEST_LINE[1]).thenReturn(null);

        DishDTO first = new DishDTO("FishAndChips", "Main", 10, 1, 10-1);
        DishDTO second = new DishDTO("BeansAndChips", "Main", 4, 2, 4-2);
        ArrayList<DishDTO> dishes = new ArrayList<>();
        dishes.add(first);
        dishes.add(second);
        ArrayList<DishDTO> returnedDishes = fileParser.parseFile();

        // Convert to JSON and assert on not equals?
    }
}
