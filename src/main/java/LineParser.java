public class LineParser {

    private static final int MEAL_NAME = 0;
    private static final int MEAL_TYPE = 1;
    private static final int VOTES_FOR = 2;
    private static final int VOTES_AGAINST = 3;
    private static final int TOTAL_LINE_PARTS = 4;


    public Dish parseLine(String line) {
        Dish parsedDish = null;

        if(line != null) {
            String parts[] = line.split("\\s+");

            if(parts.length == TOTAL_LINE_PARTS) {

                int votesFor = Integer.parseInt(parts[VOTES_FOR]);
                int votesAgainst = Integer.parseInt(parts[VOTES_AGAINST]);

                parsedDish = new Dish(parts[MEAL_NAME], parts[MEAL_TYPE], votesFor, votesAgainst);
            }
        }

        return parsedDish;

    }

}
