/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
        //testPositive();
       // testNegative();
	    //testMixed();
        testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        // call SelectionSort function
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        
        /** add tests to check for this unit test **/
        	
        	assertEquals("Did not expect the value of 2 for Sortedarr[0]", Sortedarr[0], arr[0]);
        	assertEquals("Did not expect the value of 7 for Sortedarr[1]", Sortedarr[1], arr[1]);
        	assertEquals("Did not expect the value of 8 for Sortedarr[2]", Sortedarr[2], arr[2]);
        	assertEquals("Did not expect the value of 9 for Sortedarr[3]", Sortedarr[3], arr[3]);
        	assertEquals("Did not expect the value of 10 for Sortedarr[4]", Sortedarr[4], arr[4]);
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        /** Test data contains negative values only **/
        SelectionSort temp1 = new SelectionSort();
        temp1.basicSelectionSort(arr);
        
        assertEquals("Did not expect the value of -10 for Sortedarr[0]", Sortedarr[0], arr[0]);
    	assertEquals("Did not expect the value of -9 for Sortedarr[1]", Sortedarr[1], arr[1]);
    	assertEquals("Did not expect the value of -8 for Sortedarr[2]", Sortedarr[2], arr[2]);
    	assertEquals("Did not expect the value of -7 for Sortedarr[3]", Sortedarr[3], arr[3]);
    	assertEquals("Did not expect the value of -2 for Sortedarr[4]", Sortedarr[4], arr[4]);
    }
    
    public void testMixed(){
    	   int[] arr = new int[5];
           arr[0] = 8;
           arr[1] = -9;
           arr[2] = 7;
           arr[3] = 0;
           arr[4] = -2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = -9;
           Sortedarr[1] = -9;
           Sortedarr[2] = 0;
           Sortedarr[3] = 7;
           Sortedarr[4] = 7;
        /** Test data contains with both positive, negative and zeros **/
           
           SelectionSort temp1 = new SelectionSort();
           temp1.basicSelectionSort(arr);
           
        assertEquals("Did not expect the value of -9 for Sortedarr[0]", Sortedarr[0], arr[0]);
       	assertEquals("Did not expect the value of -9 for Sortedarr[1]", Sortedarr[1], arr[1]) ;
       	assertEquals("Did not expect the value of 0 for Sortedarr[2]", Sortedarr[2], arr[2]);
       	assertEquals("Did not expect the value of 7 for Sortedarr[3]",Sortedarr[3], arr[3]);
       	assertEquals("Did not expect the value of 7 for Sortedarr[4]", Sortedarr[4],arr[4]);
    }
    
    public void testDuplicates(){
    	   int[] arr = new int[5];
           arr[0] = 8;
           arr[1] = 9;
           arr[2] = 7;
           arr[3] = 7;
           arr[4] = 2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = 2;
           Sortedarr[1] = 7;
           Sortedarr[2] = 7;
           Sortedarr[3] = 8;
           Sortedarr[4] = 9;
        /** Test data contains duplicates **/
           
           SelectionSort temp1 = new SelectionSort();
           temp1.basicSelectionSort(arr);
           
        assertEquals("Did not expect the value of 2 for Sortedarr[0]", Sortedarr[0], arr[0]);
       	assertEquals("Did not expect the value of 7 for Sortedarr[1]", Sortedarr[1],arr[1]);
       	assertEquals("Did not expect the value of 7 for Sortedarr[2]", Sortedarr[2], arr[2]);
       	assertEquals("Did not expect the value of 8 for Sortedarr[3]", Sortedarr[3], arr[3]);
       	assertEquals("Did not expect the value of 9 for Sortedarr[4]", Sortedarr[4], arr[4]);
    }


}
