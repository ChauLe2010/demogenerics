package whygenerics;

public class Student {
    private int id;
    private String name;
    private String address;
    private int score;

    public Student() {
    }

    public Student(int id, String name, String address, int score) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    void display(){
        System.out.printf("\n%-5d%-20s%-20s%-10d",this.id,this.name,this.address,this.score);
    }
}
