class HockeyPlayer extends player {
    private int goalsMade;
    
    public HockeyPlayer(String name, int age, int goalsMade) {
        super(name, age);
        this.goalsMade = goalsMade;
    }
    
    public void displayHockeyDetails() {
        displayDetails();
        System.out.println("Goals Made: " + goalsMade);
    }
}