public class logicExercise {


//    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//    loneSum(1, 2, 3) → 6
//    loneSum(3, 2, 3) → 2
//    loneSum(3, 3, 3) → 0
    public static int loneSum(int a, int b, int c) {
        Boolean matchA = false;
        Boolean matchB = false;
        Boolean matchC = false;
        int sum = 0;

        if (a == b) {
            matchA = true;
            matchB = true;
        }

        if (a == c) {
            matchA = true;
            matchC = true;
        }

        if (b == c) {
            matchB = true;
            matchC = true;
        }

        if (!matchA) {
            sum += a;
        }
        if (!matchB) {
            sum += b;
        }
        if (!matchC) {
            sum += c;
        }
        return sum;
    }


}
