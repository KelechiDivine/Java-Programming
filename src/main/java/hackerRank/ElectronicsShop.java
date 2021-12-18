package hackerRank;

public class ElectronicsShop {

    public void interior(){}
    public void callInterior(){
        interior();
        System.out.println();
    }

    public static void main(String[] args) {
        ElectronicsShop electronicsShop = new ElectronicsShop();
        electronicsShop.interior();

    }

}
