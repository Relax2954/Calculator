import java.util.Scanner;

/**
 *
 * @author Relax2954
 */
public class Calc {

    public static int calculate(String s, int sum) {
        String parts[] = s.split(" ");
        String substr = parts[0];
        sum += Integer.parseInt(substr);
        for (int i = 2; i < parts.length; i += 2) {
            substr = parts[i];
            if (parts[i - 1].equals("+")) 
                sum += Integer.parseInt(substr);
            else if (parts[i - 1].equals("-")) 
                sum -= Integer.parseInt(substr);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sequence = scan.nextLine();
        int sum = calculate(sequence, 0);
        System.out.println(sum);
    }
}
