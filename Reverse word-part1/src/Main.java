
public class Main {

	public static void main(String[] args) {
		String sentence = "Are you as excited as I am?";
		String reverseSentence = "";
		String[] array = sentence.split(" ");
		//change first letter of first word to lower case and add ?
		array[0] = array[0].toLowerCase()+"?";
		//index of last element of array 
		int index = array.length-1;
		//change first letter of last word to upper case and remove ?
		array[index] = array[index].substring(0,1).toUpperCase()+array[index].substring(1,array[index].length()-1);
		//going through each element backward
		for (int i=array.length-1; i>=0; i--) {
			//concatenate element into reverseWord separate by space
			reverseSentence+= array[i]+" ";
		}
		System.out.println(reverseSentence);
	}

}
