package com.jda.datastructureprograms;

import com.jda.utility.Stack;
import com.jda.utility.Utility;

public class StackParentheses {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Stack<Character> st = new Stack<Character>();
		System.out.println("Give the expression to be evaluated");
		Utility utility = new Utility();
		String exp = utility.takeInputString();
		char[] a = exp.toCharArray();
		boolean check = st.isEmpty();
		for(int i = 0; i < a.length; i++) {
			if(a[i] == '(')
				st.push('(');
			else if(a[i] == ')' && !(st.isEmpty()))
				st.pop('(');
			else if(a[i] == ')' && st.isEmpty())
				check = false;
		}
		System.out.println((st.isEmpty() && check));
	}
}
