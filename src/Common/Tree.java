package Common;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class describes a tree. The class also generates the nodes to be used and creates
 * a random tree from the nodes generated.
 * 
 * @author Alexander Chetcuti
 *
 */
public class Tree {

	//A list of nodes.
	private List<Node> nodesArr;
	
	/**
	 * Constructor of class tree.
	 */
	public Tree() { }
	
	/**
	 * Generates nodes and inserts the nodes in a list of nodes.
	 * 
	 * @param countNodes The amount of nodes to be created and inserted in the list.
	 */
	private void generateNodes(int countNodes)
	{
		this.nodesArr = new ArrayList<Node>();
		
		for (int i = 0; i < countNodes; i++) {
			this.nodesArr.add(new Node(i));
		}
	}
	
	/**
	 * Generates a random tree. The trees generated can be of type balanced tree, unbalanced tree and
	 * arbitrary tree. The method also assumes that the minimum number of children passed is at least 1
	 * or greater. If {@code minChildren < 1}, it will default {@code minChildren} to 1.
	 * 
	 * Balanced tree is created by passing {@code minChildren = 2} and {@code maxChildren = 2}. This way
	 * the method creates a proper binary tree.
	 * 
	 * Unbalanced tree is created by passing {@code minChildren = 1} and {@code maxChildren = 2}. This way
	 * the method creates a proper binary tree.
	 * 
	 * Arbitrary tree is created by passing {@code minChildren = 1} and {@code maxChildren} is any amount 
	 * desired.
	 * 
	 * @param noNodes The number of nodes to be added to the tree.
	 * @param minChildren The minimum amount of children a node can have.
	 * @param maxChildren The maximum amount of children a node can have.
	 */
	public void generateRandomTree(int noNodes, int minChildren, int maxChildren) 
	{
		generateNodes(noNodes);
		int nextNodeToAddChildren = 0;
		int currentIndex = 0;
		boolean cont = true;
		Random rand = new Random();
		
		if (minChildren == 0) minChildren = 1;
		
		while (cont) {
			int noChildren = rand.nextInt(maxChildren + 1);
			if (noChildren < minChildren) noChildren = minChildren;
			
			Node currentNode = nodesArr.get(nextNodeToAddChildren);
			nextNodeToAddChildren++;
			if (currentIndex == 0) currentIndex++;
			
			for (int c = 0; c < noChildren; c++) {
				currentNode.addNode(nodesArr.get(currentIndex));
				currentIndex++;
				
				if (currentIndex >= nodesArr.size()) break ;
			}

			if (currentIndex >= nodesArr.size() || nextNodeToAddChildren >= nodesArr.size()) cont = false;
		}
	}
	
	public List<Node> getNodesArr()
	{
		return this.nodesArr;
	}
}
