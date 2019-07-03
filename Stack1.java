import java.io.*;
import java.util.*;
class UnderFlowException extends Exception
{
	public UnderFlowException(String str)
	{
		super(str);
	}
}
class Stack1{
	Vector v=new Vector();
	void push(Object o){
			v.add(o);
			
		}
	Object pop() throws UnderFlowException{
		if(empty()){
			int i=v.size()-1;
			Object t=v.lastElement();
			
			v.remove(i);
			return t;
			}
		else{
		UnderFlowException e=new UnderFlowException("Stack is under flow");
		throw e;
}
	
}
	boolean empty() {
		
		if(v.size()>0)
			return true;
		else
			return false;
	}

}
