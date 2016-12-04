class RBI
{public void setLoanRate()
{System.out.println("Loan rate is 10%");
}
public void setInterest()
{System.out.println("INT. RATE IS 8%");
}}
class SBI extends RBI
{public void setInterest()
{System.out.println("INT. RATE IS 8.5%");
}}
class OverrideDemo
{public static void main(String ar[])
{
SBI sbi=new SBI();
sbi.setInterest();
}}