package entities;

public class OutsourcedEmployee extends employee {
    private double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
