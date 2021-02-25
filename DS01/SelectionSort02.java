package DS01;

public class SelectionSort02 {

	public static void main(String[] args) {
		int[] arr= {5,3,6,8,1,7,9,4,2};
		
		for(int i=0;i<(arr.length/2-1);i++) {
			int minPos=i;
			int maxPos=arr.length-i-1;
			
			//找出最小和最大
			for(int j=i;j<arr.length-i;j++) {
				minPos=arr[j]<arr[minPos]?j:minPos;
			}
			for(int j=i;j<arr.length-i;j++) {
				maxPos=arr[j]>arr[maxPos]?j:maxPos;
			}
			
			System.out.println("minPos:"+(minPos+1)+"  "+"maxPos:"+(maxPos+1));
			
			//交换
			swap(arr,minPos,i);
			swap(arr,maxPos,arr.length-i-1);
			
			System.out.println("第"+(i+1)+"次排序如下：");
			print(arr);
			System.out.println();
			System.out.println();
		}
	}
	
	//输出函数
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//交换函数
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}
