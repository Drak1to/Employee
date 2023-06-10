public class HRDepartment extends Employee {
    private int award;
    private int people;


    @Override
    int salary() {
        return 90000;
    }

    public HRDepartment(int age, String name, String work, int award, int people) {
        super(age, name, work);
        this.award = award;
        this.people = people;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "HRDepartment{" +
                "award=" + award +
                ", people=" + people +
                '}';
    }

    public int hRAward() {
        return (people * 10000);

    }

    public void hRSalary() {
        if (getWork().contains("HRDepartment")) ;
        System.out.println(salary() + (award + hRAward()));
    }
}

