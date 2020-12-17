public enum DayOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    int numberOfDay;

    DayOfWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    @Override
    public String toString() {
        String printResult = super.toString();
        return printResult.substring(0, 1).toUpperCase() + printResult.substring(1).toLowerCase();
    }

}