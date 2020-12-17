import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ENUM
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            if (dayOfWeek.getNumberOfDay() == 1) {
                System.out.print(dayOfWeek);
            } else {
                System.out.print(", " + dayOfWeek);
            }
        }
        System.out.println();
        DayOfWeek dayOfWeek = DayOfWeek.valueOf("FRIDAY");
        switch (dayOfWeek) {
            case SUNDAY:
                System.out.println("It is Sunday");
                break;
            case MONDAY:
                System.out.println("It is Monday");
                break;
            case TUESDAY:
                System.out.println("It is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("It is Wednesday");
                break;
            case THURSDAY:
                System.out.println("It is Thursday");
                break;
            case FRIDAY:
                System.out.println("It is Friday");
                break;
            case SATURDAY:
                System.out.println("It is Saturday");
                break;
        }
        System.out.println("Ordinal function: " + dayOfWeek.ordinal());

        System.out.println();
        //HashTable

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Test1");
        hashtable.put(2, "Test2");
        hashtable.put(3, "Test3");
        Hashtable<Integer, String> hashtableWithInitialCapacityAndFillRatio =
                new Hashtable<Integer, String>(2, (float) 0.5);
        hashtableWithInitialCapacityAndFillRatio.put(1, "Test1");
        hashtableWithInitialCapacityAndFillRatio.put(2, "Test2");
        hashtableWithInitialCapacityAndFillRatio.put(3, "Test3");
        hashtableWithInitialCapacityAndFillRatio.put(4, "Test4");
        hashtableWithInitialCapacityAndFillRatio.put(5, "Test5");

        System.out.println(hashtable.get(5));
        System.out.println(hashtable.get(1));
        System.out.println();
        System.out.println("Before Change");
        printHashTableItems(hashtableWithInitialCapacityAndFillRatio);
        hashtableWithInitialCapacityAndFillRatio.put(4, "Changed");
        System.out.println("After Change");
        printHashTableItems(hashtableWithInitialCapacityAndFillRatio);

    }

    private static void printHashTableItems(Hashtable<Integer, String> hashtable) {
        Set<Integer> set = hashtable.keySet();
        for (int key : set) {
            System.out.println(key + ": " + hashtable.get(key));
        }
    }
}