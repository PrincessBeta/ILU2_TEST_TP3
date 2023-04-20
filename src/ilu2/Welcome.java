package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		
		chaine.append("Hello, ");
		
		if (input.trim().equals(""))
			chaine.append("my friend");
		else if (input.split(",").length == 2) {
			String[] names = input.split(",");
			chaine.append(names[0].substring(0,1).toUpperCase() + names[0].substring(1) + ", ");
			chaine.append(names[1].substring(0,1).toUpperCase() + names[1].substring(1));
		}
		else
			chaine.append(input.substring(0,1).toUpperCase() + input.substring(1));
		
		 if (input.toUpperCase().equals(input) && !input.trim().equals(""))
			return chaine.append(" !").toString().toUpperCase();
		 else
			return chaine.toString();
		
	}
}
