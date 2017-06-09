import java.util.Stack;

public class IDIV implements ByteCode { 
	public IDIV() { } 
	public int exec(Stack<Integer> execStack) {
		int val1 = execStack.pop();
		int val2 = execStack.pop();
		if(val1 == 0) {
			throw new DivByZeroException(); 
		} 
		return execStack.push(val2 / val1); 
	}
}
	
