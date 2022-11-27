import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    @Test
    public void testInsert(){
        BinarySearchTree bst = new BinarySearchTree();
        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(1, artistNames, "album 1", 1);
        bst.insert(a1);
        assertEquals(a1,bst.root.album);

    }
    @Test
    public void testOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(25, artistNames, "album 1", 1);
        Album a2 = new Album(45, artistNames, "album 2", 2);
        Album a3 = new Album(15, artistNames, "album 3", 3);
        Album a4 = new Album(05, artistNames, "album 5", 6);
        Album a5 = new Album(55, artistNames, "album 5", 7);
        bst.insert(a1);
        bst.insert(a2);
        bst.insert(a3);
        bst.insert(a4);
        bst.insert(a5);


        assertEquals("25: 1 -- [Artist 1, Artist 2] 45: 2 -- [Artist 1, Artist 2] 15: 3 -- [Artist 1, Artist 2] 5: 6 -- [Artist 1, Artist 2] 55: 7 -- [Artist 1, Artist 2] ", bst.OrderTraversal(0));
        assertEquals("25: 1 -- [Artist 1, Artist 2] 45: 2 -- [Artist 1, Artist 2] 15: 3 -- [Artist 1, Artist 2] 5: 6 -- [Artist 1, Artist 2] 55: 7 -- [Artist 1, Artist 2] ", bst.OrderTraversal(-1));
        assertEquals("55: 7 -- [Artist 1, Artist 2] 5: 6 -- [Artist 1, Artist 2] 15: 3 -- [Artist 1, Artist 2] 45: 2 -- [Artist 1, Artist 2] 25: 1 -- [Artist 1, Artist 2] ", bst.OrderTraversal(1));


    }

    @Test
    public void testDelete(){
        BinarySearchTree bst = new BinarySearchTree();
        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(25, artistNames, "album 1", 1);
        Album a2 = new Album(45, artistNames, "album 2", 2);
        Album a3 = new Album(15, artistNames, "album 3", 3);
        Album a4 = new Album(05, artistNames, "album 5", 6);
        Album a5 = new Album(55, artistNames, "album 5", 7);
        bst.insert(a1);
        bst.insert(a2);
        bst.insert(a3);
        bst.insert(a4);
        bst.insert(a5);

        bst.delete(a5);
        assertEquals("25: 1 -- [Artist 1, Artist 2] 45: 2 -- [Artist 1, Artist 2] 15: 3 -- [Artist 1, Artist 2] 5: 6 -- [Artist 1, Artist 2] ", bst.OrderTraversal(0));

        //assertEquals("45: 2 -- [Artist 1, Artist 2] ", bst.root.rightChild.album);

    }

    @Test
    public void testContains(){

    }

}