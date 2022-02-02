import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    Robot rb1 = new Robot("D1R1");
    Robot rb2 = new Robot("D2R2");
    Arena ar = new Arena();

    @org.junit.jupiter.api.Test
    void fight() {
        ar.fight(rb1, rb2);
        assertTrue((rb1.getLifePoints()==0) || (rb2.getLifePoints()==0));
    }
}