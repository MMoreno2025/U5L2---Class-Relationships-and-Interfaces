//Malia Moreno | 9 January 2025//
package com.mycompany.u5l2classrelationshipsandinterfaces;

public class U5L2ClassRelationshipsandInterfaces {
    public static void main(String[] args) {
        
        
        System.out.println("I Work!");
    }
}

class Tasks implements Priority, Complexity{
    //make class variables//
    private String task;
    private int complexity;
    
    //constructor class//
    public Tasks(String todo){
        task = todo;
    }
}

//Interfaces//
interface Priority{     //establish numeric priority between object instances//
    public void setPriority();
    public int getPriority();
}
interface Complexity{       //assign object to an explicit complecity//
    public void setComplexity(int complexity);
    public int getComplexity();
}
//interface Comperable{}  --> not needed to write since in standard package//
