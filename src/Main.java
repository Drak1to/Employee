public class Main {
    public static void main(String[] args) {
        ITDepartment itDepartment = new ITDepartment(25, "Gavi", "ITDepartment",200000,3);
        System.out.println("Bonus = " + itDepartment.iTBonus());
        itDepartment.iTSalary();
        HRDepartment hrDepartment = new HRDepartment(22, "Pedri", "HRDepartment", 150000,10);
        System.out.println("Award for people = " + hrDepartment.hRAward());
        hrDepartment.hRSalary();

    }







}