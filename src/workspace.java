public class workspace
{
    public static void main(String[] args) throws InterruptedException
    {
        String s = "Hallo";


    }

    public static int findChar(String s, char c)
    {
        for (int i = 0; i < s.length(); ++i)
            if(s.charAt(i)==c)
                return i;

        return -1;
    }

}
