package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

public class RiverPereraWeek3 extends LinearOpMode  {


    // Establish variables and objects
    private DcMotor leftDrive = null;



    @Override
    public void runOpMode() throws InterruptedException {

        // Hardware map
        leftDrive = hardwareMap.get(DcMotor.class, "left_drive");

        // Motor setup
        leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


        while (opModeIsActive()) {
            leftDrive.setPower(1);

            if (gamepad1.a) {
                leftDrive.setPower(-1);
            }
        }
    }
}
