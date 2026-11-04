/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
      
      Set<Node> S= new HashSet<>();
      while(p != null){
        S.add(p);
        p = p.parent;
      }
      System.out.println(S);

      while(q != null){
        if(S.contains(q)){
            return q;
        }
        q=q.parent;
      }
      return new Node(-1);

        

        
    }
}