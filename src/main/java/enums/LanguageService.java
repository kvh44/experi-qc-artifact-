package enums;

import static java.lang.System.out;

public class LanguageService {

	public static void main(String[] args)
	{
		for(Language language: Language.values())
		{
			if(Language.JAVA.equals(language))
			{
				out.println("like: " + language);
			} else {
				out.println("hey: " + language);
			}
		}
	}
	
}
