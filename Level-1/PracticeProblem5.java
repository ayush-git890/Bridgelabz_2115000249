public class PracticeProblem5 {
    public static void main(String[] args) {
        //14 pens equally divided among 3 students

        //total pen
        int tp = 14;

        //divided pen
        int dp = tp/3;

        //remaining pen
        int rp = tp%3;
        System.out.println("The Pen Per Student is "+dp+" and the remaining pen not distributed is "+rp);
    }
}
