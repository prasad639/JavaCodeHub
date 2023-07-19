package BST;

public class search_key {

     static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }
    

    public static node BST(node root, int val){
        if( root == null){
            root = new node(val);
             return root;
        }

        if(val < root.data){

            root.left = BST(root.left,val);

        }else{
             root.right = BST(root.right,val);
        }
        return root;

    }

    public static boolean search(node root,int key){
if(root == null){
    return false;
}

if(root.data == key){
    return true;
}

if(root.data > key){
   return search(root.left, key);
}else{
   return search(root.right,key);
}




    }
    public static void main(String args[]) {
        int val[] = { 5, 1, 3, 4, 2, 7 };

        node root = null;
        for (int i = 0; i < 6; i++) {
            root = BST(root, val[i]);
        }

        if(search(root, 100)){
   System.out.println("key is found");
        }else{
               System.out.println("key is not found");
        }

     

    }
}
