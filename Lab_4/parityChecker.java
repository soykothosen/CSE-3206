import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.math.BigInteger; 
  
class parityChecker 
 { 
    /* Function to get parity of number n. 
    It returns 1 if n has odd parity, and 
    returns 0 if n has even parity */
    public void getParity(int n) 
    { 
        boolean parity = false; 
        while(n != 0) 
        { 
            parity = !parity; 
            n = n & (n-1); 
        } 
     System.out.println("Parity of no " + n + " = " + (parity? "odd": "even"));  
          
    } 
    
}