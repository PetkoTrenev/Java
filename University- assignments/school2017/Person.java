
package school2017;


public class Person {

	private String name;
	private String EGN;
	
	public Person(String name, String EGN){
		this.name =  name;
		this.EGN = EGN;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setEGN(String EGN){
		this.EGN = EGN;
	}
	
	public String getEGN(){
		return EGN;
	}

}
