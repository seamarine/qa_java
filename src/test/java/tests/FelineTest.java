package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline animal = new Feline();
        List<String> responseList = animal.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), responseList);

    }

    @Test
    public void getFamilyTest() {
        Feline animal = new Feline();
        String responseFamily = animal.getFamily();
        Assert.assertEquals("Кошачьи", responseFamily);
    }

    @Test
    public void getKittensTest() {
        Feline animal = new Feline();
        int expectedCountKittens = 1;
        int countKittens = animal.getKittens();
        Assert.assertEquals(expectedCountKittens, countKittens);
    }

    @Test
    public void getKittensIntTest() {
        Feline animal = new Feline();
        int countKittensCheck = 5;
        int countKittens = animal.getKittens(countKittensCheck);
        Assert.assertEquals(countKittensCheck, countKittens);
    }
}
