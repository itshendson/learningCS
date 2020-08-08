public class Main {

    public static void main(String[] args) {

        String s1 = stringExercise.parseString("<<>>", "word");
        System.out.println("Q1: " + s1);

        String s2 = stringExercise.makeTags("i", "word");
        System.out.println("Q2: " + s2);

        String s3 = stringExercise.withoutX2("xxwhy");
        System.out.println("Q3: " + s3);

        int[] a1Array = {1, 2, 3};
        int[] a1 = arrayExercise.fix23(a1Array);
        System.out.println("Q4: " + a1);

        int[] a2Array = {1, 2, 3};
        int[] a22Array = {1, 3};
        int a2 = arrayExercise.start1(a2Array, a22Array);
        System.out.println("Q5: " + a2);

        int l1a = 1;
        int l1b = 2;
        int l1c = 3;
        int l1 = logicExercise.loneSum(l1a, l1b, l1c);
        System.out.println("Q6: " + l1);

    }
}

