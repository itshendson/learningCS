public class Main {

    public static void main(String[] args) {

        String s1 = stringExercise.parseString("<<>>", "word");
        System.out.println(s1);

        String s2 = stringExercise.makeTags("i", "word");
        System.out.println(s2);

        String s3 = stringExercise.withoutX2("xxwhy");
        System.out.println(s3);

        int[] tempArray = {1,2,3};
        int[] a1 = arrayExercise.fix23(tempArray);
        System.out.println(a1);
    }

}
