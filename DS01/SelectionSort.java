package DS01;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,3,6,8,1,7,9,4,2};
		
		for(int i=0;i<arr.length-1;i++) {
			int minPos=i;
			
			//�ҳ��˴�ѭ������Сֵ��λ��
			for(int j=i+1;j<arr.length;j++) {
				minPos=arr[j]<arr[minPos]?j:minPos;
			}
			
			System.out.println("minPos:"+(minPos+1));
			swap(arr,i,minPos);
			
			System.out.println("��"+(i+1)+"���������£�");
			print(arr);
			
			System.out.println();
			System.out.println();
		}
	}
	
	
	//��������
	static void swap(int[] arr,int i,int j) {
		//��������
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	//�������
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
