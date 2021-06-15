package drawingBook;

public class DrawingBookSolution {


  public static void main(String[] args) {
    System.out.println(findMinimumTurns(11, 4));
    System.out.println(findMinimumTurns(11, 10));
    System.out.println(findMinimumTurns(11, 7));
  }

  private static int findMinimumTurns(int totalNumberOfPages, int targetPageToReach) {

    /**
     * Why dividing by 2 ?
     * Because in every page, we have 2 pages
     */
    int totalPageTurnCountFromFront = totalNumberOfPages / 2;
    int targetPageTurnCountFromFront = targetPageToReach / 2;
    int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

    return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
  }

}
