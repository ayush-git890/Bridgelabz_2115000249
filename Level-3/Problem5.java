public class Problem5{
    public static void main(String[] args) {
        // checking if the number of arguments is correct
        if (args.length != 3) {
            System.out.println("Usage: java d0 <month> <day> <year>");
            return;
        }

        // taking command-line arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // applying formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println(d0);
    }
}