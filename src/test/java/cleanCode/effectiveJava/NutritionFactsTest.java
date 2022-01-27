package cleanCode.effectiveJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NutritionFactsTest {

    @Test
    public void test_createNutritionFacts(){
        NutritionFacts nutritionFacts = new NutritionFacts(240,80, 100, 0, 35, 27);
        Assertions.assertNotNull(nutritionFacts);
        System.out.println(nutritionFacts);
    }
}