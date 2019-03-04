
package chap4;

public class Calculator {
    // constructor
    public Calculator(){
        System.out.println("Calculator constructor");      
    }
    
    // tak boleh override
    public final void info() {
        
    }
    
    public void cetak(){
        System.out.println("cetak calculator");
    }
    
}
