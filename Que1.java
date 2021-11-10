package Annotations;

@interface Test{
	
	String test_case();
	
}

@Test(test_case = "1")
class Example{
	//@Test is implying only one method "test_case"//
}

@Test(test_case = "2")
class Example2{
	//Again @Test is implying only one method "test_case"//
}