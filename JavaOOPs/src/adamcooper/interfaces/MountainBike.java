package adamcooper.interfaces;

public class MountainBike implements Bicycle{
    private int seatHeight;
    private int gear;
    private int speed;
    public MountainBike(int startHeight, int startSpeed, int startGear)
    {
        this.seatHeight = startHeight;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    public int getGear() {
        return gear;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public int getSpeed() {
        return speed;
    }
}
