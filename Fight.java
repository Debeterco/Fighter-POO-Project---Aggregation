package UFC;
import java.util.Random;

public class Fight {
    // Atributes
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;
    // Constructor
    public Fight() {
        this.approved = false;
    }
    // Getters and Setters
    public Fighter getChallenged() {return this.challenged;}
    public void setChallenged(Fighter challenged) {this.challenged = challenged;}

    public Fighter getChallenger() {return this.challenger;}
    public void setChallenger(Fighter challenger) {this.challenger = challenger;}

    public int getRounds() {return this.rounds;}
    public void setRounds(int rounds) {this.rounds = rounds;}

    public boolean isApproved() {return this.approved;}
    public void setApproved(boolean approved) {this.approved = approved;} // Fixed typo here
    // Methods
    public void markFight(Fighter f1, Fighter f2) {
        if (f1.getCategory().equals(f2.getCategory()) && f1 != f2) {
            this.approved = true;
            this.challenged = f1;
            this.challenger = f2;
        } else {
            this.approved = false;
            this.challenged = null;
            this.challenger = null;
        }
    }

    public void fight() {
        if (this.approved) {
            System.out.println(" === DESAFIADO ===");
            this.challenged.present();
            System.out.println(" === DESAFIANTE ===");
            this.challenger.present();

            Random rand = new Random();
            int vendedor = rand.nextInt(3);
            switch (vendedor) {
                case 0: //DRAW
                    System.out.println("=== EMPATE ===");
                    this.challenged.drawFight();
                    this.challenger.drawFight();
                    break;
                case 1: //CHALLENGED WIN
                    System.out.println("=== VITORIA DO " + this.challenged.getName() + " ===");
                    this.challenged.wonFight();
                    this.challenger.lostFight();
                    break;
                case 2: //CHALLENGER WIN
                    System.out.println("=== VITORIA DO " + this.challenger.getName() + " ===");
                    this.challenged.lostFight();
                    this.challenger.wonFight();
                    break;
            }
        } else {
            System.out.println("The fight cannot happen.");
        }
    }
}

