import java.util.Scanner;

public class Average {
public static void main(String[] args) {
    System.out.println("The First two integers to be averged?");
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    double Average1 =( n1+n2)/2.0;
    System.out.println(Average1);
    

}
}
