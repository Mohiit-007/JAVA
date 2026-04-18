package Collection;

enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class enums {
    public static void main(String[] args) {
        Week week = Week.THU;
        System.out.println(week);
        int index = Week.THU.ordinal();
        System.out.println(index);

        for(Week it : Week.values()){
            System.out.println(it);
        }
    }
}
