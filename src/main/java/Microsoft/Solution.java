package Microsoft;

public class Solution {
	
	public Solution(){
		System.out.println("This class is not null...");
	}
	public int isDiagonal(int[][] arrayOfArray, int nthLengthOfArray){
		
		int firstDiagonal  = 0;
		int secondDiagonal = 0;
		
		for (int i  = 0; i < nthLengthOfArray; i++){
			for (int j = 0; j < nthLengthOfArray; j++) {
			
//				find sum of first diagonal.
				if (i == j)
					firstDiagonal += arrayOfArray[i][j];
				
//				find sum of second diagonal
				if (i == nthLengthOfArray - j - 1)
					secondDiagonal += arrayOfArray[i][j];
			}
		}
		
//		absolute difference of sum across the diagonal
		return Math.abs(firstDiagonal - secondDiagonal);
	}
}



//
//1: api/v1/users
//
//		reasons: When designing a REST API, you should not use verbs in the endpoint paths.
//		The endpoints should use nouns, signifying what each of them does.
//		This is because HTTP methods such as GET, POST, PUT, PATCH, and
//		DELETE are already in verb form for performing basic CRUD (Create, Read, Update, Delete) operations.
//		GET, POST, PUT, PATCH, and DELETE are the commonest HTTP verbs. There are also others such as COPY,
//		PURGE, LINK, UNLINK, and so on.
//		So, for example, an endpoint should not look like this:
//		https://mysite.com/postUser or https://api/v1/userSignUp
//		Instead, it should be something like this: https://api/v1/users
//
//		In short, you should let the HTTP verbs handle what the endpoints do. So GET would retrieve data,
//		POST will create data, PUT will update data, and DELETE will get rid of the data.
//
//		2. POST/PUT/PATCH
//
//		reasons: If you have an endpoint like https://api/v1/post/123, it might be okay for deleting a post
//		with a DELETE request or updating a post with PUT or PATCH request, but it doesn’t tell the
//		user that there could be some other posts in the collection. This is why your collections should
//		use plural nouns.
//		So, instead of https://api/v1/post/123, it should be https://api/v1/users/123.
//
//
//		3. http://localhost:8080/api/v1/?registrationDate=2013?name=byteworks?id=123
//
//		reasons: Annotation which indicates that a method parameter should be bound to a web request parameter.
//		Supported for annotated handler methods in Servlet and Portlet environments.
//
//
//		4. I will make use binary search this iterative procedure keeps track of the search boundaries with the two variables
//
//
//		5. Authorization Server is an Actor within OAuth 2.0 and OpenID Connect which typically provides the Security Token
//		Service, the server that issues tokens.
//
//		6. Resource Server is an Actor within OAuth 2.0 and OpenID Connect, service that is the
//		Policy Enforcement Point and performs Access Control for the Protected Resource of the Resource Owner to the OAuth Client.
//
//		7. Oauth 2.0 is an authorization framework that enables applications to obtain limited access to user accounts on an HTTP service.
//
//		Two types of oauth2.0 framework
//		- Client credentials grant.
//		- Refresh token grant.
//
//		8. I was recently involved in a contractual development project helping document and testing every endpoints in an organization.
//		The project had a definite timescale for completion, but I ran into problem half way through the project due to the fact some
//		models endpoints were not working as it should. There was no option to push back the project deadline and I fully understood
//		how important it was to get everything completed so the organization could move forward. I analyzed the task and project once
//		more and I decided to outsource the project areas. I chose a top-rated engineer and I provided a clear definitive brief of what
//		needed to be done and by what time frame. By using my initiative, by remaining clam and by focusing purely on completing the
//		project to a high standard, I Was able to get everything finished and submitted to the IT manager just some hours before the
//		deadline.
//
//		9. The basic idea behind the circuit breaker is very simple. You wrap a protected function call in a circuit breaker object,
//		which monitors for failures. Once the failures reach a certain threshold, the circuit breaker trips, and all further calls
//		to the circuit breaker return with an error, without the protected call being made at all. Usually you'll also want some
//		kind of monitor alert if the circuit breaker trips.
//
//
//		10.
//
//public class Solution {
//
//	public Solution(){
//		System.out.println("This class is not null...");
//	}
//	public int isDiagonal(int[][] arrayOfArray, int nthLengthOfArray){
//
//		int firstDiagonal  = 0;
//		int secondDiagonal = 0;
//
//		for (int i  = 0; i < nthLengthOfArray; i++){
//			for (int j = 0; j < nthLengthOfArray; j++) {
//
////				find sum of first diagonal.
//				if (i == j)
//					firstDiagonal += arrayOfArray[i][j];
//
////				find sum of second diagonal
//				if (i == nthLengthOfArray - j - 1)
//					secondDiagonal += arrayOfArray[i][j];
//			}
//		}
//
////		absolute difference of sum across the diagonal
//		return Math.abs(firstDiagonal - secondDiagonal);
//	}
//}
//
//
//public class SolutionTest {
//
//
//	private Solution solution;
//
//	@BeforeEach
//	public void setSolution(){
//		solution = new Solution();
//	}
//
//	@Test
//	public void test_diagonalDifferenceClassExist(){
//		solution = new Solution();
//		Assertions.assertNotNull(solution, "Class doesn't exist");
//	}
//
//	@Test
//	public void test_diagonalDifference(){
//		int y = solution.isDiagonal(new int[][]{{11, 2, 4}, {4 , 5, 6}, {10, 8, -12}}, 3);
//		Assertions.assertEquals(15, y);
//
//	}
//
//	@Test
//	public void test_aColumnDiagonalDifference(){
//		int x = solution.isDiagonal(new int[][]{{10, 3, 5}}, 1);
//		Assertions.assertEquals(0, x);
//	}
//
//	@Test
//	public void test_TwoColumnDiagonalDifference(){
//		int x = solution.isDiagonal(new int[][]{{10, 3, 5}, {5, 34, 4}}, 2);
//		Assertions.assertEquals(36, x);
//	}
//
//	@Test
//	public void test_threeColumnDialogDifference(){
//		int x = solution.isDiagonal(new int[][]{{10, 3, 5}, {-12, 4, 6}, {33,54,3}}, 3);
//		Assertions.assertEquals(25, x);
//	}
//}