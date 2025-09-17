import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

//Code for user to input values
        System.out.print("Enter Employee name: ");
        String name = input.next();
        System.out.print("Enter Employee TIN: ");
        String tin = input.next();
        System.out.print("Enter Employee's Gross salary: ");
        double gross = input.nextDouble();

//Calculations
        double URATax = gross * 0.30;
        double EmployeeNSSF = gross * 0.05;
        double CompanyNSSF = gross * 0.10;
        double TotalContributionToNSSF = gross * 0.15;
        double TotalDeductions = URATax + TotalContributionToNSSF;
        double NetPay = gross - TotalDeductions;

//Printing Payslip
        System.out.println("\n---------PAYSLIP---------");
        System.out.println("Employee Name:\t\t " + name);
        System.out.println("Employee TIN: \t\t" + tin);
        System.out.println("Gross Pay:\t\t " + df.format(gross));
        System.out.println("URA Tax(30%): \t\t " +df.format (URATax));
        System.out.println("NSSF Contribution(15%):\t\t " +df.format( TotalContributionToNSSF));
        System.out.println("\n----------------------------");
        System.out.println("Net Pay:\t\t " + df.format(NetPay));

    }}





