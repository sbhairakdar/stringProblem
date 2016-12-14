package com.apple;

public class StringReplace {

	

	public static String removeCharacter(String text, char charToRemove) {
		 		
		 		//if text is null then return null
		 		if (text == null) return null;
		 		StringBuilder outputStr = new StringBuilder();
		 		
		 		for (char character : text.toCharArray()) {
		 			//Filtering the char to remove from the char arrays
		 			if (character!= charToRemove) {
		 				outputStr.append(character);
		 			}
		 		}
		 		
		 		return outputStr.toString();
		 	}
		 
		 	public static String removeCharacterUsingStringApi(String text, char charToRemove) {
		 		
		 		//if text is null then return null
		 		if (text == null) return null;
		 		//These are the special chars and are used in regex in String replaceAll function so these should be escaped
		 		if (charToRemove=='$' || charToRemove=='^' || charToRemove=='*' )
		 			  return text.replaceAll(String.valueOf("\\"+charToRemove), "");
		 		else{
		 			//Use string api to replace character
			 		return text.replaceAll(String.valueOf(charToRemove), "");
		 		}
		 	}

		 	
		 	public static void main(String[] args) {
		 		
		 	}

}
