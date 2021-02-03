public class Torrent
{	
	private String torrentFileName;
	private int dotCount;

	public String getFileName()
	{
		return torrentFileName;
    }

	public void removePeriods(int currentDotCount)
	{
		dotCount = currentDotCount;
		
    }
}