package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class AidynWeek3 extends LinearOpMode {
    //Establish variables and objects
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    @Override
    public void runOpMode() throws InterruptedException {
        //HardwareMap
        leftDrive = hardwareMap.get(DcMotor.class,  "left_drive");
        rightDrive = hardwareMap.get(DcMotor.class,"right_drive");
        //MotorSetUp
        leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        waitForStart();
        while(opModeIsActive()) {
            leftDrive.setPower(0.3);
            rightDrive.setPower(0.3);
        }
    }
}
