package com.yash.arraybasics;
// WAP to find duplicate numbers and there counting from list of numbers.
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayTask2 {
public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 8);

    Map<Integer ,Integer> map = new HashMap<>();

      for(  Integer r  : list) {
          if(  map.containsKey(r)   ) {
                 map.put(r, map.get(r) + 1);
          }
          else {
              map.put(r, 1);
          }
      }

      //iterate

      Set< Map.Entry<Integer ,Integer> > entrySet = map.entrySet();
      for(    Map.Entry<Integer ,Integer>  entry : entrySet     ) {
    	  if(entry.getValue()>1) {
          System.out.printf(   "%s : %d %n "    , entry.getKey(),entry.getValue()  );
    	  }
      }

}}