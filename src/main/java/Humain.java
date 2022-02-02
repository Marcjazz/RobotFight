public class Humain {
    private String nom;
    private int lifePoints;

    public Humain(String nom) {
        this.nom = nom;
        this.lifePoints = 10;
    }

    public void fire(Robot robot) {
        double random = Math.random()*10;
        if(random > 5) robot.setLifePoints(robot.getLifePoints() - 2);
        else System.out.println("l'humain a raté sa cible");
    }
    public void fire(Humain humain) {
        double random = Math.random()*10;
        if(random > 5) humain.setLifePoints(humain.getLifePoints() - 2);
        else System.out.println("l'humain a raté sa cible");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
