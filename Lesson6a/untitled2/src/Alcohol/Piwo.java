package Alcohol;

public class Piwo extends PiwoBase{
    private String name;
    private Double  percentage;

    public Piwo(String name, Double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    @Override
    public double getPercentage() {
        return percentage;
    }

    @Override
    public String getName() {
        return name;

    }
}