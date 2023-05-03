public class User {
    private int id;
    private int birthYear;
    public String name;
    private String midname;
    private String surname;

    public User() {

    }

    public User(String name, String surname, int id, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.birthYear = birthYear;
    }

    public User(String name, String midname, String surname, int id, int birthYear) {
        this.name = name;
        this.midname = midname;
        this.surname = surname;
        this.id = id;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
