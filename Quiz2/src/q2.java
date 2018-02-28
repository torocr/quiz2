import java.util.Scanner;
public class q2 {
		
		public static void main(String args[]) {
			
		LoanCalculator f=new LoanCalculator();
		Scanner stdin=new Scanner(System.in);
		
		System.out.print("Insert Total Price: ");
		f.totalPrice=stdin.nextDouble();
		
		System.out.print("Insert Down Payment: ");
		f.downPayment=stdin.nextDouble();
		
		System.out.print("Insert Loan Length in Months: ");
		f.loanLength=stdin.nextDouble();
		
		System.out.print("Insert Interest Rate: ");
		f.interestRate=stdin.nextDouble();
	
		stdin.close();
		
		System.out.println(f.MonthlyPay());
		System.out.println(f.TotalInterest());
		}
		
	}

