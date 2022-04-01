import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;

// 10:50 - 11:35
@DisplayName("FileReader Tests")
public class FileReaderTests  {
    private static final String TEST_LINE = "FishAndChips        Main        10              1";

    private static RatingFileReader ratingFileReader = null;

    @BeforeAll
    public static void setUp() throws IOException {
        BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.readLine()).thenReturn(TEST_LINE).thenReturn(null);

        ratingFileReader = new RatingFileReader(bufferedReader);
    }

    @Test
    public void fileLineReaderTest() throws IOException {
        String mockRet = ratingFileReader.readLineOfFile();
        Assertions.assertEquals(TEST_LINE, mockRet);
    }

}
