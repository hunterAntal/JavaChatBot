package bot;

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

        switch (name){
            case "1":
                System.out.println("Its 1");
                break;
            case "Hunter":
                System.out.println("Its Hunter");
                break;
            default:
                System.out.println("Non of the above");
        }
    }
    public static void addExclamationPoint(String s){
        System.out.println(s + "!");
    }
}

