public class EmployeeWageComputation {
    public static void main(String []args) {

        int fullTime = 1;
        int wagePerHour = 20;
        int workingHour = 0;

        int attendance = (int) (Math.random() * 100) % 2;

        if (fullTime == attendance) {
            System.out.println("Present");
            workingHour = 8;

        }
        
        else {
            System.out.println("Absent");
        }

        int wage = wagePerHour * workingHour;
        System.out.println("Fulltime Employee daily wage: " + wage + " Rupees.");

    }

}
