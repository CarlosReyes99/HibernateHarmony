package entity;



import javax.persistence.*;

@Entity
@Table (name= "employees")
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "pa_surname")
    private String paSurname;
    @Column (name = "ma_surname")
    private String maSurname;

    private String email;

    private Float salary;

    private String curp;

    public Employee(Integer id, String firstName, String paSurname, String maSurname, String email, Float salary, String curp) {
        this.id = id;
        this.firstName = firstName;
        this.paSurname = paSurname;
        this.maSurname = maSurname;
        this.email = email;
        this.salary = salary;
        this.curp = curp;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPaSurname() {
        return paSurname;
    }

    public void setPaSurname(String paSurname) {
        this.paSurname = paSurname;
    }

    public String getMaSurname() {
        return maSurname;
    }

    public void setMaSurname(String maSurname) {
        this.maSurname = maSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Employee data (" +
                "ID=" + id +
                ", First name='" + firstName + '\'' +
                ", Last name='" + paSurname + '\'' +
                ", Mother's last name='" + maSurname + '\'' +
                ", Email='" + email + '\'' +
                ", Salary=" + salary +
                ", Curp='" + curp + '\'' +
                ')';
    }
}
