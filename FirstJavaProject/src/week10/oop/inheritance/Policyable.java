package week10.oop.inheritance;

import java.util.Date;

public interface Policyable {
	public void createPolicy();
	default public Date getEndDate() {
		return new Date();
	}
}
