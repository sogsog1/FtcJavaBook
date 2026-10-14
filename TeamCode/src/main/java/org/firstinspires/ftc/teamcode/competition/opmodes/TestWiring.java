package org.firstinspires.ftc.teamcode.competition.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.competition.mechanisms.ProgrammingBoard1;
import org.firstinspires.ftc.teamcode.competition.mechanisms.tests.TestItem;

import java.util.ArrayList;

public class TestWiring extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();
    ArrayList<TestItem> tests;
    boolean wasDown, wasUp;
    int testNum;

    @Override
    public void init() {
        board.init(hardwareMap);
        tests = board.getTests();
    }

    @Override
    public void loop() {
        //move up in list of test
        if (gamepad1.dpad_up && !wasUp) {
            testNum--;
            if (testNum < 0) {
                testNum = tests.size() - 1;
            }
        }
        wasUp = gamepad1.dpad_up;

        //move down in the list of tests
        if (gamepad1.dpad_down && !wasDown) {
            testNum++;
            if (testNum >= tests.size()) {
                testNum = 0;
            }
        }
        wasDown = gamepad1.dpad_down;

        //Put instructions in telemetry
        telemetry.addLine("Use Up and Down on D-pad to cycle through choices");
        telemetry.addLine("Press A to run test");
        //put test on telemetry
        TestItem currTest = tests.get(testNum);
        telemetry.addData("Test:", currTest.getDescription());
        //run or don't run based on 'a'
        currTest.run(gamepad1.a, telemetry);
    }
}
