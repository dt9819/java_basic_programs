import java.io.*;
class InteractiveInputBuffered{
	public static void main(String args[]) throws IOException
	{
		String s=" ";
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		System.out.print("Enter Your Name: ");
		s= br.readLine();
		System.out.println(s+", this is another way of taking input");
	}
}