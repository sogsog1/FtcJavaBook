package org.firstinspires.ftc.teamcode.competition.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.competition.mechanisms.ProgrammingBoard1;

@TeleOp
public class DistanceColorOpMode extends OpMode {
    double motorSpeed = 0;

    ProgrammingBoard1 board = new ProgrammingBoard1();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Amount red", board.getAmountRed());
        telemetry.addData("Amount blue", board.getAmountBlue());
        telemetry.addData("Distance (CM)", board.getDistance(DistanceUnit.CM));
        telemetry.addData("Distance (IN)", board.getDistance(DistanceUnit.INCH));
        motorSpeed = (board.getDistance(DistanceUnit.CM) > 10) ? 0.5 : 0;
        board.setMotorSpeed(motorSpeed);
    }
}
