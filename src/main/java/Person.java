public class Person {
    //vars
    private String name;
    private int age;
   // Person person = new Person(null, 0);

    //default constructor
    public Person() {
    }

    //constructor with name
    public Person(String name) {
        this.name = name;
    }
    //constructor with age

    public Person(int age) {
        this.age = age;
    }

    //constructor with name and age
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
