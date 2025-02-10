import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting_Swapping {
    public static void main(String[] args) {
        int a[]={45,77,8,234,5,33};
        int temp;
        //Sorting

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t"+a[i]);
        }
        //System.out.println();
        ArrayList al=new ArrayList();
        //al.add(a);
        //al.stream().sorted();

        int a1[]=Arrays.stream(a).toArray();
        Arrays.stream(a1).sorted();
        //Arrays.sort(a);
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1);
        }

    }




}
