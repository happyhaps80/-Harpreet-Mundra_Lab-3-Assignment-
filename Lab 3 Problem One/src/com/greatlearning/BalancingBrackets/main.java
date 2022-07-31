package com.greatlearning.BalancingBrackets;
import java.util.Stack;
class Helloworld {

public static boolean checkBracketsBalanced(String expression) {
	Stack<Character> stack = new Stack<Character>();
	for(int index=0;index<expression.length();index++) {
		char character = expression.charAt(index);
		if(character =='('|| character =='{'|| character =='['){
			stack.push(character);
			continue;
		}
		if(stack.isEmpty())
			return false;
		char c;
		switch(character) {
		case'}':
			c = stack.pop();
			if(c =='(' || c =='[')
				return false;
			break;
		case ')':
			c = stack.pop();
			if(c =='[' || c =='{')
				return false;
			break;
		case ']':
			c = stack.pop();
			if(c =='(' || c =='{')
				return false;
			break;
		    }
	}
	return (stack.isEmpty());
}
public static void main(String[]args) {
	System.out.println(checkBracketsBalanced("([[{}]])".trim()));
}
}
   


