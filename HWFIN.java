import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=y*10;
        int sum=x+z;
        if(sum>=100){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}
