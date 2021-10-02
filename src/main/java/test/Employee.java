package test;

public class Employee implements Comparable<Employee> {
	private String employeeId;
	private String name;
	private String mobileNumber;

	private Double salary;

	public Employee(String employeeId, String name, String mobileNumber, Double salary) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", mobileNumber=" + mobileNumber + ", salary="
				+ salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
		String compareId = employee.getEmployeeId();
		// for natural sorting order
		// return this.getEmployeeId().compareTo(compareId);

		// for reverse sorting order
		return compareId.compareTo(this.getEmployeeId());
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
	 * return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; if (employeeId == null) { if
	 * (other.employeeId != null) return false; } else if
	 * (!employeeId.equals(other.employeeId)) return false; return true; }
	 */
}
