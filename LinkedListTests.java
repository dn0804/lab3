import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void testAppend() {
        LinkedList input1 = new LinkedList();
        input1.append(5);
        input1.append(7);
        input1.append(9);
        input1.append(2);

        assertEquals("5, 7, 9, 2", input1.toString());
        
    }






}