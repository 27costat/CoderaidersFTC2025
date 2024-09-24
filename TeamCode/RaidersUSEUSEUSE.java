package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

public class RaidersUSEUSEUSE extends LinearOpMode {

private DcMotor motor1leftmotor;
private DcMotor motor0rightmotor;
private DcMotor motor2botright;
private DcMotor motor3botleft;

@Override
public void runOpMode() {
motor1leftmotor = hardwareMap.get(DcMotor.class, "motor 1/left motor"