public class EmployeeWageComputation {
    public static void main(String []args) {

        final int fullTime = 1;
        final int partTime = 2;
        final int wagePerHour = 20;
        int workingHour = 0;
        String a = "";

        int attendance = (int) (Math.random() * 100) % 3;

        switch(attendance) {
            case fullTime:
                System.out.println("Full Time");
                workingHour = 8;
                a = "Full time";
                break;

            case partTime:
                System.out.println("Part Time");
                workingHour = 4;
                a = "Part time";
                break;

            default:
                System.out.println("Absent");

        }

        int wage = wagePerHour * workingHour;
        System.out.println( a + " Employee daily wage: " + wage + " Rupees.");

    }

}

