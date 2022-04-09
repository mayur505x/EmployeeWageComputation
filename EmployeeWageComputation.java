public class EmployeeWageComputation {
    public static void main(String[] args) {

        final int fullTime = 1;
        final int partTime = 2;
        final int wagePerHour = 20;
        final int workingDay = 20;
        int totalWage = 0;
        String a = "";

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


