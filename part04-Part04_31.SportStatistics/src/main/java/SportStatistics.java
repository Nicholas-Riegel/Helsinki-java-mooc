
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String teamQueried = scan.nextLine();
        
        ArrayList<Team> teamsArrayList = new ArrayList<>();

        // try (Scanner reader = new Scanner(Paths.get("part04-Part04_31.SportStatistics/" + file))){
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] dataArray = row.split(",");
                String homeTeamName = dataArray[0];
                int homeScore = Integer.valueOf(dataArray[2]);
                String awayTeamName = dataArray[1];
                int awayScore = Integer.valueOf(dataArray[3]);

                boolean homeTeamExists = false;

                for (Team team : teamsArrayList){
                    if (team.getName().equals(homeTeamName)){
                        homeTeamExists = true;
                        team.incrementGamesPlayed();
                        if (homeScore > awayScore){
                            team.incrementWins();
                        }
                        if (homeScore < awayScore){
                            team.incrementLosses();
                        }
                    }
                }

                if (!homeTeamExists){
                    Team newTeam = new Team(homeTeamName);
                    newTeam.incrementGamesPlayed();
                    if (homeScore > awayScore){
                        newTeam.incrementWins();
                    }
                    if (homeScore < awayScore){
                        newTeam.incrementLosses();
                    }
                    teamsArrayList.add(newTeam);
                }
                
                boolean awayTeamExists = false;

                for (Team team : teamsArrayList){
                    if (team.getName().equals(awayTeamName)){
                        awayTeamExists = true;
                        team.incrementGamesPlayed();
                        if (awayScore > homeScore){
                            team.incrementWins();
                        }
                        if (awayScore < homeScore){
                            team.incrementLosses();
                        }
                    }
                }

                if (!awayTeamExists){
                    Team newTeam = new Team(awayTeamName);
                    newTeam.incrementGamesPlayed();
                    if (awayScore > homeScore){
                        newTeam.incrementWins();
                    }
                    if (awayScore < homeScore){
                        newTeam.incrementLosses();
                    }
                    teamsArrayList.add(newTeam);
                }
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        boolean found = false;
        for (Team team : teamsArrayList){
            if (team.getName().equals(teamQueried)){
                found = true;
                System.out.println("Games: " + team.getGamesPlayed());
                System.out.println("Wins: " + team.getWins());
                System.out.println("Losses: " + team.getLosses());
                break;
            }
        }
        if (!found){
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        }
    }

}
