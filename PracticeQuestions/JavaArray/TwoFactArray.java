package JavaArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoFactArray {

	public static void main(String[] args) {
		int arr[][] = { { 3, 4, 5 }, {8, 9,7}, { 15, 20, 17 } };
		List<Integer> rowin = Arrays.stream(arr).map(rows->Arrays.stream(rows).min().getAsInt()).collect(Collectors.toList());
		List<int[]> er = Arrays.stream(arr).collect(Collectors.toList());

		int cols = arr[0].length;
		List<Integer> col = IntStream.range(0, cols).mapToObj(co->IntStream.range(0,arr.length).map(row->arr[row][co]).max().getAsInt()).collect(Collectors.toList());
//		System.out.println(col);
//		rowin.stream().filter(col::contains).forEach(System.out::println);
		
		
		int max =Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		int br[] = {10,40,20,30};
		for(int i=0;i<br.length;i++)
		{
			if(br[i]>max)
			{
				max=br[i];
			}
		}
		for(int i=0;i<br.length;i++)
		{
			if(br[i]<min)
			{
				min=br[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

		
		
		
	}
}
