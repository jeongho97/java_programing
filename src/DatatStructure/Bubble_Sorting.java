/*이정호 자료구조 시험 10번 문제*/
package DatatStructure;

class Bubble_sort{
	public void bubbleSort(int a[]) {
		int i,j,temp,size;
		size=a.length;
		for(i=size-1;i>0;i--) {
			System.out.printf("\n버블 정렬%d 단계 : ", size-i);
			for(j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.printf("\n\t");
				for(int k=0;k<size;k++)
					System.out.printf("%3d", a[k]);
			}
		}
	}
}
public class Bubble_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,27,19,51,8,24,11};
		Bubble_sort S = new Bubble_sort();
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0; i<a.length;i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.bubbleSort(a);

	}

}
