public class Arena {

    public  Robot fight(Robot robot1, Robot robot2) {
        while(!robot1.isDead() && !robot2.isDead()) {
            double random = Math.random()*10;
            if(random > 5) robot1.fire(robot2);
            else robot2.fire(robot1);
        }
        return robot1.isDead() ? robot2: robot1;
    }
}
