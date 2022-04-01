import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {

    private RatingFileReader ratingFileReader;

    public FileParser(BufferedReader bufferedReader) {

        ratingFileReader = new RatingFileReader(bufferedReader);


    }

    public ArrayList<Dish> parseFile() throws IOException {
         /*
             open filereader for file
             read line of file
             parse line
             add to array
             go back and do calcs and sorting
         */

        String line = ratingFileReader.readLineOfFile();
        ArrayList<Dish> dishes = new ArrayList<>();

        while(line != null) {
            LineParser parser = new LineParser(line);
            Dish currentDish = parser.getCurrentDish();
            dishes.add(currentDish);
            line = ratingFileReader.readLineOfFile();
        }

        return dishes;
    }
}
