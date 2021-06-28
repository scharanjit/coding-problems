package maximumElement;

import java.util.Scanner;
import java.util.Stack;

/**
 * General complexity would be O(n*m)
 * to reduce it to O(n), let's use two stacks
 */
public class MaxElement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int NumberOfQueries = sc.nextInt();

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    maxStack.push(Integer.MIN_VALUE);

    for(int i = 0; i<NumberOfQueries;i++ ) {
      int operation = sc.nextInt();


      switch (operation) {
        case 1 :
          int item = sc.nextInt();
          mainStack.push(item);
          int maxSoFar = maxStack.peek();

          if(item > maxSoFar) {
            maxStack.push(item);
          } else {
            maxStack.push(maxSoFar);
          }

          break;
        case 2:
          mainStack.pop();
          maxStack.pop();
          break;

        case 3:
          System.out.println(maxStack.peek());
          break;
      }
    }

  }

}
