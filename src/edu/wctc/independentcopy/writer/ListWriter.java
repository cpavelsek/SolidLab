package edu.wctc.independentcopy.writer;

import java.util.ArrayList;

public class ListWriter implements Writer {

    ArrayList<String> yourList = new ArrayList<>();

    @Override
    public void writeln(String line) {
        // TODO Auto-generated method stub
        System.out.println("Lets make a list! Enter something to the list.");
        System.out.println("This has been added to our list - " + line);
        yourList.add(line);

    }
    
}
