class BasicCalculator
{
	int a,b;
	
	void Addition()
	{
		System.out.println("a+b = "+(a+b));	
	}
	void Multiplication()
	{
		System.out.println("a*b = "+(a*b));	
	}

	void Division()
	{
		System.out.println("a/b = "+(a/b));	
	}

	void Subtraction()
	{
		System.out.println("a-b = "+(a-b));	
	}

	void modulus()
	{
		System.out.println("a%b = "+(a%b));	
	}
	
	public static void main(String args[]){
		
		BasicCalculator calc= new BasicCalculator();
		calc.a=10;
		calc.b=30;
		calc.Addition();
		calc.Multiplication();
		calc.Division();
		calc.Subtraction();
		calc.modulus();
	}
}