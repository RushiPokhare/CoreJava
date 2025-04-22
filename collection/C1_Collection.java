package collection;

import java.util.ArrayList;
import java.util.List;

public class C1_Collection {
    public static void main(String[] args) {

//      Using Variables
        int a=10;
        int b=20;
        int c=30;
        int d=50;

//        Using Array
        int array[]={10,20,30,50};

//        Using Collection we can Use AL,LL,V,S,HS,LHS,TS,PQ
        List list=new ArrayList();
//        ArrayList<Integer> arrayList=new ArrayList<>();  <-- Less flexible compare to above
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        System.out.println(list);

    }
}
