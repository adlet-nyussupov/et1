/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterswork1;


import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Date.from;
import java.util.List;
import static sun.management.StackTraceElementCompositeData.from;

/**
 *
 * @author Aziza
 */
public class MasterSWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        String[][] array = new String[15][15];
        String words = "МЕТОД_РАССЕЧЕНИЯ-РАЗНЕСЕНИЯ";
   
        
        
       // String[] block = new String[7];
      //  List<Integer> k = new ArrayList<Integer>();
        //int k;
        char [] myCharArray = words.toCharArray ();
        
        int[] Sj = {4,1,3,2};
        int[] ri = {2,1};
        int row = 0;
        int columns = 0;
        
        //List<Character> block = new ArrayList<Character>();
        char[] block = new char[50];
       
        
        List<Integer> k = new ArrayList<Integer>();
        
        char [] word1 = new char[8];
        char [] word2 = new char[8];
        char [] word3 = new char[8];
        char [] word4 = new char[8];
        
        array[0][0] = "0/0";
	array[0][1] = "0/1";
        array[0][2] = "0/2";
        
        
         int m1 = 0;
         
         do{
            word1[m1] = myCharArray[m1];
            m1++;
         }
         while(m1 < 8 );
         
         
         int m2 = 8;
         m1 = 0;
         
         do{
            word2[m1] = myCharArray[m2];
            m1++;
            m2++;
            
         }
         while(m2 < 16 &&  m2 < myCharArray.length);
            
          int m3 = 16;
         m1 = 0;
         
         do{
            word3[m1] = myCharArray[m3];
            m1++;
            m3++;
            
         }
         while(m3 < 24 &&  m3 < myCharArray.length);
      
         
         int m4 = 24;
         m1 = 0;
         
         do{
            word4[m1] = myCharArray[m4];
            m1++;
            m4++;
            
         }
         while(m4 < 32 &&  m4 < myCharArray.length);
         
       
	System.err.println(word1);
        System.err.println(word2);
        System.err.println(word3);
        
        
        
        
        
        
        
            
        for (int i = 0; i < ri.length; i++) {
                        
                        
                        //System.out.print(row);
                        
			for (int j = 0; j < Sj.length; j++) {
                                
                                row = ri[i];
                                columns  = Sj[j];
                                
                                //System.out.print(columns + "\t");
                                
                                k.add((ri[i] - 1)*4+Sj[j]);
                              //  k.add((ri[i] - 1)*4+Sj[j]);
                                 System.out.println(k);
                                 
                                

                                /*
                                for(int k = 0; k < myCharArray.length; k++){
                                
                            char name = myCharArray[columns];
                            System.out.print(name + "\t");
                            
                                }
                             */
                                
                             //   System.out.print(array[row] [columns] + "\t");
                                
                           
			}
                        
			
                        
		}
        /*
        for(int o = 0; o < 8; o++){
                                    
                                
                                block.add(o, null);
                            
                                 }
        
        */
            int z = 0;
            for(int t = 0; t<myCharArray.length; t++){
                
                do{
                block[k.get(z)] = myCharArray[t];
                z++;
                }while(z<8);
                
                
                System.out.println(block);
            }
            
            
            
         
            System.out.println(block[2]);
                               
                       //System.out.print(block);          
                     //   System.out.print("1= "+block.get(0)+"2= "+block.get(1)+"4="+block.get(2)); 
                     //   System.out.println(block);
                           
                                // System.out.print(k);
                       //        System.out.println(block.get(9)+"PPP");
        
        /*
        int[] Sj = {4,1,3,2};
        int[] ri = {2,1};
        
        array[0][0] = "0/0";
	array[0][1] = "0/1";
        array[0][2] = "0/2";
	array[0][3] = "0/3";
        
        char [] Ch = words.toCharArray ();
	
		
        for (int i = 1; i < array.length; i--) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
                                
                                
			}
			System.out.println();
		}
        
        
        
        for (int i = 0; i < 10; i++) {
            
        }

*/      
        
        
         
    
        

}
}
