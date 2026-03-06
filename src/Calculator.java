import java.util.Scanner;

public class Calculator {
    private double n1;
    private double n2;
    private double sum;
    private double sub;
    private double result;


    public Calculator (double n1, double n2) {
        this.n1=n1;
        this.n2=n2;
        this.sum=0;
        this.sub=0;
        this.result=0;

    }
    public double sum () {
        sum=n1+n2;
        return (sum);

    }
    public double sub () {
        sub= n1-n2;
        return (sub);

    }
    public double divide () {
        result = n1 / n2;
        return(result);
    }
    public double mul () {
        result = n1 * n2;
        return(result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter two values");
        double B1 = input.nextDouble();
        double B2 = input.nextDouble();
        Calculator c1 = new Calculator(B1,B2);
        System.out.println(c1.sub());
        System.out.println(c1.divide());
        System.out.println(c1.mul());
        System.out.println(c1.sum());


    }


}
