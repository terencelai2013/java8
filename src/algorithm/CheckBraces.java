package algorithm;
import java.util.Stack;

public class CheckBraces {
	public static void main(String[] args) {
		String[] list = new String[5];
		list[0] = "{}[]";
		list[1] = "{()}";
		list[2] = "{(]}";
		list[3] = "{{}}{(]}";
		list[4] = "[[[[((({{{ }}})))]]]]";

		String[] output = braces(list);
		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);

		}
		// n.length()
	}

	static String[] braces(String[] values) {
		Stack<String> stack = new Stack<String>();
		String[] returnList = new String[values.length];
		String currentString;
		String currentChar;
		String temp;
		String currentOneOK;
		for (int i = 0; i < values.length; i++) {
			currentOneOK = "YES";
			currentString = values[i];
			for (int j = 0; j < currentString.length(); j++) {
				currentChar = currentString.substring(j, j + 1);
				System.out.println("currentChar:" + currentChar);
				if (currentChar.equals("(") || currentChar.equals("{") || currentChar.equals("[")) {
					stack.push(currentChar);
				} else {
					temp = stack.pop();
					System.out.println("temp:" + temp);
					if (currentChar.equals(")") && !temp.equals("(")) {
						currentOneOK = "NO";
						break;
					} else if (currentChar.equals("}") && !temp.equals("{")) {
						currentOneOK = "NO";
						break;
					} else if (currentChar.equals("]") && !temp.equals("]")) {
						currentOneOK = "NO";
						break;
					}
				}
			}
			stack.clear();
			returnList[i] = currentOneOK;
		}
		return returnList;
	}
}
