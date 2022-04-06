import dto.DishDTO;
import util.DishDTOComparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class DishRatingApplication {
    public static void main(String[] args) {
        File file = null;

        try {
            URL resource = DishRatingApplication.class.getClassLoader().getResource("dishRatings.txt");

            if (resource == null) {
                throw new IllegalArgumentException("file not found");
            } else {
                file = new File(resource.toURI());
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileParser fileParser = new FileParser(bufferedReader);
            ArrayList<DishDTO> dishes = fileParser.parseFile();

            Collections.sort(dishes, new DishDTOComparator());

            for(DishDTO dto: dishes) {
                System.out.println(dto.getMealName() + " - " + dto.getVotesOverall());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
