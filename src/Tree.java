
public class Tree {
	
	private Node root;
	
	public Tree(){
		this.root = null;
	}
	
	public void addValue(int value){
		Node n = new Node(value);
		
		if(this.root == null){
			this.root = n;
		}else{
			this.root.addNode(n);
		}
	}
	
	public void visit(){
		this.root.visit();
	}
	
	public void search(int val){
		if(this.root.search(val) != null){
			System.out.println("found");
		}else{
			System.out.println("not found");
		}
	}

}
