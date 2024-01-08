package com.stack.queue.assignment;

import java.util.Stack;

public class GetMinimum {
	
	Stack minStack = new Stack();
	Stack stk = new Stack();
	public void push(int x) {
		
		if(minStack.isEmpty() && stk.isEmpty()) {
			stk.push(x);
			minStack.push(x);
		}
		else {
			if(x<=(int)minStack.peek()) {
				stk.push(x);
				minStack.push(x);
			}
			else {
				stk.push(x);
			}
		}
	}

	public void pop() {
		
		if(!stk.isEmpty()) {
			if((int)stk.peek()==(int)minStack.peek()) {
				
				stk.pop();
				minStack.pop();
			}
			
			else {
				stk.pop();
			}
		}
	}

	public int top() {
		
		if(stk.isEmpty()) {
			return -1;
		}
		else {
			return (int)stk.peek();
		}
	}

	public int getMin() {
		
		if(minStack.isEmpty()) {
			return -1;
		}
		else {
			return (int)minStack.peek();
		}
		
	}
}
