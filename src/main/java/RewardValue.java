public class RewardValue {
    public double cashValue;
    public double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;

    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;

    }


    double getCashValue(){
        return cashValue;
    }

    double getMilesValue(){
        return milesValue;
    }
}
