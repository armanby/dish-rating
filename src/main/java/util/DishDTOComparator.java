package util;

import dto.DishDTO;

import java.util.Comparator;

public class DishDTOComparator implements Comparator<DishDTO> {
    public int compare(DishDTO dto2, DishDTO dto1) {
        if (dto1.getVotesOverall() == dto2.getVotesOverall()) return 0;
        else if (dto1.getVotesOverall() > dto2.getVotesOverall()) return 1;
        else return -1;
    }
}
