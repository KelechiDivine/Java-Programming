package chapterFive.examples;

public class AutoPolicyTest {
	
	public static void main(String[] args) {
		
		AutoPolicy autoPolicy = new AutoPolicy(111111,
				"Toyota Camry", "NJ");
		
		AutoPolicy secondAutoPolicy = new AutoPolicy(213444,
				"Ford Fusion", "ME");
//
		policyInNoFaultState(autoPolicy);
		policyInNoFaultState(secondAutoPolicy);
	}
	
	
	public static void policyInNoFaultState(AutoPolicy policy) {
		
		System.out.println("The auto policy: ");
		
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
		
		policy.getAccountNumber(), policy.getMakeAndModel(),
				policy.getState(), (policy.isNoFaultState() ? "is":
						"is not"));
	}
}