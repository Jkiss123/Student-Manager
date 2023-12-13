/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cloudy
 */
public class ListStudent extends ArrayList<Student>{
    private String choice;
    private String tenFile;
    
    public ListStudent(){
        choice = "";
        tenFile = "D:\\code\\java\\studentManager\\Student.txt";
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public int getModCount() {
        return modCount;
    }

    public void setModCount(int modCount) {
        this.modCount = modCount;
    }

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }

    public void saveFile() throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream("D:\\code\\java\\studentManager\\Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void openFile(String path) throws IOException{
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
    }
    
    
}
