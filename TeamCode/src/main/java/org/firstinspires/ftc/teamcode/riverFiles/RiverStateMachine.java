package org.firstinspires.ftc.teamcode.riverFiles;
import com.sfdev.assembly.callbacks.CallbackBase;
import com.sfdev.assembly.state.*;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class RiverStateMachine extends LinearOpMode {
        enum States {
            FIRST,
            SECOND,
            THIRD
        }

        class Car {
            int speed;
            public CallbackBase SetSpeed() {
                return null;
            }
        }

        public void sjshs(){
            Car Honda = new Car();
        }


        @Override
        public void runOpMode() throws InterruptedException {
            Car Honda = new Car();

            StateMachine machine = new StateMachineBuilder()
                    .state(States.FIRST)
                    //.onEnter( () -> {System.out.println( "Entering the first state" );})
                    //.onEnter(Honda.SetSpeed)
                    .transition( () ->  gamepad1.x )
                    .onExit( () -> System.out.println("Exiting!") )

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