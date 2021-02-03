import java.util.ArrayList;

public class FileModification
{
    public static void main(String[] args)
    {
        ArrayList<Object> torrentNames = new ArrayList<>();
        ArrayList<Integer> nameDotCount = new ArrayList<>();
        ArrayList<String> currentNameChars = new ArrayList<>();

        int currentDotCount = 0;

        Torrent student1 = new Torrent();

        torrentNames.add(student1);

        for (int i = 0; i < torrentNames.size(); i++)
        {
            Torrent currentObj = (Torrent) torrentNames.get(0);

            for (int j = 0; j < currentObj.toString().length(); j++)
            {
                currentNameChars.add(currentObj.toString().substring(j, j + 1));
                
                if(currentNameChars.get(j).equals("."))
                {
                    currentDotCount++;
                }
            }



            nameDotCount.add(currentDotCount);
            currentDotCount = 0;
        }
    }
}
