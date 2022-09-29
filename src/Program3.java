import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program3  implements Comparable<Program3> {

    Double age;
    Double salary;
    String name;

    @Override
    public String toString() {
        return
                "age=" + age +
                        ", salary=" + salary +
                        ", name='" + name + '\'' +
                        '}';
    }

    public Program3(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Program3 o) {
        if (o.name == this.name) {
            return 0;
        }
        return -1 * o.name.compareTo(this.name);
    }
}
class SortOnSalary implements Comparator<Program3> {

    @Override
    public int compare(Program3 o1,Program3 o2 ){
        return -o1.salary.compareTo(o2.salary);
    }
}


    class Ans2 {
    public static void main(String[] args) {

        List<Program3> list = new ArrayList<>();
        list.add(new Program3(25.0, 8000.99, "z"));
        list.add(new Program3(26.0, 7000.99, "m"));
        list.add(new Program3(23.0, 9000.99, "a"));
        list.add(new Program3(22.0, 3000.99, "c"));
        list.add(new Program3(21.0, 1000.99, "l"));

        Collections.sort(list);

        for (Program3 e : list) {
            System.out.println(e);
        }

        System.out.println("Sorting based on salary using Comparator");
        Collections.sort(list, new SortOnSalary());
        for (Program3 e : list) {
            System.out.println(e);
        }
    }


}


