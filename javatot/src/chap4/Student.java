package chap4;
//pass variable by val vs by reference - yg original pun berubah
// primitive + String = passing by value
// object always passing by reference 
public class Student {
    void setName(String name){
    System.out.println(name);
    name = name + " binti Jatu";
        
    }
    
    void changeBooktitle(Book b){
        b.title = "Java Advanced";
    }
    
     public static void main(String[] args){
         Student s1 = new Student(); // create obj
         String nama = "Juhaidah";
         // ini passing var by value - ia tak ubah yg original
         s1.setName(nama);
         System.out.println(nama);
         
         //passing var by reference - ia akn berubah
         Book b1 = new Book();
         b1.title = "Java for Beginner"; //yg ni original
         System.out.println(b1.title);
         s1.changeBooktitle(b1);
         System.out.println(b1.title);
     }
}
