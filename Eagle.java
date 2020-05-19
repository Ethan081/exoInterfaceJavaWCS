package exoInterfaceJava;

import java.awt.*;

public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }



    /**
     *take off, must be on ground
     */
    @Override
    public void takeOff(){
        if (!flying && this.altitude == 0){
            this.flying = true;
            System.out.printf("%s takes off in the sky %n", this.getName());
        }
    }

    /**
     * ascend
     * @param meters altitude increase
     * @return ascend
     */
    @Override
    public int ascend(int meters){
        if (this.flying){
            this.altitude = this.altitude + meters ;
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;

    }
    /**
     * @param meters
     * @return descend
     */
    @Override
    public int descend(int meters){
        if (this.flying){
            this.altitude = this.altitude - meters;
            System.out.printf("%s flies downward, altitude : %d%n", getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land(){
        if (this.flying && this.altitude < 10){
            System.out.printf("%s lands on the ground. %n", getName());
        }else {
            System.out.printf("%s is too high, it can't lands.%n", getName());
        }

    }


}
