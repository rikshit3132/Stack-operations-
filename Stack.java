class Nma{
	int top=-1;
	int stack[]=new int[5];
		int capacity=5;

	public void push(int x){
		if(isFull()){
         System.out.println("Stack is full\n");
         System.exit(1);
		}
		else{
			top++;
			stack[top]=x;
		}
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Underflow");
			System.exit(1);
		}
		else{
			return stack[top--];
		}
		return 0;
	}
	public boolean isFull(){
       return top==capacity-1;
	}

	public boolean isEmpty(){
       return top==-1;
	}

public int size(){
	return top+1;
}
public void printStack(){
	for(int i=0;i<=top;i++){
		System.out.println("Stack is:"+stack[i]);
	}
}
}
class Stack{
	public static void main(String args[]){
Nma n1=new Nma();
n1.push(1);
n1.push(2);
n1.push(3);
n1.push(4);

n1.pop();
System.out.println("After pushing:\n");
n1.printStack();
	}
}