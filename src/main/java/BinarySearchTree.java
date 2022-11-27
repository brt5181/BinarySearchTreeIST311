public class BinarySearchTree {
    protected Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(Album album){
        this.root = this.insert(this.root, album);
    }

    public Node insert(Node current, Album album){
        if(current==null) return new Node(album);
        if(album.compareTo(current.album)<0)
            current.leftChild = insert(current.leftChild, album);
        if(album.compareTo(current.album)>0)
            current.rightChild = insert(current.rightChild, album);
        return current;
    }

    public String OrderTraversal(int order){
        if(order ==0) return this.inOrderTraversal(this.root);
        if(order ==-1) return this.preOrderTraversal(this.root);
        if(order ==1) return this.postOrderTraversal(this.root);
        return "";
    }

    public String inOrderTraversal(Node current) {
        StringBuilder STB = new StringBuilder();
        if(current != null) {
            STB.append(this.inOrderTraversal(current.leftChild));
            STB.append(current.album + " ");
            STB.append(this.inOrderTraversal(current.rightChild));
            }
        return STB.toString();
    }

    public String preOrderTraversal(Node current) {
        StringBuilder STB = new StringBuilder();
        if(current != null) {
            STB.append(current.album + " ");
            STB.append(this.preOrderTraversal(current.leftChild));
            STB.append(this.preOrderTraversal(current.rightChild));
        }
        return STB.toString();
    }
    public String postOrderTraversal(Node current) {
        StringBuilder STB = new StringBuilder();
        if(current != null) {
            STB.append(this.postOrderTraversal(current.leftChild));
            STB.append(this.postOrderTraversal(current.rightChild));
            STB.append(current.album + " ");
        }
        return STB.toString();
    }
    public void delete( Album album){
        this.root = this.delete(this.root, album);

    }
    public Album minValue(Node current){
        Album minv = current.album;
        while (current.leftChild != null){
            minv = current.leftChild.album;
            current = current.leftChild;
        }
        return minv;
    }
    public Node delete(Node current, Album album){
        if (current == null) return null;
        if (album.compareTo(current.album)<0)
            current.leftChild = delete(current.leftChild, album);
        else if (album.compareTo(current.album)>0)
            current.rightChild = delete(current.rightChild, album);
        else{
            if (current.leftChild == null)
                return current.rightChild;
            else if (current.rightChild == null)
                return current.leftChild;
            current.rightChild = delete(current.rightChild, current.album);

        }
        return current;

    }
    public boolean contains(Album album) throws ClassCastException {
        if(root == null) return false;
        return true;
    }

    @Override
    public String toString() {

        // get a current pointer
        Node toPrint = this.root;

        // get a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // loop through all the nodes
        while (toPrint != null) {

            // append the content of the string to the builder
            stringBuilder.append(toPrint.album.numberOfSongs);
            stringBuilder.append("  ");

            // advance the pointer
            if(root.leftChild == null){
                toPrint = toPrint.rightChild;
            }
            else {
                if (root.rightChild == null){
                    toPrint = toPrint.leftChild;
                }
                else {
                    toPrint = toPrint.leftChild;
                }
            }

        }

        // return the result
        //
        // This will return the songs from each album for the toString
        return stringBuilder.toString();
    }

}
