
package chap5;


public class Array {
    public static void main(String[] args){
        // $people = [] //php
        // bil data dlm array = 3. fixed
        String[] people = new String[3];
        people[0] = "Abu";
        people[1] = "Ali";
        people[2] = "Ramasamy";
        //people[3] = "John Doe"; -klu tambah jd array
        
        System.out.println(people[2]);
        
        //int[] bil = new int --x boleh
        Integer[] bil = new Integer[5];
        int[] jum = {1,2,4};
        
        for (int i=0; i<jum.length; i++){
            System.out.println(jum[i]);
        }
        
        int j = 0;
        while (j <jum.length){
            while (j < jum.length){
                //System.out.println(jum[i]);
                System.out.printf("Val = %s", jum[j]);
                j++;
            }
            // %s utk keluarkn nilai value
        }
        
    }
}
