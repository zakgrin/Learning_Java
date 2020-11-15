import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        // Day Enum: 
        System.out.println("Day Enum:");
        isWeekend(Day.Friday);
        isWeekend(Day.Saturday);
        isWeekend(Day.Wednesday);

        // Book Enum: Loop through all Enum items
        System.out.println("Loop through all Enum items:");
        for (Book book: Book.values()) {
            System.out.println("-" + book + " | " + 
                                    book.getTitle() + " | " + 
                                    book.getPublishYear() );
        }
        // Book Enum: Loop through a range of Enum
        System.out.println("Loop through a range of Enum items:");
        for (Book book: EnumSet.range(Book.Java1, Book.Algo)) {
            System.out.println("-" + book + " | " + 
                                    book.getTitle() + " | " + 
                                    book.getPublishYear() );
        }
    }

    public static void isWeekend(Day day) {
        switch (day) {
            case Thursday:
                System.out.println("- It is a weekend!");
                break;
            case Friday:
                System.out.println("- It is a weekend!");
                break;
            default:
                System.out.println("- It is not a weekend!");
                break;
        }
    }
}
