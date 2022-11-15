package abschnitt_6u21;

public class CommanderSWX315 extends Vehicle implements RoadVehicle, RailVehicle{
    private int track= 1435, nOW= 4;

    @Override public int trackGauge() {return track;}
    @Override public int numberOfWheels() {return nOW;}
}
