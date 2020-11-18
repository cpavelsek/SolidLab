package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader{

    public ArrayList<String> myList = new ArrayList<>();

   

    @Override
    public String readln() {
        // TODO Auto-generated method stub
        myList.add("String Examples");
        myList.add("String");
        myList.add("AnotherString");

        for (String string : myList) {
            System.out.println(string);
        }
        return null;
    }

    public ArrayList<String> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<String> myList) {
        this.myList = myList;
        
    }
    
}
