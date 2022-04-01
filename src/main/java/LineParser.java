public class LineParser {
    private Dish currentDish;

    public LineParser(String lineFromFile) {
        String parts[] = lineFromFile.split("\\s+");
        System.out.println(parts[1]);
        currentDish = new Dish(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
    }

    public String getMealName() {
        return currentDish.getMealName();
    }

    public int getVotesFor() {
        return currentDish.getVotesFor();
    }

    public int getVotesAgainst() {
        return currentDish.getVotesAgainst();
    }

    public String getMealType() {
        return currentDish.getMealType();
    }

    public Dish getCurrentDish() {
        return currentDish;
    }
}
