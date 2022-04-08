public class CEO extends Celebrity
{
  private String company;
  private int netWorth;
  public CEO()
  {
    
  }
  public CEO(String clue, String answer, String com, int nW)
    {
      super(clue,answer);
      company = com;
      netWorth = nW;
    }
    public String getClue()
    {
      return "The CEO owns this company " + company + "And he/she is worth $" + netWorth;
    }
}