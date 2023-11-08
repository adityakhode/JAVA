class FootballPlayer extends player {
    private int goalsScored;
    
    public FootballPlayer(String name, int age, int goalsScored) {
        super(name, age);
        this.goalsScored = goalsScored;
    }
    
    public void displayFootballDetails() {
        displayDetails();
        System.out.println("Goals Scored: " + goalsScored);
    }
}