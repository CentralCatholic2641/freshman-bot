// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team2641.freshmanbot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClawSubsystem extends SubsystemBase {
  public Compressor compressor = new Compressor(21, PneumaticsModuleType.CTREPCM);
  public DoubleSolenoid clamper = new DoubleSolenoid(21, PneumaticsModuleType.CTREPCM, 0, 1);

  /** Creates a new ClawSubsystem. */
  public ClawSubsystem() {
    compressor.enableDigital();
    release();
  }

  public void clamp() {
    clamper.set(DoubleSolenoid.Value.kForward);
  }

  public void release() {
    clamper.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
