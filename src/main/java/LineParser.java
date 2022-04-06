import domain.Dish;

public class LineParser {

    private static final int EXPECTED_LINE_PARTS = 4;

    private static final int DISH_NAME = 0;
    private static final int DISH_TYPE = 1;
    private static final int VOTES_FOR = 2;
    private static final int VOTES_AGAINST = 3;

    public Dish parseLine(String line) {
        Dish parsedDish = null;

        if(line != null) {
            // Have to use a regex here as split(" ") is insufficient
            // due to multiple whitespaces in the input between the
            // data we are interested in.
            String parts[] = line.split("\\s+");

            if(parts.length == EXPECTED_LINE_PARTS) {

                if(parts[VOTES_FOR].matches("\\d+") && parts[VOTES_AGAINST].matches("\\d+")) {
                    int votesFor = Integer.parseInt(parts[VOTES_FOR]);
                    int votesAgainst = Integer.parseInt(parts[VOTES_AGAINST]);
                    parsedDish = new Dish(parts[DISH_NAME], parts[DISH_TYPE], votesFor, votesAgainst);
                }
            }
        }

        return parsedDish;

    }

}
