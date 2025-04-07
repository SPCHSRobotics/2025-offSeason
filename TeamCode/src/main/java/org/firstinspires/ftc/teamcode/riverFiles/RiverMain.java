package org.firstinspires.ftc.teamcode.riverFiles;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.riverFiles.RiverFunctions;

@TeleOp(name = "River Main", group = "River")
public class  RiverMain extends LinearOpMode {

    RiverFunctions riverFunctions = new RiverFunctions();

    @Override
    public void runOpMode() throws InterruptedException {
        riverFunctions.helloFTC(telemetry);

        telemetry.update();
    }
}
