package cleanCode.effectiveJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBeanTest {

    @Test
    public void test_createJavaBean(){
        JavaBean javaBean = new JavaBean();
        javaBean.setServingSize(240);
        javaBean.setServings(8);
        javaBean.setCalories(100);
        javaBean.setSodium(35);
        javaBean.setCarbohydrate(27);

        Assertions.assertNotNull(javaBean);
        System.out.println(javaBean);
    }

}