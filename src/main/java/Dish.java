public class Dish {
    private String mealName;
    private String mealType;
    private int votesFor;
    private int votesAgainst;

    public Dish(String mealName, String mealType, int votesFor, int votesAgainst) {
        this.mealName = mealName;
        this.mealType = mealType;
        this.votesFor = votesFor;
        this.votesAgainst = votesAgainst;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getVotesFor() {
        return votesFor;
    }

    public void setVotesFor(int votesFor) {
        this.votesFor = votesFor;
    }

    public int getVotesAgainst() {
        return votesAgainst;
    }

    public void setVotesAgainst(int votesAgainst) {
        this.votesAgainst = votesAgainst;
    }
}
