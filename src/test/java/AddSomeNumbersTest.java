import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddSomeNumbersTest {

    @Test
    void addTwoNumbers() {
        AddSomeNumbers addSomeNumbers = new AddSomeNumbers();
        int result = addSomeNumbers.addTwoNumbers(12,20);
        assertEquals(32,result);
    }
}