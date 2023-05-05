package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder();
		
		
		if (input.trim().equals(""))
			return "Hello, my friend";
		
		String[][] split_names = split_cap(input.split(","));
		
		if (!(split_names[0][0] == null)) {
			chaine.append("Hello, ");
			chaine.append(list_names(split_names[0]));
			if (!(split_names[1][0] == null))
				chaine.append(". AND ");
		}
		if (!(split_names[1][0] == null)) {
			chaine.append("HELLO, ");
			chaine.append(list_names(split_names[1]));
			chaine.append(" !");

		}

		return chaine.toString();
		
	}
	

	private static String[][] split_cap(String[] names){
		String[][] split_names = new String[2][names.length];
		int index0 = 0, index1 = 0;
		for(int i = 0; i<names.length;i++) {
			if (names[i].equals(names[i].toUpperCase()))
				split_names[1][index1++] = names[i];
			else 
				split_names[0][index0++] = names[i];
		}
		

		
		return split_names;
	}
	
	
	
	private static String list_names(String[] names) {
		StringBuilder chaine = new StringBuilder();
			for (int i = 0; i < names.length && (names[i] != null); i++) {
				System.out.println(names[i]);
				chaine.append(names[i].substring(0,1).toUpperCase() + names[i].substring(1));
				chaine.append(", ");
			}
		chaine.replace(chaine.length()-2, chaine.length(), "");
		return chaine.toString();
	}
}
