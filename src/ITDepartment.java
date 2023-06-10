public class ITDepartment extends Employee {
    private int bonus;
    private int project;




    @Override
    int salary() {
        return 250000;
    }

    public ITDepartment(int age, String name, String work, int bonus, int project) {
        super(age, name, work);
        this.bonus = bonus;
        this.project = project;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "ITDepartment{" +
                "bonus=" + bonus +
                ", project=" + project +
                '}';
    }
    public int iTBonus(){
        return ((project * 5000) + bonus);
    }

    public void iTSalary(){
        if (getWork().contains("ITDepartment"));
        System.out.println(salary() + iTBonus());
    }
}
