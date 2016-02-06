package plalab.algorithm.hw4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
0,1,&,|,^ 으로 구성된 불린 표현식과, 원하는 계산 결과가 주어진다. 표현식에 괄호를 추가하여 그 값이 원하는 결과 값이 되도록 하는 가능한 모든 방법의 수를 구하는 함수를 구현하라.
예)
표현식: 1^0|0|1
원하는 결과: false(=0)
출력: 2가지 방법 => 1^((0|0)|1) 그리고 1^(0|(0|1))
public static int countSolutions(String exp, boolean result);
연산 순서가 같으면 괄호가 없어도 같은 경우로 처리한다.
(예: 1|1|0 은 (1|1)|0과 같음)

[ Hint ]
  for (짝수번째) {
   char op = exp.charAt(i);
   ...
   if (result == true) {
    // 연산자의 좌우가 원하는 값(true/false)가 되는 경우의 수를 구하기 위해
    // 재귀 호출을 하고 이를 더해 나간다.
    switch (op) {
    case '|':
     count += 왼쪽이 참인 경우x오른쪽이 참인 경우; // 1|1
     count += ...; // 1|0
     count += ...; // 0|1
     break;
    case '&':
     count += ...; // 1|1
     break;
    case '^':
     count += ...; // 1|0
     count += ...; // 0|1
     break;
    }
   } else {// (result==false)
    ...
   }
  }
 */
public class Hw4Test {
	private final String[] exps = { "1|0", "0|0|1", "1^0|0|1", "1^0&0|1|1^0&0|1^0&0|1|1^0&1|1^0&0|1" };
	private final boolean[] results = { false, true, false, true };
	private final int[] counts = { 0, 2, 2, 94960523 };

	@Test
	public void testDaleSeoWithOneOperator() {
		assertEquals(1, Hw4.countSolutionsDaleSeo("1|1", true));
		assertEquals(1, Hw4.countSolutionsDaleSeo("1|0", true));
		assertEquals(1, Hw4.countSolutionsDaleSeo("0|1", true));
		assertEquals(0, Hw4.countSolutionsDaleSeo("0|0", true));
		assertEquals(0, Hw4.countSolutionsDaleSeo("1|1", false));
		assertEquals(0, Hw4.countSolutionsDaleSeo("1|0", false));
		assertEquals(0, Hw4.countSolutionsDaleSeo("0|1", false));
		assertEquals(1, Hw4.countSolutionsDaleSeo("0|0", false));
	}
	
	@Test
	public void testDaleSeoWithTwoOperators() {
		assertEquals(2, Hw4.countSolutionsDaleSeo("0|0|1", true));
		assertEquals(0, Hw4.countSolutionsDaleSeo("0|0|1", false));
	}
	
	@Test
	public void testDaleSeoWithThreeOperators() {
		assertEquals(2, Hw4.countSolutionsDaleSeo("1^0|0|1", false));
	}
	
	@Test
	public void testDaleSeo() {
		for (int i = 0; i < this.exps.length; i++) {
			System.out.println("##############################################");
			int count = Hw4.countSolutionsDaleSeo(this.exps[i], this.results[i]);
			assertEquals(this.counts[i], count);
		}
	}
}