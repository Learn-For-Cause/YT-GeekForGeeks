package LFC_java;

import java.util.Scanner;

public class Powerof2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase= sc.nextInt();
		int i=0;
		for(i=0;i<tcase;i++){
		    long a=sc.nextLong();
		    long res=a&(a-1);
		    if(a==0){
		        System.out.println("NO");
		    }
		    else{
		        if(res==0)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		       
		        
		        
		    }
		}
	}
}
