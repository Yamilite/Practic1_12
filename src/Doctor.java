import java.io.Serializable;

public class Doctor implements Serializable {
    private final String name;
    private final int age;
    private final String specialization;
    private final String hospital;
    private final double salary;

    public Doctor(String name, int age, String specialization, String hospital, double salary) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.hospital = hospital;
        this.salary = salary;
    }

    public String toString() {
        return "Doctor{name='" + this.name + '\'' + ", age=" + this.age + ", specialization='" + this.specialization + '\'' + ", hospital='" + this.hospital + '\'' + ", salary=" + this.salary + '}';
    }
}