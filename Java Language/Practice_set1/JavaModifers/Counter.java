/*Create a class "Counter" with a private static variable "count" 
and a public static method "incrementCount()" to increment the count by 1 whenever it's called. */

package JavaModifers;

public class Counter {
    
    private static int count = 0;

    public static int incrementCount(){
        return count++;
        
    }

}
