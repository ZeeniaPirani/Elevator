package main.java.frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

public class elevatorButBetter {
    
    public final TalonFX motor;
    public TalonFXConfiguration config;

    public int motorID;

    public elevatorButBetter() {
        motor = new TalonFX(motorID);

        config = new TalonFXConfiguration();

        config.Slot0.kP = 0;
        config.Slot0.kD = 0;
        config.Slot0.kG = 0;

        motor.getConfigurator().apply(config);
    }

}
