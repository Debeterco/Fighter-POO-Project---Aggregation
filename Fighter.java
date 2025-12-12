package UFC;

public class Fighter {
    // Atributes
    private String name;
    private String nacionality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int wins;
    private int defeats;
    private int draws;
    private String status;
    // Constructor
    public Fighter(String name, String nacionality, int age, double height, double weight, int wins, int defeats, int draws, String status) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.wins = wins;
        this.defeats = defeats;
        this.draws = draws;
        this.status = status;
        setCategory();
    }
    // Getters and Setters
    // Name
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Nacionality
    public String getNacionality() {
        return this.nacionality;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    // Age
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Height
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    // Weight
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
        setCategory();
    }
    // Category
    public String getCategory() {
        return this.category;
    }
    public void setCategory() {
        if(this.weight < 52.2) {this.category = "Inválido";} 
        else if(this.weight <= 70.3) {this.category = "Lightweight";} 
        else if(this.weight <= 83.9) {this.category = "Middleweight";} 
        else if(this.weight <= 120.2) {this.category = "Heavyweight";}
        else {this.category = "Not elegible fighter";}
    }
    // Wins
    public int getWins() {
        return this.wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    // Defeats
    public int getDefeats() {
        return this.defeats;
    }
    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }
    // Draws
    public int getDraws() {
        return this.draws;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }
    // Status
    public String getStatus() {
        if("Champion".equals(this.status)) {
            return "the Champion of the UFC!";
        } else if ("Active".equals(this.status)) {
            return "an active fighter.";
        } else {
            return "retired from the UFC.";
        }
    }
    public void setStatus(String status) {
        this.status = status;
    }
    // Override method 
    public void status() {
        System.out.println("=============== UFC FIGHTER PRESENTATION ===============");
        System.out.println("Fighter: " + this.getName());
        System.out.println("Origin:" + this.getNacionality());
        System.out.println("Weight: " + this.getWeight() + " kg");
        System.out.println("Height: " + this.getHeight() + " m");
        System.out.println("Age: " + this.getAge() + " years old");
        System.out.println("Category: " + this.getCategory());
        System.out.println("Wins: " + this.getWins() + " | Defeats: " + this.getDefeats() + " | Draws: " + this.getDraws());
        System.out.println("========================================================");
    }
    public void present() {
        System.out.println("Bruce Buffer: '" + this.getName() + " is a " + this.getCategory() + " fighter with " + this.getWins() + " wins, " + this.getDefeats() + " defeats and " + this.getDraws() + " draws." + "\nAnd now he is " + this.getStatus() + "'");
    }
    public void wonFight() {
        this.setWins(this.getWins() + 1);
    }
    public void lostFight() {
        this.setDefeats(this.getDefeats() + 1);
    }
    public void drawFight() {
        this.setDraws(this.getDraws() + 1);
    }
}