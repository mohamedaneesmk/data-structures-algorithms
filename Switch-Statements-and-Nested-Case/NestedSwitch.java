public class NestedSwitch {

    public static void main(String[] args) {

        int department = 2;
        int employeeId = 101;

        switch (department) {

            case 1:
                System.out.println("Department: HR");

                switch (employeeId) {
                    case 100:
                        System.out.println("Employee: Alice");
                        break;
                    case 101:
                        System.out.println("Employee: Bob");
                        break;
                    default:
                        System.out.println("Unknown Employee");
                }
                break;

            case 2:
                System.out.println("Department: Development");

                switch (employeeId) {
                    case 101:
                        System.out.println("Employee: John");
                        break;
                    case 102:
                        System.out.println("Employee: Mike");
                        break;
                    default:
                        System.out.println("Unknown Employee");
                }
                break;

            default:
                System.out.println("Invalid Department");
        }
    }
}
