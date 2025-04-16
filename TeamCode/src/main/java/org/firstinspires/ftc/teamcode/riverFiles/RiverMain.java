package org.firstinspires.ftc.teamcode.riverFiles;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;

import org.firstinspires.ftc.teamcode.riverFiles.RiverFunctions;

@TeleOp(name = "River Main", group = "River")
public class  RiverMain extends LinearOpMode {

    NormalizedColorSensor colorSensor;

    RiverFunctions riverFunctions = new RiverFunctions();

    String detectedColor = "NULL";




    @Override
    public void runOpMode() throws InterruptedException {

        colorSensor = hardwareMap.get(NormalizedColorSensor.class, "sensor_color");

        waitForStart();

        while (opModeIsActive()) {
            riverFunctions.helloFTC(telemetry);

            detectedColor = riverFunctions.colorSensorGetColor(colorSensor,gamepad1, gamepad2, telemetry);

            telemetry.addData("Intake Sample Color", detectedColor);

            telemetry.update();
        }

    }
}
