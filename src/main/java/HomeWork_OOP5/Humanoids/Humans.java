package HomeWork_OOP5.Humanoids;

public class Humans<S extends String, N extends Number> {
    S name, status, gender;
    N age;

    public Humans(S name, S status, S gender, N age) {
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.age = age;
    }

    public S getName() {return name;}
    public S getStatus() {return status;}
    public S getGender() {return gender;}
    public N getAge() {return age;}
    public void setAge(N age) {this.age = age;}
}
