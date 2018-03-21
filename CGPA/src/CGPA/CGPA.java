/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CGPA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Maryam
 */
public class CGPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String students[][]=new String[6][3];
        for(int i=0;i<6;i++){
    System.out.println("Student"+(i+1));
            Scanner input =new Scanner(System.in);
            System.out.println("Enter your name");
            String name = input.nextLine();
            System.out.println("Enter your Registration No.");
            
            String rg = input.nextLine();
            int reg=Integer.parseInt(rg);
            System.out.println("Enter your CGPA");
            String cgpa = input.nextLine();
            Float cgp=Float.parseFloat(cgpa);
            while(cgp>4 || cgp<0){
            System.out.println("Invalid CGPA Please Enter your CGPA again");
            cgpa = input.nextLine();
            if(cgp<=4 || cgp>0){
                
            break;}
            }
            
            if(i>0){
            for(int k=0;k<=i-1;k++){
                int rc=Integer.parseInt(students[k][1]);
            //System.out.println("hello");
           while(rc==reg){
           System.out.println("Registration No. already exists. Enter your Registration No.");
           rg = input.nextLine();
           int rgg=Integer.parseInt(rg);
           if(rc!=rgg){
           break;
           }
           }
            }
            }
            students[i][0]=name;
            students[i][1]=rg;
            students[i][2]=cgpa;
            
            
            
        
        }
        
        for(int i=0;i<6;i++){
         System.out.println("Student: "+i);
        for(int j=0;j<3;j++){
        System.out.print(students[i][j]+" ");
        
        }
        
        }
        //2
        float min=4;
        float max=0;
        float avg=0;
        float sum=0;
        for(int i=0;i<6;i++){
        float val=Float.parseFloat(students[i][2]);
        sum+=val;
        
        if(val<min){
        min=val;
        }
         if(val>max){
        max=val;
        }
        
        
        }
         avg=sum/6;
        System.out.print("Average cgpa is: "+avg);
        System.out.print("Minimum cgpa is: "+min);
        System.out.print("Maximum cgpa is: "+max);
        //3
     Arrays.sort(students, new Comparator<String[]>() {
            public int compare(String[] s1, String[] s2) {
                String n1 = s1[1];
                String n2  = s2[1];
                return n1.compareTo(n2);
            }

            
           
        });
        System.out.print("Students with cgpa less than average");
        for(int i=0;i<6;i++){
          float v=Float.parseFloat(students[i][2]);
        if(v<avg){
        System.out.print(students[i][0]);
        }
        }
        //4
        boolean found = false;
        int rank=0;
        System.out.println();
        Scanner inp =new Scanner(System.in);
      while(true){ 
         System.out.println("1.Enter a name  2.Enter registration no.:");
         int user = inp.nextInt();
         if(user==1){
                System.out.println("Enter student name");
                String nm=inp.next();
                    for (int i=0; i < 6; i++) {  
                //float t=Float.parseFloat(students[i][1]);
                 if(nm.compareTo(students[i][0])==0) {
                     found = true;
                     rank=students.length-i;
                     System.out.println("Student found");
                     System.out.println("Student Data: "+ " CGPA: "+students[i][2]+" Rank: "+rank);
        }
       // found=false;
    }
        if(!found) {
       System.out.println("Student not found");
    }} 
         if(user==2){
         
                System.out.println("Enter student reg no.");
                int regn=inp.nextInt();
               // int rega=Integer.parseInt(regn);
               for (int i=0; i < 6; i++) {  
                int t=Integer.parseInt(students[i][1]);
                if ( regn==t) {
                    rank=students.length-i;
                     found = true;
                     System.out.println("Student found");
                      System.out.println("Student Data: "+ " CGPA: "+students[i][2]+" Rank: "+rank);
        }
       // found=false;
    }
        if(!found) {
       System.out.println("Student not found");
    }
         }
       
         }
                 
       //float s=Float.parseFloat(nr);
      // String nn=nr.toString();
    
        
        
    }
    
}
