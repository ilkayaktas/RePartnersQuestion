import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ilkayaktas on 27.05.2022 at 16:50.
 */
class SolutionTest {

	@Test
	void findIndex() {
		Solution solution = new Solution();

		List<Integer> index = solution.findIndex(new int[]{3, 2, 3}, 6);

		System.out.println(index.get(0)+ " "+ index.get(1));
		assertEquals(1, index.get(0));
		assertEquals(2, index.get(1));
	}
}