import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    Robot rb1 = new Robot("d2r2");
    Robot rb2 = new Robot("data");


    @org.junit.jupiter.api.Test
    void fire() {
        int lifebeforeCombat = rb2.getLifePoints();
        rb1.fire(rb2);
        int lifeafterCombat = rb2.getLifePoints();
        System.out.println(rb1.getLifePoints());
        System.out.println(rb2.getLifePoints());
        assertTrue(lifeafterCombat<lifebeforeCombat);
    }

    @org.junit.jupiter.api.Test
    void isDead() {
    }
}