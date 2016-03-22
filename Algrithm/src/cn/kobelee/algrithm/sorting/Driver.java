package cn.kobelee.algrithm.sorting;

public class Driver {
	public static void main(String[] args) {
		Data data = Data.getInstance();
		Sorter sorter = new MergeSort();
		sorter.sort(data);
		int[] array = data.array;
		for(int i = 0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
