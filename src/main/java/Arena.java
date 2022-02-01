public class Arena {

    public  Robot fight(Robot robot1, Robot robot2) {
        while(!robot1.isDead() && !robot2.isDead()) {
            double random = Math.random()*10;
            if(random > 5) robot1.fire(robot2);
            else robot2.fire(robot1);
        }
        return robot1.isDead() ? robot2: robot1;
    }

    public  void main(String [] agrs) {
        Robot robot1 = new Robot("D2R2");
        Robot robot2 = new Robot("Data");
        Robot winner = fight(robot1, robot2);
        System.out.println("Le vainqueur est "+ winner.getRobotName()+ " avec "+winner.getLifePoints() +"de points de vie");
    }
}
