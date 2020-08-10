public class randomQ {


//    Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
//    scoresIncreasing([1, 3, 4]) → true
//    scoresIncreasing([1, 3, 2]) → false
//    scoresIncreasing([1, 1, 2, 4, 3, 7]) → false
    public static boolean scoresIncreasing(int[] scores) {
        boolean condition = false;

        for (int i = 1; i < scores.length; i++) {
            if (scores[scores.length - i] >= scores[scores.length - i - 1]) {
                condition = true;
            } else {
                return false;
            }
        } return condition;
    }

}
