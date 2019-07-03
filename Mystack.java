import java.io.*;
class Mystack{
	public static void main(String args[]){
		
		Console con=System.console();
		Stack1 s=new Stack1();
		for(int i=0;i<10;i++){
		System.out.println("Enter"+i+"value : ");
		s.push(con.readLine());
		}
		
		try
		{
		for(int i=9;i>=0;i--)
			{
			Object s1=s.pop();
			System.out.println((String)s1);
		}s.pop();
		}
		catch(UnderFlowException e1)
		{
		System.out.println(e1.getMessage());
		}
		s.empty();
		
	}
}