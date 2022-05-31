public class BinaryTree {
  public  Node root;

  public Node add (Node current, int value){
      //cand arborele nu are elemente
      if(current==null){
          return new Node(value);
      }
      if(value< current.value){
          current.left = add(current.left, value);
      }
      else if (value > current.value){
          current.right = add(current.right, value);
      }
      return current;
  }
  public Node delete (Node current, int value){
      if (current==null){
          return null;
      }
      if (current.value==value){
          //caz1: nu are fii/succesori
          if(current.left==null && current.right==null){
              return null;
          }
          //caz2: are un singur fiu stanga/dreapta
          if (current.left==null){
              return current.right;
          }
          if (current.right==null){
              return current.left;
          }
          //caz3: are 2 fii
          int min = smallestvalue(current.right);
          current.value=min;
          current.right=delete(current.right, min);
          return current;
      }
      if ( value < current.value){
          current.left = delete(current.left, value);
      }
      else {
          current.right= delete(current.right, value);
      }
      return current;
}

private int smallestvalue (Node root ){
      if (root.left ==null){
          return root.value;
      }
      return smallestvalue(root.left);
}
public void parcurgeinordine (Node root){
      if (root != null){
          parcurgeinordine(root.left);
          System.out.print(" " + root.value);
          parcurgeinordine(root.right);
      }

}
    public static void main(String[] args){
      BinaryTree arbore = new BinaryTree();
      Node root = new Node (6);
      arbore.root = root;
        arbore.add(root, 4);
        arbore.add(root, 8);
        arbore.add(root, 3);
        arbore.add(root, 5);
        arbore.add(root, 7);
        arbore.add(root, 9);
        arbore.parcurgeinordine(root);

    }
}
