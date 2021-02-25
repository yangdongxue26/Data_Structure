package DS01;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,3,6,8,1,7,9,4,2};
		
		for(int i=0;i<arr.length-1;i++) {
			int minPos=i;
			
			//找出此次循环的最小值的位置
			for(int j=i+1;j<arr.length;j++) {
				minPos=arr[j]<arr[minPos]?j:minPos;
			}
			
			System.out.println("minPos:"+(minPos+1));
			swap(arr,i,minPos);
			
			System.out.println("第"+(i+1)+"次排序如下：");
			print(arr);
			
			System.out.println();
			System.out.println();
		}
	}
	
	
	//交换函数
	static void swap(int[] arr,int i,int j) {
		//交换数据
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	//输出函数
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
