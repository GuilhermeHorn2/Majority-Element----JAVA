package misc;

public class main_misc2 {

	public static void main(String[] args) {
		// 
		int[] v = {4,3,3,2,3,3};
		System.out.println(maj_num(v));
		
	}
	private static void swap(int[]v,int i,int j) {
		int d = v[j];
		v[j] = v[i];
		v[i] = d;
	}
	private static void quickSort(int[]v,int strt,int end) {
		if(strt >= end) {
			return;
		}
		int p = v[end];
		int l = strt;
		int r = end;
		while(l < r) {
			while(v[l] <= p && l < r) {
				l++;
			}
			while(v[r] >= p && l < r) {
				r--;
			}
			swap(v,l,r);
		}
		if(v[strt] >= v[end]) {
			swap(v,strt,l);
		}
		else {
			l = end;
		}
		quickSort(v,strt,l-1);
		quickSort(v,l+1,end);
	}
	private static int maj_num(int[]v) {
		//
		quickSort(v,0,v.length-1);
		int k = v.length/2;
		for(int i = 0;i < k;i++){
			if(v[i] == v[i+k]) {
				return v[i];
			}
		}
		return 0;
	}

	}


