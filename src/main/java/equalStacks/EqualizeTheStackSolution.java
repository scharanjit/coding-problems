package equalStacks;

import java.util.Stack;

public class EqualizeTheStackSolution {

  public static void main(String[] args) {

    int[] stack1ArrayHeight = {3, 2, 1, 1, 1};
    int[] stack2ArrayHeight = {4, 3, 2};
    int[] stack3ArrayHeight = {1, 1, 4, 1};

    System.out.println(equalStacks(stack1ArrayHeight, stack2ArrayHeight, stack3ArrayHeight));
  }

  private static int equalStacks(int[] stack1ArrayHeight, int[] stack2ArrayHeight,
      int[] stack3ArrayHeight) {

    Stack<Integer> st1 = new Stack<Integer>();
    Stack<Integer> st2 = new Stack<Integer>();
    Stack<Integer> st3 = new Stack<Integer>();

    int s1totalHeight = 0;
    int s2totalHeight = 0;
    int s3totalHeight = 0;
    //push consolidated height
    for (int i = stack1ArrayHeight.length - 1; i >= 0; i--) {
      s1totalHeight = s1totalHeight + stack1ArrayHeight[i];
      st1.push(s1totalHeight);
    }

    for (int i = stack2ArrayHeight.length - 1; i >= 0; i--) {
      s2totalHeight = s2totalHeight + stack2ArrayHeight[i];
      st2.push(s2totalHeight);
    }

    for (int i = stack3ArrayHeight.length - 1; i >= 0; i--) {
      s3totalHeight = s3totalHeight + stack3ArrayHeight[i];
      st3.push(s3totalHeight);
    }

    while (true) {
      if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty()) {
        return 0;
      }
      s1totalHeight = st1.peek(); //get the top value..consolidated height
      s2totalHeight = st2.peek();
      s3totalHeight = st3.peek();

      if (s1totalHeight == s2totalHeight && s2totalHeight == s3totalHeight) {
        return s1totalHeight;
      }

      if (s1totalHeight >= s2totalHeight && s1totalHeight >= s3totalHeight) {
        st1.pop();
      } else if (s2totalHeight >= s1totalHeight && s2totalHeight >= s3totalHeight) {
        st2.pop();
      }

      if (s3totalHeight >= s2totalHeight && s3totalHeight >= s1totalHeight) {
        st3.pop();
      }
    }

  }

}
