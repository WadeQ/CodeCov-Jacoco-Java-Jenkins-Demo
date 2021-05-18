import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddSomeNumbersTest {

    @Test
    void addTwoNumbers() {
        AddSomeNumbers addSomeNumbers = new AddSomeNumbers();
        int result = addSomeNumbers.addTwoNumbers(50, 30);
        assertEquals(80, result);
    }
}