import java.util.*;

/**
 * Created by ilkayaktas on 27.05.2022 at 16:36.
 *
 *  * Given a list of integers nums and an integer target, return indices of the 2 numbers such that they add up to target
 *  * You may not use the same number twice
 *  * Input: nums = [3,2,4], target = 6
 *  * Output: [1,2]
 */

public class Solution {
	public List<Integer> findIndex(int [] input, int target){
		Map<Integer, List<Integer>> map = new HashMap<>(); // key = numbers, values= indexes

		// init map
		for (int i = 0; i < input.length; i++) {
			if(map.containsKey(input[i])){
				map.get(input[i]).add(i);
			} else{
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(input[i], list);
			}
		}

		Arrays.sort(input);

		int result = 0;
		for (int i = input.length-1; i >= 0 ; i--) {
			List<Integer> index1 = map.get(input[i]);

			result = target - input[i];
			List<Integer> index2 = map.get(result);

			if (index1.equals(index2)){
				return List.of(index1.get(0), index2.get(1));
			} else{
				return List.of(index1.get(0), index2.get(0));
			}

		}

		return null;
	}
}
