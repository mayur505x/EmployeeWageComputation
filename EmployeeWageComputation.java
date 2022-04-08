public class EmployeeWageComputation {
    public static void main(String []args) {

        int fullTime = 1;
        int partTime = 2;
        int wagePerHour = 20;
        int workingHour = 0;
        String a = "";

        int attendance = (int) (Math.random() * 100) % 3;

        if (fullTime == attendance) {
            System.out.println("Fulltime");
            workingHour = 8;
            a = "Fulltime";

        } else if (partTime == attendance) {
            System.out.println("Parttime");
            workingHour = 4;
            a = "Partime";

        } else {
            System.out.println("Absent");
        }

        int wage = wagePerHour * workingHour;
        System.out.println( a + " Employee daily wage: " + wage + " Rupees.");

    }

}
