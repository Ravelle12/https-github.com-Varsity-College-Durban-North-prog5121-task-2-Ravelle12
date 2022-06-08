/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121_.task2_st10083235;

/**
 *
 * @author Ravelle
 */
public class Prog5121_Task2_ST10083235 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaring variables
        String taskName;
	String taskSurname;
        String taskNumber;
        String developerDetails;
        String taskDescription;
        String taskDuration,taskTime;
        int a;
        int totalDescriptionLength;
        char taskDescriptionLength = 50;
        String n ; 
        
        // Display Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to XpressKhanbanSales");
       
        taskNumber = JOptionPane.showInputDialog("Select option");
        n = Integer.parseInt(taskNumber);
	 // Displaying the options
        JOptionPane.showMessageDialog(null, "Option 1) Add task, " + "option 2) Show report, " + "option 3) Quit");
       
        // Using the while loop for options
        while (n== 1) {
            taskName = JOptionPane.showInputDialog(null,"Enter Name in CAPS:");
            taskSurname = JOptionPane.showInputDialog(null,"Enter Surname in CAPS:");
            totalDescriptionLength = taskDescription.length();
	    taskDescription = JOptionPane.showInputDialog(null,"Enter Description");
            if (totalDescriptionLength>taskDescriptionLength){
            JOptionPane.showMessageDialog(null, "Please Enter Task Description Of Less Than 60 Characters");            
        }
             {
                 //Doing TaskID
                 String taskID = taskName.substring(0,5) + ":" + Integer.parseInt(taskNumber1) + ":" + developerDetails.substring(developerDetails.length()-5);
                 JOptionPane.showMessageDialog(null, n);
                 JOptionPane.showMessageDialog(null,developerDetails);
                 JOptionPane.showMessageDialog(null, taskNumber);
		 JOptionPane.showMessageDialog(null, taskSurname);
                 JOptionPane.showMessageDialog(null, taskName);
                 JOptionPane.showMessageDialog(null,taskDescription);
                 JOptionPane.showMessageDialog(null, taskID);
                 JOptionPane.showMessageDialog(null,taskDuration + " Hours/time");
             }
                JOptionPane.showMessageDialog(null, "Task Succesful");
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Select Option below"));
        } 
       
        while (n == 3) {
            JOptionPane.showMessageDialog(null, "Coming Soon");
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Select Option below"));
        }
       
{	
	else {
                taskNumber = taskNumber + 1; +2; +3; +4; +5;
            // Developers Details
                developerDetails = JOptionPane.showInputDialog(null, "Enter Developers Name");
            // Ask user for progress task
             a = JOptionPane.showInputDialog(null, "State whether the task is done or going to be done");
           
             // Ask user for duration in hours
             taskDuration = JOptionPane.showInputDialog(null, "How many hours have you speny doing the task");
       }
        while (n == 3) {
            // End Program
            break;  
           
               
        }
    }
    }
}
    }
    
}
