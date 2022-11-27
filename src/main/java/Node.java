public class Node {
    protected Album album;
    protected Node leftChild;
    protected Node rightChild;

    public Node(Album album1){
        this.album = album1;
        this.leftChild = null;
        this.rightChild = null;
    }

}
