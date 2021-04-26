// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }
}
