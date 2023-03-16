package tests;

import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String family = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", family);
    }

    @Test
    public void getFoodIsExceptionTest() throws Exception {

        exceptionRule.expect(java.lang.Exception.class);
        exceptionRule.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        Animal animal = new Animal();
        animal.getFood("Всеядное");

    }
}
