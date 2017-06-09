import java.util.Stack;
import java.util.List;

public class Interpreter { 
	public Interpreter(Stack<Integer> execStack) {
		this.execStack = execStack;
	}
	private Stack<Integer> execStack;
	public int interpret(List<ByteCode> byteCodes) {
		byteCodes.forEach(byteCode -> byteCode.exec(execStack)); 
		// for(ByteCode byteCode : byteCodes)
	 	//     byteCode.exec(execStack);
		return execStack.peek(); 
	}
} 
