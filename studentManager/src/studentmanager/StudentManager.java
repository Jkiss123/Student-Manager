/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanager;

import mode.ListStudent;
import view.View_StudentManager;

/**
 *
 * @author Cloudy
 */
public class StudentManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListStudent lst = new ListStudent();
        View_StudentManager stm = new View_StudentManager(lst);
    }
    
}
