package saveThePrisoner;

public class SaveThePrisoner {

  public static void main(String[] args) {
    System.out.println(saveThePrisonerFromWorstCandee(7, 19, 2));
    System.out.println(saveThePrisonerFromWorstCandee(7, 19, 1));
    System.out.println(saveThePrisonerFromWorstCandee(7, 19, 5));
  }

  private static int saveThePrisonerFromWorstCandee(int numberOfPrisoners, int numberOfCandies,
      int startingPoint) {

    int prisonerPositionWhichWillReceiveLastCandie = numberOfCandies % numberOfPrisoners;

    /**
     * Now we need to consider starting point
     */

    if ((prisonerPositionWhichWillReceiveLastCandie + startingPoint - 1) % numberOfPrisoners == 0) {
      return numberOfPrisoners;
    } else {
      return (prisonerPositionWhichWillReceiveLastCandie + startingPoint - 1) % numberOfPrisoners;
    }

  }

}
