package cleanCode.effectiveJava;

public class JavaBean {

    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public JavaBean(){ }

    public void setServingSize(int val){
        servingSize = val;
    }

    public void setServings(int val){
        servings = val;
    }

    public void setCalories(int val){
        calories = val;
    }

    public void setFat(int val){
        fat = val;
    }
    public void setSodium(int val){
        sodium = val;
    }

    public void setCarbohydrate(int val){
        carbohydrate = val;
    }
}
