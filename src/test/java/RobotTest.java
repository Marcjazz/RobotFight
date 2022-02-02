import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot robot1 = new Robot("D2R2");
    Robot robot2 = new Robot("Data");
    @org.junit.jupiter.api.Test
    void fire() {
    }

    @org.junit.jupiter.api.Test
    void TestisDead() {
        robot1.fire(robot2);
        robot1.fire(robot2);
        robot1.fire(robot2);
        robot1.fire(robot2);
        robot1.fire(robot2);

        assertFalse(robot1.isDead());
        assertTrue(robot2.isDead());
    }

}