import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s=new Scanner(System.in);
        //System.out.print();
        int x=s.nextInt();
        int y=s.nextInt();
        int rem=y/x;
		int diff=y-x;
        if(x==y || x>y){
            System.out.println(0);
        }
        else if(diff==1){
            System.out.println(1);
        }
        else{
            System.out.println(rem);
        }
	}
}
