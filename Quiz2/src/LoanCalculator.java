
public class LoanCalculator {
	
	double totalPrice;
	double downPayment;
	double loanLength; //in months
	double interestRate;
	double monthlyPay;
	double totalInterest;
	
	
	double MonthlyPay() {
		monthlyPay= ((interestRate/12)*(totalPrice-downPayment))/
				(1-(java.lang.Math.pow((1+(interestRate/12)),-loanLength)));
		return monthlyPay;
	}
	
	double TotalInterest() {
		totalInterest=(monthlyPay*loanLength)-(totalPrice-downPayment);
		return totalInterest;
	}

}
