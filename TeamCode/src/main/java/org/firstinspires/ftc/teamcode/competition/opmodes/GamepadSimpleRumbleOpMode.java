package org.firstinspires.ftc.teamcode.competition.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class GamepadSimpleRumbleOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            gamepad1.rumble(100);
        }
    }
}
