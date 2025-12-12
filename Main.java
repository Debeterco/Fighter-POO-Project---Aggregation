package UFC;
public class Main {
    public static void main(String[] args) {
         Fighter F[] = new Fighter[3];
        F[1] = new Fighter("Jon Jones", "USA", 32, 1.93, 93.0, 26, 1, 0, "Active");
        F[2] = new Fighter("Alex Pereira", "Brazil" , 32, 1.88, 84.0, 7, 0, 0, "Champion");
        /* 
        F[1].status();
        F[1].present();
        F[1].lostFight();
        F[1].status();

        F[2].status();
        F[2].present();
        F[2].wonFight();
        F[2].status();
        markFight(F[1], F[2]);
        */
        
        Fight UFC01 = new Fight();
        UFC01.markFight(F[1], F[2]);
        UFC01.fight();
    }
}
