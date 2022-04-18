
public class EmployeeWageComputation {
    public static void main(String[] args) {
        ComputeWage.computeWage();
    }
}

class ComputeWage {

    static final int fullTime = 1;
    static final int partTime = 2;
    static int wagePerHour = 20;
    static int workingDay = 20;
    static int totalWage = 0;
    static String a = "";

    static void computeWage() {

        for (int i=1;i<=workingDay;i++) {

            int attendance = (int) (Math.random() * 100) % 3;
            int workingHour = 0;

            switch (attendance) {

                case fullTime:
                    workingHour = 8;
                    a = "Full time";
                    break;

                case partTime:
                    workingHour = 4;
                    a = "Part time";
                    break;

                default:
                    System.out.println("Absent");

            }

            int wage = wagePerHour * workingHour;
            System.out.println(a + " Employee daily wage: " + wage + " Rupees.");
            totalWage = wage + totalWage;

        }

        System.out.println("Employee monthly wage: " + totalWage + " Rupees.");

    }

}


