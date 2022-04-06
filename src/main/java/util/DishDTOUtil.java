package util;

import domain.Dish;
import dto.DishDTO;

public class DishDTOUtil {
    public static DishDTO generateDTO(Dish theDish) {
        DishDTO dishDTO = new DishDTO(theDish.getMealName(),
                theDish.getMealType(),
                theDish.getVotesFor(),
                theDish.getVotesAgainst(),
                theDish.getVotesFor() - theDish.getVotesAgainst());

        return dishDTO;
    }
}
