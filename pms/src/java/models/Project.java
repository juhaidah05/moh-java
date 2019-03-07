package models;
import java.util.ArrayList;
 
public class Project {
    private int id;
    private String title;
    private String description;
    
    public ArrayList getAll(){
        ArrayList arr = new ArrayList();
        String sql = "SELECT * FROM project";
        return arr;
    }
}
