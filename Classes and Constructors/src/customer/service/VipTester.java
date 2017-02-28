package customer.service;

public class VipTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VipCustomer tim = new VipCustomer();
		System.out.println(tim.getName());
		System.out.println(tim.getCreditLimit());
		System.out.println(tim.getEmail());
		
		System.out.println();
		
		VipCustomer martin = new VipCustomer("Martin", 200.0);
		System.out.println(martin.getName());
		System.out.println(martin.getCreditLimit());
		System.out.println(martin.getEmail());
		
		System.out.println();
		
		VipCustomer gosho = new VipCustomer("Gosho", 1000.0, "gosho3@email.com");
		System.out.println(gosho.getName());
		System.out.println(gosho.getCreditLimit());
		System.out.println(gosho.getEmail());
	}

}
