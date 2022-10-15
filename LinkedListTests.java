import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void testAppend() {
        LinkedList input1 = new LinkedList();
        int n = 5;
        for (int i = 0; i < n; i++) {
        input1.append(i);
        }
        assertEquals(input1.first(), 0);
        
    }






}