package frc.team10505.robot;

import com.pathplanner.lib.auto.AutoBuilder;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
    
   // private SendableChooser<Double>
    private SendableChooser<Command> autonChooser;

    public RobotConatiner() {
        AutoBuilder.buildAutoChooser();
        SmartDashboard.putData(autonChooser);
    }
}
