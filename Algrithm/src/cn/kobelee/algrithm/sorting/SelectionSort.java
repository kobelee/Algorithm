package cn.kobelee.algrithm.sorting;

public class SelectionSort implements Sorter{

	@Override
	public Data sort(Data data) {
		int[] array = data.array;
		for(int i=0;i<array.length-1;i++){
			int key = array[i];
			int key_position = i;
			int j = i+1;
			while(j<array.length){
				if(array[j]<key){
					key = array[j];
					key_position = j;
				}
				j++;
			}
			array[key_position] = array[i];
			array[i] = key;
		}
		return data;
	}

}
