package com.stack.queue.assignment;

import java.util.Stack;

public class BalancedParantheses {

	Stack stk = new Stack();
	public int solve(String str) {

		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {

			if(stk.isEmpty()) {
				stk.push(arr[i]);
			}
			else {
				if((char)stk.peek()=='(' && arr[i]==')') {
					stk.pop();
				}

				else if((char)stk.peek()=='{' && arr[i]=='}') {

					stk.pop();
				}

				else if((char)stk.peek()=='[' && arr[i]==']') {

					stk.pop();
				}
				else {
					stk.push(arr[i]);
				}
			}

		}
		if(stk.isEmpty()) {
			return 1;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
