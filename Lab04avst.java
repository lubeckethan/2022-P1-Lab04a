// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        System.out.println( "Principal:" + " " + "$" + principal);
        double annualRate = 4.85;
        System.out.println("Annual Rate:" + " " + annualRate + "%");
        double numYears   = 30;
        System.out.println("Number of Years:" + " " + numYears);

        double numMonths = (numYears * 12);
        double monthRate = ((annualRate /100) / 12);
        double monthPayNum = monthRate * (Math.pow((1+monthRate),numMonths));
        double monthPayDen = Math.pow((1+monthRate),numMonths) -1;
        double monthlyPay = (monthPayNum / monthPayDen) * principal;
        double monthlyPayRound = (Math.ceil(monthlyPay * 100)/100);
        System.out.println( "Monthly Payment:" + " " + "$" + monthlyPayRound );

        double totalPay = monthlyPayRound * numMonths;
        System.out.println( "Total Payments:" + " " + "$" + totalPay);

        double totalInt = totalPay - principal;
        System.out.println ("Total Interest:" + " " + "$" +totalInt);










        System.out.println();
    }
}

