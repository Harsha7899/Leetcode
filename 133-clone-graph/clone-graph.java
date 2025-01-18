/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    private Node cloneutil(Node node, HashMap <Node, Node> Hm)
    {
        Node newNode = new Node(node.val);
        Hm.put(node, newNode);
        
        for(Node neighbor : node.neighbors)
        {
            if(!Hm.containsKey(neighbor))
            {//not cloned
                 newNode.neighbors.add(cloneutil(neighbor, Hm));
            }
            else{ //cloned
                newNode.neighbors.add(Hm.get(neighbor));
            }
        }
        return newNode;
    }



    public Node cloneGraph(Node node) {
            if(node==null)
                return null;
        HashMap <Node, Node> Hm = new HashMap<>();
        return cloneutil(node, Hm);
        
    }
}