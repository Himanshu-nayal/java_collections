import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Float> arrayList=new ArrayList<>();
        arrayList.add(5.0F);
        arrayList.add(2F);
        arrayList.add(11.0F);
        arrayList.add(4.6F);
        arrayList.add(2.5F);

        System.out.println("sum:");
        float sum=0f;
        Iterator itr=arrayList.iterator();
        while(itr.hasNext()) {
            sum += (float)itr.next();

        }
        System.out.println(sum);
    }
}
