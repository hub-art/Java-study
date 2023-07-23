package come.itheima.Test;

public class Test8 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法copyOfTange(int[]arr,int from,int to)
        功能：将数组arr中从索引from（包含from）开始
			  到索引to结束（不包含to）的元素复制到新数组中，
			  将新数组返回。
		*/

        //定义一个数组
        int [] arr = {1,2,3,4,5,6,7,8,9};
        //调用函数(写上区间范围)
        int[] copyarr =copyOfTange(arr,2,5);
        //遍历查看结果
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i] + " ");
        }
    }
    //将数组arr从索引from(包括from)开始，到索引to结束(不包含to)的元素复制到新数组中
    public static int[] copyOfTange(int[]arr,int from,int to){
        //定义一个数组
        int[] newArr = new int[to - from];
        //把原始数组arr中的from到to上对应的元素，直接拷贝到数组newArr中

        //伪造索引的思想
        int index = 0;
        for (int i = from; i < to; i++) {
            //格式：数组名[索引] = 数据值;
            newArr[index] = arr[i];
            index++;
        }
        //将数组返回
        return newArr;
    }
}
