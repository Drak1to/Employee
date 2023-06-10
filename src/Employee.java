public abstract class Employee {
    private int age;
    private String name;
    private String work;
     abstract int salary ();

    public Employee( int age, String name, String work) {
        this.age = age;
        this.name = name;
        this.work = work;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +

                ", age=" + age +
                ", name='" + name + '\'' +
                ", work='" + work + '\'' +
                '}';
    }





}
