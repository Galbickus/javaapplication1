
package javaapplication1;

/* @author Veronica
 */
public class Persona {
    private String name;
    private String address;
    private int age;
    private boolean adult;
    private boolean vote;

    public Persona(String name, String address, int age, boolean adult, boolean vote) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.adult = adult;
        this.vote = vote;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", address=" + address + ", age=" + age + ", adult=" + adult + ", vote=" + vote + '}';
    }
    

}
