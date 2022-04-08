public class Actor extends Celebrity
  {
    private String movie;
    private String characterName;
    public Actor ()
    {
      
    }
    public Actor(String clue, String answer, String m, String cN)
    {
      super(clue,answer);
      movie = m;
      characterName = cN;
    }
    public String getClue()
    {
      return "The Actor is in the movie " + movie + "And he/she is " + characterName + " in the movie";
    }
  }