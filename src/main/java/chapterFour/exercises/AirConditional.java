package chapterFour.exercises;

public class AirConditional {

    public int acIsOn(String controlSwitch) {
        if (controlSwitch.equals("on") || controlSwitch.equals("ON"))
            System.out.println("Ac is now on.");
        return 16;
    }

    public boolean acIsOff(String controlSwitch) {
        if (controlSwitch.equals("off") || controlSwitch.equals("OFF"))
            System.out.println("Ac is now off.");
        return true;
    }

    public int acTemperature(int remotePanel) {
        if (remotePanel < 16 || remotePanel > 30){
            acIsOff("off");
        }
        else {
            acIsOn("on");
            System.out.println("Temperature is: " + remotePanel);
        }
        return remotePanel;
    }
}
