package org.firstinspires.ftc.teamcode.riverFiles;
import com.sfdev.assembly.state.*;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;

@TeleOp
public class RiverStateMachine extends LinearOpMode {
        enum States {
            FIRST,
            SECOND,
            THIRD
        }

        @Override
        public void runOpMode() throws InterruptedException {

            StateMachine machine = new StateMachineBuilder()
                    .state(States.FIRST)
                    .onEnter( () -> {
                        System.out.println( "Entering the first state" );
                    })
                    .transition( () ->  gamepad1.x ) // transition when gamepad1.x is clicked
                    .onExit( () -> System.out.println("Exiting!") ) // setting check2 to false

                    .state(States.SECOND)
                    .onEnter( () -> System.out.println( "Entering the second state" ) )
                    .transition( () -> gamepad1.b) // if check2 is false transition

                    .state(States.THIRD)
                    .onEnter( () -> System.out.println( "In the third state" ) )
                    .build();

            waitForStart();

            machine.start();

            while(opModeIsActive()) { // autonomous loop
                machine.update();
            }
        }
}