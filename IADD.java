import java.util.Stack;

public class IADD implements ByteCode { 
	public IADD() { } 
	public int exec(Stack<Integer> execStack) {
		int val1 = execStack.pop();
		int val2 = execStack.pop();
		return execStack.push(val2 + val1); 
	}
}
	
