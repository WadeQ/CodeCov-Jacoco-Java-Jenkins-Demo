import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddSomeNumbersTest {

    @Test
    void addTwoNumbers() {
        AddSomeNumbers addSomeNumbers = new AddSomeNumbers();
        int result = addSomeNumbers.addTwoNumbers(404, 204);
        assertEquals(608, result);
    }
}