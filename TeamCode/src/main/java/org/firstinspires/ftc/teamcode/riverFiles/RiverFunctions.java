package org.firstinspires.ftc.teamcode.riverFiles;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

import org.firstinspires.ftc.teamcode.riverFiles.RiverColorVariables;



public class RiverFunctions {

    public void helloFTC(Telemetry telemetry)
    {
        telemetry.addData("Hello", "World");
    }


    /*
        This function is used to interpret the color sensor values, taking inputs from the color sensor
        and then returning a string either Red, Yellow, Blue, Null

        This is specifically used to determine what sample is held in the intake or if it is empty
         */
    public String colorSensorGetColor (NormalizedColorSensor colorSensor, Gamepad gamepad1, Gamepad gamepad2, Telemetry telemetry) {

        // Create variable for detected color and set default as null and empty
        String detectedColor = "Null";

        // Get the normalized colors from the sensor
        NormalizedRGBA colors = colorSensor.getNormalizedColors();

        // Compare to thresholds to detect color
        if (colors.blue > RiverColorVariables.blueThreshold) { detectedColor = "Blue"; }
        else if (colors.green >= RiverColorVariables.yellowThreshold) { detectedColor = "Yellow"; }
        else if (colors.red >= RiverColorVariables.redThreshold) { detectedColor = "Red"; }



        int r = ( detectedColor.equals("Red")  ) ? 1 : 0;
        int g = ( detectedColor.equals("Yellow") ) ? 1 : 0;
        int b = ( detectedColor.equals("Blue")) ? 1 : 0;

        gamepad1.setLedColor(r, g, b, Gamepad.LED_DURATION_CONTINUOUS);
        gamepad2.setLedColor(r, g, b, Gamepad.LED_DURATION_CONTINUOUS);

        return detectedColor;
    }}



