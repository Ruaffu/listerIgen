import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead() {
        Node node = new Node("data1");
        assertEquals("data1", liste.insertFromHead(node).data);
    }
}