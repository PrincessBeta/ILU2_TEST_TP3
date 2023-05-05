package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		
		chaine.append("Hello, ");
		
		if (input.trim().equals(""))
			chaine.append("my friend");
		else {
			String[] names = input.split(",");
			for (int i = 0; i < names.length; i++) {
				chaine.append(names[i].substring(0,1).toUpperCase() + names[i].substring(1));
				chaine.append(", ");
			}
			chaine.replace(chaine.length()-2, chaine.length(), "");
		}
		
		 if (input.toUpperCase().equals(input) && !input.trim().equals(""))
			return chaine.append(" !").toString().toUpperCase();
		 else
			return chaine.toString();
		
	}
}
