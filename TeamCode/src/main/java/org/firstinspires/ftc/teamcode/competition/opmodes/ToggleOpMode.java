package org.firstinspires.ftc.teamcode.competition.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.competition.mechanisms.ProgrammingBoard1;

public class ToggleOpMode extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();
    boolean aAlreadyPressed;
    boolean motorOn;
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a && !aAlreadyPressed) {
            motorOn = !motorOn;
            telemetry.addData("Motor", motorOn);
            if (motorOn) {
                board.setMotorSpeed(0.5);
            } else {
                board.setMotorSpeed(0);
            }
        }
        aAlreadyPressed = gamepad1.a;
    }
}
