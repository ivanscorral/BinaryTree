
public class Node {
	
	private Node left;
	private Node right;
	private int value;
	
	public Node(int value){
		this.right = null;
		this.left = null;
		this.value = value;
	}
	
	public void addNode(Node n){
		if(n.getValue() < this.getValue()){
			if(this.left == null){
				this.left = n;
			}else{
				this.left.addNode(n);
			}
		}else if(n.getValue() > this.getValue()){
			if(this.right == null){
				this.right = n;
			}else{
				this.right.addNode(n);
			}
		}
	}
	
	public void visit(){
		if(this.left != null){
			this.left.visit();
		}
		System.out.println(value);
		if(this.right != null){
			this.right.visit();
		}
	}
	
	public Node search(int value){
		if(this.value == value){
			return this;
		}else if (this.value > value && this.left != null){
			System.out.println("go left");
			return this.left.search(value);
		}else if(this.value < value && this.right != null){
			System.out.println("go right");
			return this.right.search(value);
		}
		
		return null;
	}
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public String toString(){
		return "Value: "+ this.value;
	}

}
