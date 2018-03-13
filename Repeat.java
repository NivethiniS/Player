public class Repeat
{

    public char getMax(String word)
    {
        int characterCount = 0;
        int maxCharacter = 0;
        char maxCharacterChar = '.';

        char[] cArray = word.toCharArray();

        for(int i =0; i < cArray.length; i++)
        {
            int characterASCII = (int)cArray[i];
            characterCount = 0;
            for(int x = 0; x < cArray.length; x++)
            {
                if(characterASCII == (int)cArray[x])
                {
                    characterCount ++;
                    if(characterCount > maxCharacter)
                    {
                        maxCharacter = characterCount;
                        maxCharacterChar = cArray[i];
                    }
                }
            }
        }
        return maxCharacterChar;
    }
}
