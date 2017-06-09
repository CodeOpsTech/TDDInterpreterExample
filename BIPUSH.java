import java.util.Stack;

public class BIPUSH implements ByteCode { 
	public BIPUSH(int val) {
		this.val = val;
	} 
	public int exec(Stack<Integer> execStack) {
		return execStack.push(val);
	}
	public int getVal() { return val; } 
	private int val;
}
