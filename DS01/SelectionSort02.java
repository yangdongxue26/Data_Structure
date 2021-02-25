package DS01;

public class SelectionSort02 {

	public static void main(String[] args) {
		int[] arr= {5,3,6,8,1,7,9,4,2};
		
		for(int i=0;i<(arr.length/2-1);i++) {
			int minPos=i;
			int maxPos=arr.length-i-1;
			
			//�ҳ���С�����
			for(int j=i;j<arr.length-i;j++) {
				minPos=arr[j]<arr[minPos]?j:minPos;
			}
			for(int j=i;j<arr.length-i;j++) {
				maxPos=arr[j]>arr[maxPos]?j:maxPos;
			}
			
			System.out.println("minPos:"+(minPos+1)+"  "+"maxPos:"+(maxPos+1));
			
			//����
			swap(arr,minPos,i);
			swap(arr,maxPos,arr.length-i-1);
			
			System.out.println("��"+(i+1)+"���������£�");
			print(arr);
			System.out.println();
			System.out.println();
		}
	}
	
	//�������
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//��������
	static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
}
