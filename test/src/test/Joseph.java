package test;

public class Joseph {

	public static void main(String[] args) {
		final int Y=14,D=3,F=4;
		int[] a=new int[Y];
		int i=D-1,k=Y,g=1;
		for(int j=0;j<Y;j++){
			a[j]=j;
		}
		System.out.println("\n³öÈ¦µÄË³ÐãÎª£º");
		do{
			i=i+(F-1);
			while(i>=k){
				i=i-k;
			}
			System.out.print(a[i]+" ");
			for(int j=i;j<k-1;j++){
				a[j]=a[j+1];
			}
			g++;
			k--;
		}while(g<=Y);
	}

}
