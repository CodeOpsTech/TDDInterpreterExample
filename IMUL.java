import java.util.Stack;

public class IMUL implements ByteCode { 
	public IMUL() { } 
	public int exec(Stack<Integer> execStack) {
		int val1 = execStack.pop();
		int val2 = execStack.pop();
		return execStack.push(val2 * val1); 
	}
}
	
