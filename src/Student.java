public class Student {
   private String name;
   private int age;

    public Student(String name, int age) throws Exception {
        this.name = name;
        this.age = age;
        if (age < 0){
            throw new MyException();
        }
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;


        }


    public void setAge(int age) throws Exception {
        this.age = age;
        if (age < 0){
            throw new MyException();
        }

    }

    @Override
    public String toString() {
        return "Student:" +
                "name =" + name  +
                "age =" + age;
    }
}

