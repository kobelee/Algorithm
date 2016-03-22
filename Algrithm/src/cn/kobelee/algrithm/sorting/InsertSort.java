package cn.kobelee.algrithm.sorting;

public class InsertSort implements Sorter{

	@Override
	public Data sort(Data data) {
		int j =1;
		int i = j-1;
		
		int[] array = data.array;
		for(;j<array.length;j++){
			int key = array[j];
			i = j-1;
			while(i>=0&&array[i]>key){//shift number that bigger than key to the right.
				array[i+1] = array[i];
				i=i-1;
			}
			array[i+1] = key;
		}
		return data;
	}
	
}
