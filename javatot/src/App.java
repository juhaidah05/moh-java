// main() berada satu class khusus yg akan guna
// guna class-class yg lain

public class App {
    // entry point method- pintu masuk 
    public static void main(String[] args){
        // create object
        Car ferrari = new Car();
        ferrari.numofDoors = 2;
        ferrari.color = "red"; // mesti "" xblh ''
        // '' hanya utk char shj
        ferrari.print();
        ferrari.startEngine();
        Car porsche = new Car();
    }
}
