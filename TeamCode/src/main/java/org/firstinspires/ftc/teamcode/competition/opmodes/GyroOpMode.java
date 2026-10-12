package org.firstinspires.ftc.teamcode.competition.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.competition.mechanisms.ProgrammingBoard1;

public class GyroOpMode extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Our Heading (DEG)", board.getHeading(AngleUnit.DEGREES));
        telemetry.addData("Our Heading (RAD)", board.getHeading(AngleUnit.RADIANS));
        if (board.getHeading(AngleUnit.DEGREES) < 0) {
            board.setMotorSpeed(-1);
        } else if (board.getHeading(AngleUnit.DEGREES) > 0) {
            board.setMotorSpeed(1);
        } else {
            board.setMotorSpeed(0);
        }
    }
}
