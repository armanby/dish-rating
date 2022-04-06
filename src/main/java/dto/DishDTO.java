package dto;

public class DishDTO  {
    private String mealName;
    private String mealType;
    private int votesFor;
    private int votesAgainst;
    private int votesOverall;

    public DishDTO(String mealName, String mealType, int votesFor, int votesAgainst, int votesOverall) {
        this.mealName = mealName;
        this.mealType = mealType;
        this.votesFor = votesFor;
        this.votesAgainst = votesAgainst;
        this.votesOverall = votesOverall;
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

    public int getVotesOverall() {
        return votesOverall;
    }

    public void setVotesOverall(int votesOverall) {
        this.votesOverall = votesOverall;
    }
}
