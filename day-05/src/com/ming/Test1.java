package com.ming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args){
        Collection<String> collectionList = new ArrayList<>();
        collectionList.add("mingxiao");
        collectionList.add("llllll");
        collectionList.add("qqqqq");
        collectionList.add("aaaaaaa");

        Iterator<String> iterator = collectionList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if("mingxiao".equals(s)){
                iterator.remove();
            }
            System.out.println(s);
        }
        System.out.println(collectionList);
    }
}
