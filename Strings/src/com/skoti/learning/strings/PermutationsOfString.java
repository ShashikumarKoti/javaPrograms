package com.skoti.learning.strings;

public class PermutationsOfString {

	public static void main(String[] args) {

		String word = "JSP";
		findAllPermutationsOfString("", word);
	}

	private static void findAllPermutationsOfString(String permutation, String input) {
		if(input.length()==0) {
			System.out.println(permutation);
		}else {
			for(int i=0;i<input.length();i++) {
			findAllPermutationsOfString(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
			}
		}
	}
}


//How It Works?
//Let input be the “JSP”.
//
//(Inside the StringPermutation(String permutation, String input) method)
//
//permutation = “”,  input = “JSP”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 3))
//
//–> StringPermutation(“”+’J’, “”+”SP”)
//
//–> StringPermutation(“J”, “SP”)
//
//permutation = “J”,  input = “SP” 
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“J”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 2))
//
//–> StringPermutation(“J”+’S’, “”+”P”)
//
//–> StringPermutation(“JS”, “P”)
//
//permutation = “JS”,  input = “P” 
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“JS”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 1))
//
//–> StringPermutation(“JS”+’P’, “”+””)
//
//–> StringPermutation(“JSP”, “”)
//
//permutation = “JSP”,  input = “”
//
//As input.length() == 0
//
//Print permutation  –>  Print “JSP”
//
//for i = 1 (permutation = “JS”,  input = “P”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 1 (permutation = “J”,  input = “SP”)
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“J”+input.charAt(1), input.substring(0, 1)+input.substring(1+1, 2))
//
//–> StringPermutation(“J”+’P’, “S”+””)
//
//–> StringPermutation(“JP”, “S”)
//
//permutation = “JP”,  input = “S”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“JP”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 1))
//
//–> StringPermutation(“JP”+’S’, “”+””)
//
//–> StringPermutation(“JPS”, “”)
//
//permutation = “JPS”,  input = “”
//
//As input.length() == 0
//
//Print permutation  –>  Print “JPS”
//
//for i = 1 (permutation = “JP”,  input = “S”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 2 (permutation = “J”,  input = “SP” )
//
//As i == input.length()
//
//Break for loop
//
//for i = 1 (permutation = “”,  input = “JSP” )
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“”+input.charAt(1), input.substring(0, 1)+input.substring(1+1, 3))
//
//–> StringPermutation(“”+’S’, “J”+”P”)
//
//–> StringPermutation(“S”, “JP”)
//
//permutation = “S”,  input = “JP”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“S”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 2))
//
//–> StringPermutation(“S”+’J’, “”+”P”)
//
//–> StringPermutation(“SJ”, “P”)
//
//permutation = “SJ”,  input = “P”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“SJ”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 1))
//
//–> StringPermutation(“SJ”+’P’, “”+””)
//
//–> StringPermutation(“SJP”, “”)
//
//permutation = “SJP”,  input = “”
//
//As input.length() == 0
//
//Print permutation  –>  Print “SJP”
//
//for i = 1 (permutation = “SJ”,  input = “P”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 1 (permutation = “S”,  input = “JP”)
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“S”+input.charAt(1), input.substring(0, 1)+input.substring(1+1, 2))
//
//–> StringPermutation(“S”+’P’, “J”+””)
//
//–> StringPermutation(“SP”, “J”)
//
//permutation = “SP”,  input = “J”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“SP”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 1))
//
//–> StringPermutation(“SP”+’J’, “”+””)
//
//–> StringPermutation(“SPJ”, “”)
//
//permutation = “SPJ”,  input = “”
//
//As input.length() == 0
//
//Print permutation  –>  Print “SPJ”
//
//for i = 1 (permutation = “SP”,  input = “J”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 2 (permutation = “S”,  input = “JP”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 2 (permutation = “”,  input = “JSP” )
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“”+input.charAt(2), input.substring(0, 2)+input.substring(2+1, 3))
//
//–> StringPermutation(“”+’P’, “JS”+””)
//
//–> StringPermutation(“P”, “JS”)
//
//permutation = “P”,  input = “JS”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“P”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 2))
//
//–> StringPermutation(“P”+’J’, “”+”S”)
//
//–> StringPermutation(“PJ”, “S”)
//
//permutation = “PJ”,  input = “S”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“PJ”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 1))
//
//–> StringPermutation(“PJ”+’S’, “”+””)
//
//–> StringPermutation(“PJS”, “”)
//
//permutation = “PJS”,  input = “”
//
//As input.length() == 0
//
//Print permutation  –>  Print “PJS”
//
//for i = 1 (permutation = “PJ”,  input = “S”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 1 (permutation = “P”,  input = “JS”)
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“P”+input.charAt(1), input.substring(0, 1)+input.substring(1+1, 2))
//
//–> StringPermutation(“P”+’S’, “J”+””)
//
//–> StringPermutation(“PS”, “J”)
//
//permutation = “PS”,  input = “J”
//
//As input.length() != 0
//
//Control comes to for loop of else block
//
//for i = 0
//
//StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()))
//
//–> StringPermutation(“PS”+input.charAt(0), input.substring(0, 0)+input.substring(0+1, 1))
//
//–> StringPermutation(“PS”+’J’, “”+””)
//
//–> StringPermutation(“PSJ”, “”)
//
//permutation = “PSJ”,  input = “”
//
//As input.length() == 0
//
//Print permutation  –>  Print “PSJ”
//
//for i = 1 (permutation = “PS”,  input = “J”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 2 (permutation = “P”,  input = “JS”)
//
//As i == input.length()
//
//Break for loop
//
//for i = 3 (permutation = “”,  input = “JSP” )
//
//As i == input.length()
//
//Break for loop