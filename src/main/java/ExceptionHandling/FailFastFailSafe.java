package ExceptionHandling;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

    //Fail fast -- ArrayList, hasshMap, Hashset
    //Fail-safe --CopyOnWriteArrayList, ConcurrentHashMap
     Integer[] intArr = {2,25,58};

    public  void failFast() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(intArr));

        for (Integer number : numbers) {
            try {
                numbers.add(25);
            } catch (ConcurrentModificationException _) {
            }
        }
    }

    public  void failSafe(){


    CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(List.of(intArr));

        for (Integer next : copyOnWriteArrayList) {
            copyOnWriteArrayList.add(25);

        }
    }

    public static void main(String[] args){
        FailFastFailSafe failFastFailSafe = new FailFastFailSafe();
        failFastFailSafe.failSafe();
//        failFastFailSafe.failFast();
    }
}

