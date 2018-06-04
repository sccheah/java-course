public class StringUtils
{
    public static boolean included(String word, String searched)
    {
        String tmpWord = word.toUpperCase();
        String tmpSearched = searched.toUpperCase();

        tmpWord = tmpWord.trim();
        tmpSearched = tmpSearched.trim();

        if (tmpWord.contains(tmpSearched))
            return true;

        return false;
    }

}