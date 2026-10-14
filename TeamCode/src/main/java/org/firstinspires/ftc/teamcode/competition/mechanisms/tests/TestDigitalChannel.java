package org.firstinspires.ftc.teamcode.competition.mechanisms.tests;

import com.qualcomm.robotcore.hardware.DigitalChannel;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestDigitalChannel extends TestItem {
    private DigitalChannel touchSensor;

    public TestDigitalChannel(String description, DigitalChannel touchSensor) {
        super(description);
        this.touchSensor = touchSensor;
    }

    @Override
    public void run(boolean on, Telemetry telemetry) {
        telemetry.addData("isPressed:", !touchSensor.getState());
    }
}
