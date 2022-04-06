import domain.Dish;
import dto.DishDTO;
import util.DishDTOUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser {

    private RatingFileReader ratingFileReader;

    public FileParser(BufferedReader bufferedReader) {
        ratingFileReader = new RatingFileReader(bufferedReader);
    }

    public ArrayList<DishDTO> parseFile() throws IOException {
         /*
             open filereader for file
             read line of file
             parse line
             add to array
             go back and do calcs and sorting
         */

        String line = ratingFileReader.readLineOfFile();
        ArrayList<DishDTO> dishes = new ArrayList<>();
        LineParser parser = new LineParser();

        while(line != null) {
            Dish currentDish = parser.parseLine(line);

            if(currentDish != null) {
                dishes.add(DishDTOUtil.generateDTO(currentDish));
            }

            line = ratingFileReader.readLineOfFile();
        }

        return dishes;
    }
}
