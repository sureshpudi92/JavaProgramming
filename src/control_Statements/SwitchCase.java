package control_Statements;

public class SwitchCase {
    public static void main(String[] args) {
        /*int weeknum=8;
        switch (weeknum){
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("monday"); break;
            case 3: System.out.println("tuesday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("thursday"); break;
            case 6: System.out.println("friday"); break;
            case 7: System.out.println("saturday"); break;
            default: System.out.println("invalid week");


        }*/
        String weekname="monday1";
        switch (weekname){
            case "sunday": System.out.println(1);break;
            case "monday": System.out.println(2);break;
            case "tuesday": System.out.println(3);break;
            case "wednesday": System.out.println(4);break;
            case "thursday": System.out.println(5);break;
            case "friday": System.out.println(6);break;
            case "saturday": System.out.println(7);break;
            default: System.out.println("invalid week number");
        }
    }
}
