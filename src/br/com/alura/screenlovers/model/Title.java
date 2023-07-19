package br.com.alura.screenlovers.model;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double ratingSum;
    private int ratingTotal;
    private int durationInMinutes;

    public int getRatingTotal() {
        return ratingTotal;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showTechnicalInfo(){
        System.out.println("Name: " + name);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration (in minutes): " + durationInMinutes);
    }

    public void rate(double yourRating) {
        ratingSum += yourRating;
        ratingTotal++;
    }

    public double ratingAverage() {
        return ratingSum / ratingTotal;
    }
}
