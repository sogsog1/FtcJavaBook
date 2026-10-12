package org.firstinspires.ftc.teamcode.competition;

public class RobotLocation {
    double angle;
    double x;
    double y;

    public RobotLocation(double angleDegrees) {
        this.angle = angleDegrees;
    }

    public double getHeading() {
        double angle = this.angle;
        while (angle > 180) {
            angle -= 360;
        }
        while (angle < -180) {
            angle += 360;
        }
        return Math.toDegrees(angle);
    }

    @Override
    public String toString() {
        return "RobotLocation:  angle (" + angle + ")";
    }

    public void turn(double angleChangeDegrees) {
        angle += angleChangeDegrees;
    }

    public void setAngle(double angleDegrees) {
        this.angle = angleDegrees;
    }

    public double getAngle() {
        return angle;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void changeX(double x) {
        this.x += x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void changeY(double y) {
        this.y += y;
    }

    public double getY() {
        return y;
    }
}
