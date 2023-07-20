import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Student> arrayList = new ArrayList<>();
        try {
            Student student = new Student();
            arrayList.add(student);
            arrayList.add(new Student("Malika", 16));
            arrayList.add(new Student("Bakyt", 21));
            arrayList.add(new Student("Zalina", -16));
            arrayList.add(null);
            System.out.println(arrayList.get(5));
            System.out.println();

        } catch (MyException e) { // |indexout
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final");
        }

        try{  // bir neche exceptiondy karmaym desek oz ozuncho try catch jazuu kerek
            System.out.println(arrayList.get(5));
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }



    }
}