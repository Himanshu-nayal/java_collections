import java.util.HashMap;
import java.util.Map;

public class Employee {

        String name;
        String designation;
        int age;

    public Employee(String name, String designation, int age) {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    @Override
        public String toString(){
            return "Name : " + this.name + "designation : " + designation + " age : " + age;
        }
        public static void main(String[] args) {
            HashMap<Employee,String> hash = new HashMap<>();
            Employee obj1 = new Employee("Himanshu","jvm",24);
            Employee obj2 = new Employee("aman","DE",22);
            Employee obj3 = new Employee("kamlesh","ASE",23);
            Employee obj4 = new Employee("rohit","PM",25);
            Employee obj5 = new Employee("mohit","PL",26);

            hash.put(obj1,obj1.designation);
            hash.put(obj2,obj2.designation);
            hash.put(obj3,obj3.designation);
            hash.put(obj4,obj4.designation);
            hash.put(obj5,obj5.designation);

            for(Map.Entry<Employee,String> entry : hash.entrySet()){
                System.out.println(entry.getKey());
            }
        }
    }

