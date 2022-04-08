public class Athlete extends Celebrity
  {
    private String team;
    private String sport;
    public Athlete ()
    {
      
    }
    public Athlete(String clue, String answer, String t, String s)
    {
      super(clue,answer);
      team = t;
      sport = s;
    }
    public String getClue()
    {
      return "The Athlete plays " + sport + "And he/she is on " + team;
    }
  }