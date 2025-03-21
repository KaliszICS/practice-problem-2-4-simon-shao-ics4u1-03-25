public class PracticeProblem {

	public static void main(String args[]) {

	}

public static void selectionSortName(String[] names, int[] ages){
	for (int j = 0; j<names.length-1;j++){
		int smallestIn = j;
		for (int i = j+1; i<names.length;i++){
			if (names[smallestIn].compareToIgnoreCase(names[i])>0){
				smallestIn = i;
			}
		}
		String temp = names[smallestIn];
		int tempAge = ages[smallestIn];
		ages[smallestIn] = ages[j];
		names[smallestIn] = names[j];
		names[j] = temp;
		ages[j] = tempAge;
	}
}

public static void selectionSortAge(String[] names, int[] ages){
	for (int j = 0; j<ages.length-1;j++){
		int smallestIn = j;
		for (int i = j+1; i<ages.length;i++){
			if (ages[smallestIn] > ages[i]){
				smallestIn = i;
			}
		}
		String temp = names[smallestIn];
		int tempAge = ages[smallestIn];
		ages[smallestIn] = ages[j];
		names[smallestIn] = names[j];
		names[j] = temp;
		ages[j] = tempAge;
	}
}

}
