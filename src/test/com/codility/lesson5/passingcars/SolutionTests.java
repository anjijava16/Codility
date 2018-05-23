package test.com.codility.lesson5.passingcars;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codility.lesson5.passingcars.Solution;

//https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/

public class SolutionTests {
	private Solution solution;
	
	@BeforeTest
	public void setUp() {
		solution = new Solution();
	}

	@DataProvider(name = "test1")
	public Object [][] createData1() {
		return new Object [][] {
			new Object [] {  new int [] {    0, 1, 0, 1, 1 }, 5 },
			new Object [] {  new int [] { 1, 0, 0, 1, 0, 1 }, 5 },
			new Object [] {  new int [] { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 }, 15 },
			new Object [] {  new int [] { 1, 1, 0, 1 }, 1 },
			
			//no passing cars
			new Object [] {  new int [] {       1 }, 0 },
			new Object [] {  new int [] {       0 }, 0 },
			new Object [] {  new int [] {    0, 0 }, 0 },
			new Object [] {  new int [] {    1, 1 }, 0 },
			new Object [] {  new int [] { 1, 1, 0 }, 0 },
			
		};
	}

	@Test(dataProvider = "test1")
	public void verifySolution(int [] pA, int pExpected) {		
		Assert.assertEquals(solution.solution(pA), pExpected);	
	}		
}
