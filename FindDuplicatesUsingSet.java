package week3.day2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesUsingSet {

	public static void main(String[] args) {
		int[] nums= {10,24,32,64,85,37,12,10,24};
		//boolean bDuplicates= false;
		Set<Integer> unique=new LinkedHashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(!unique.add(nums[i])) {
				System.out.println("Duplicate value is "+nums[i]);
				//bDuplicates= true;
				//break; (It stops with first duplicate value)
			}
		}
			//if(!bDuplicates)
			System.out.println("Unique Values:" +unique);
		
		/*List<Integer> listA = Arrays.asList(10,24,32,64,85,37,12,10,24);
		
		Set<Integer>setName=new HashSet<Integer>(listA);
		System.out.println(Arrays.asList(setName));
		*/
	}

}
