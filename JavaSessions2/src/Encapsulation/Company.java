package Encapsulation;
/**
 * warping variables with method is encapsulation
 * @author Dell
 *
 */
public class Company {

	String name;
	int totEmp;
	String ceo;
	private String policy;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotEmp() {
		return totEmp;
	}

	public void setTotEmp(int totEmp) {
		this.totEmp = totEmp;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

}
