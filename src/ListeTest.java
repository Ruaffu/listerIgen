import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

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

    @Test
    void testRemoveFromHead() {

        assertEquals(null, liste.removeFromHead());

        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));

        assertEquals("3", liste.removeFromHead().data);


    }
}