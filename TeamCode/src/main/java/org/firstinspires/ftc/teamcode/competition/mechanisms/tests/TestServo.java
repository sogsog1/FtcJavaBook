package org.firstinspires.ftc.teamcode.competition.mechanisms.tests;

import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestServo extends TestItem {
    private Servo servo;
    private double min, max;

    public TestServo(String description, Servo servo, double min, double max) {
        super(description);
        this.servo = servo;
        this.min = min;
        this.max = max;
    }

    @Override
    public void run(boolean on, Telemetry telemetry) {
        if (on) {
            servo.setPosition(min);
        } else {
            servo.setPosition(max);
        }
        telemetry.addData("Servo position:", servo.getPosition());
    }
}
