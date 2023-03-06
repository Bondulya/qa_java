import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFamilyToAnimalReturntValidValue(){
        Animal animal = new Animal();
        String expexted = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        String actualAnimal = animal.getFamily();

        assertEquals(expexted, actualAnimal);
    }

    @Test
    public  void getFoodAnimalRuternValidValuePredator() throws Exception{
        Animal animal = new Animal();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = animal.getFood("Хищник");
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void  getFoodAnimalReturnValidValueHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood =List.of("Трава", "Различные растения");
        List<String> actualFood = animal.getFood("Травоядное");
        Assert.assertEquals(expectedFood,actualFood);
    }

}
