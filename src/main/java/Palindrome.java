import java.io.*;
import java.util.*;

public class Palindrome {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */


    for(int i=0 ;i<A.length()/2 ;i ++){
      if(A.charAt(i) != A.charAt(A.length()-1-i)){
        System.out.println("not a palindrome");
        break;
      }
    }

  }
}

