package cn.kobelee.algrithm.sorting;

public final class Data {
     int[] array = {5,3,7,1,4,3,8,7,3,6,2};
     private static Data data = new Data();
     private Data(){
    	 
     }
     public static Data getInstance(){
    	 return data;
     }
     
}
