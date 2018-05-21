package test.com.codility.lesson1.binarygap;

import org.testng.Assert;
import org.testng.annotations.*;

import com.codility.lesson1.binarygap.Solution;

//https://app.codility.com/programmers/lessons/1-iterations/
public class SolutionTests {
	private Solution binaryGapSolution;
	
	@BeforeTest
	public void setUp() {
		binaryGapSolution = new Solution();
	}
	
	//http://acc6.its.brooklyn.cuny.edu/~gurwitz/core5/nav2tool.html
	//converting integer to binary
	
	@DataProvider(name = "test1")
	public Object [][] createData1() {
		return new Object [][] {
			new Object [] {    0, 0 },
			new Object [] {    9, 2 },
			new Object [] {   15, 0 },
			new Object [] {   32, 0 },
			new Object [] {  529, 4 },
			new Object [] { 1041, 5 },
			new Object [] { 65536, 0 },
			new Object [] { 65537, 15 },
			new Object [] { 100000, 4 }, 
			new Object [] { 2147483, 5 },
			new Object [] { 2147483637, 1 }, //max - 10
			new Object [] { 2147483646, 0 }, //max - 1
			new Object [] { 2147483647, 0 } //max
		};
	}
	
	@Test(dataProvider = "test1")
	public void veritySolution(int pInput, int expectedBinaryGap) {
		Assert.assertEquals(binaryGapSolution.solution(pInput), expectedBinaryGap);
	}
}