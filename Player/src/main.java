public class main {
    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new CricketPlayer("Sachin", 48, 100);
        FootballPlayer footballPlayer = new FootballPlayer("Messi", 34, 700);
        HockeyPlayer hockeyPlayer = new HockeyPlayer("Dhyan Chand", 114, 400);
        
        System.out.println("Cricket Player Details:");
        cricketPlayer.displayCricketDetails();
        
        System.out.println("\nFootball Player Details:");
        footballPlayer.displayFootballDetails();
        
        System.out.println("\nHockey Player Details:");
        hockeyPlayer.displayHockeyDetails();
    }
}