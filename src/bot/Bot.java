package bot;
import java.util.ArrayList;
import java.time.*;



public class Bot {
    public static void main(String[] args) {
        String name = "Hunter";
        String lastName = "Antal";
        if (name.compareTo(lastName) == 0){
            System.out.println("name and firstName are the same");
        } else System.out.println("Not the same");

        addExclamationPoint("Hunter");

        Animal dog = new Animal();
        System.out.println(dog.iAmDog());

        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        switch (name) {
            case "1" -> System.out.println("Its 1");
            case "Hunter" -> System.out.println("Its Hunter");
            default -> System.out.println("Non of the above");
        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalTime thisTime = LocalTime.now();
        System.out.println("This time : " + thisTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Time : " + currentDateTime);

        LocalDate someDay = LocalDate.of(2025, Month.JUNE, 12);
        System.out.println("Someday : " + someDay);

        LocalTime someTime = LocalTime.of(23, 53);
        System.out.println("Sometime : " + someTime);

        LocalDateTime otherDateTime = LocalDateTime.of(2021, Month.MARCH, 4, 10,51,44);
        System.out.println("Other Date Time : " + otherDateTime);

    }
    public static void addExclamationPoint(String s){
        System.out.println(s + "!");
    }
}

