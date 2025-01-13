//Malia Moreno | 9 January 2025//
package com.mycompany.u5l2classrelationshipsandinterfaces;
import java.util.*;

public class U5L2ClassRelationshipsandInterfaces {
    public static void main(String[] args) {
        //making tasks//
        Tasks task1 = new Tasks("Wash Car");
        task1.setPriority(1);
        task1.setComplexity(6);
        Tasks task2 = new Tasks("Clean Dishes");
        task2.setPriority(2);
        task2.setComplexity(2);
        Tasks task3 = new Tasks("Homework");
        task3.setPriority(1);
        task3.setComplexity(8);
        
        //compaire tasks and print list//
        List<Tasks> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        Collections.sort(tasks);
        
        
        System.out.println("Tasks order in priority then complexity:");
        for(Tasks task:tasks){
            System.out.println(task);
        }
    }
}

class Tasks implements Priority, Complexity, Comparable<Tasks>{
    //make class variables//
    private String task;
    private int complexity, priority;
    
    //constructor class//
    public Tasks(String todo){
        task = todo;
        complexity = 1;
        priority = 1;
    }
    
    //set and get priority for task//
    public void setPriority(int prior){
        priority = prior;
    }
    public int getPriority(){
        return priority;
    }
    
    //Set complexity for task//
    public void setComplexity(int level){
        complexity = level;
    }
    public int getComplexity(){
        return complexity;
    }
    
    /*
    //compair priority and complexity, return string of lowest priority and complexity//
    public String compare(Tasks other){
        int lowerPrior = Integer.compare(this.priority, other.priority);
        if(this.priority == other.priority){
            int lowerComp = Integer.compare(this.complexity, other.complexity);
            if(this.complexity <= other.complexity){
                return this.task;
            }else{
                return other.task;
            }
        }else if(this.priority < other.priority){
            return this.task;
        }else{
            return other.task;
        }
    }*/
    
    //campareTo method//
    @Override
    public int compareTo(Tasks other){
        if(this.priority != other.priority){
            return Integer.compare(this.priority, other.priority);
        }
        
        return Integer.compare(this.complexity, other.complexity);
    }
    
    @Override
    public String toString(){
        return "Task: "+task+" \t Priority: "+priority + "\t Complexity: "+complexity;
    }
    
}

//Interfaces//
interface Priority{     //establish numeric priority between object instances//
    public void setPriority(int priority);
    public int getPriority();
}
interface Complexity{       //assign object to an explicit complecity//
    public void setComplexity(int complexity);
    public int getComplexity();
}
//interface Comperable{}  --> not needed to write since in standard package//
