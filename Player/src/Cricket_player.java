class CricketPlayer extends player {
    private int runsScored;
    
    public CricketPlayer(String name, int age, int runsScored) {
        super(name, age);
        this.runsScored = runsScored;
    }
    
    public void displayCricketDetails() {
        displayDetails();
        System.out.println("Runs Scored: " + runsScored);
    }
}
