import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();
    Liste listeMedTal = new Liste();

    @BeforeEach
    void setUp() {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");

        listeMedTal.insertFromHead(node0);
        listeMedTal.insertFromHead(node1);
        listeMedTal.insertFromHead(node2);
        listeMedTal.insertFromHead(node3);
    }

    @org.junit.jupiter.api.Test
    void insertFromHead() {
        Node node = new Node("data1");
        assertEquals("data1", liste.insertFromHead(node).data);
    }

    @Test
    void isEmpty() {

        assertEquals(true, liste.isEmpty());
        liste.insertFromHead(new Node("viktor"));
        assertEquals(false, liste.isEmpty());
    }

    @Test
    void testPrintListFromHead() {
        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));

        assertEquals("321", liste.printFromHead());
    }

    @Test
    void testInsertFromTail() {
        liste.insertFromTail(new Node("1"));
        liste.insertFromTail(new Node("2"));
        liste.insertFromTail(new Node("3"));

        assertEquals("123", liste.printFromHead());
    }

    @Test
    void testPrintFromTail() {
        liste.insertFromTail(new Node("1"));
        liste.insertFromTail(new Node("2"));
        liste.insertFromTail(new Node("3"));

        assertEquals("321", liste.printFromTail());
    }

//    @Test
//    void testRemoveFromHead() {
//
//        assertEquals(null, liste.removeFromHead());
//
//        liste.insertFromHead(new Node("1"));
//        liste.insertFromHead(new Node("2"));
//        liste.insertFromHead(new Node("3"));
//
//        assertEquals("3", liste.removeFromHead().data);
//
//    }




    @Test
    void removeFromHead() {


    }

    @Test
    void testRemoveFromTail() {

        assertEquals(null, liste.removeFromTail());

        liste.insertFromTail(new Node("3"));
        liste.insertFromTail(new Node("2"));
        liste.insertFromTail(new Node("1"));

        assertEquals("1", liste.removeFromTail().data);
    }
}