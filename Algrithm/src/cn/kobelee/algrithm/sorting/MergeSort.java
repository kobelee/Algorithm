package cn.kobelee.algrithm.sorting;

public class MergeSort implements Sorter {

	@Override
	public Data sort(Data data) {
		int[] array = data.array;
		this.mergeSort(array, 0, array.length);
		return data;
	}

	/**
	 * to merge operation
	 * 
	 * @param array
	 *            the array to be merged. Generally, the array should be like
	 *            this: [3,2,3,|1|,3,5,|7|,|2|,4,6,|8|,2,1,3]. The numbers's
	 *            indexes that are quoted by || are p,q,r as following
	 *            parameters description.
	 * @param p
	 *            the start index of array's sorted
	 * @param q
	 *            the end1 index of array's sorted
	 * @param r
	 *            the end2 index of array's sorted
	 * @return
	 */
	public int[] merge(int[] array, int p, int q, int r) {
		int nLeft = q - p + 1; // the size of the left
		int nRight = r - q; // the size of the right
		int[] leftArray = new int[nLeft + 1];
		int[] rightArray = new int[nRight + 1];
		int i = 0;
		int j = 0;
		for(;i<nLeft;i++){
			leftArray[i] = array[p+i];
		}
		for(;j<nRight;j++){
			rightArray[j] = array[q+j];
		}
		leftArray[nLeft] = Integer.MAX_VALUE;
		rightArray[nRight] = Integer.MAX_VALUE;
		i = 0;
		j = 0;
		for(int k = p;k<r;k++){
			if(leftArray[i]<=rightArray[j]){
				array[k] = leftArray[i];
				i++;
			}else{
				array[k] = rightArray[j];
				j++;
			}
		}
		return array;
	}
	private void mergeSort(int[] array,int p,int r){
		
	}
}
