import com.test.BankOnline;
import com.test.BankOnlineException;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class BankOnlineTest {

    @Test
    public void testNullArguments() {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send(null, null);
            fail("Исключение не генерируется для нулевых аргументов");
        } catch (BankOnlineException e) {
            assertEquals("Аргументы не могут быть null!", e.getMessage());
        }
    }

    @Test
    public void testBlockedCard() {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send("1111111111111111", 100.0);
            fail("Исключение не генерируется для заблокированной карты");
        }
        catch (BankOnlineException e) {
            assertEquals("Перевод на заблокированные карты невозможен!", e.getMessage());
        }
    }

    @Test
    public void testInvalidCardNumber() {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send("123456789012345", 100.0);
            fail("Исключение не генерируется для неверного номера карты");
        } catch (BankOnlineException e) {
            assertEquals("Номер карты должен состоять из 16 цифр!", e.getMessage());
        }
    }

    @Test
    public void testLimitExceeded() {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send("1234567890123456", 60000.0);
            fail("Исключение не генерируется при превышении лимита суммы перевода");
        } catch (BankOnlineException e) {
            assertEquals("Лимит до 50 000!", e.getMessage());
        }
    }

    @Test
    public void testNegativeAmount() {
        BankOnline bankOnline = new BankOnline();
        try {
            bankOnline.send("1234567890123456", -100.0);
            fail("Исключение не генерируется при отрицательной сумме перевода");
        } catch (BankOnlineException e) {
            assertEquals("Сумма перевода не может быть отрицательной!", e.getMessage());
        }
    }




}