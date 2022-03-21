package employee;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeWebDTOBuilder implements EmployeeDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String company;
	private EmployeeWebDTO dto;

	public EmployeeDTOBuilder withFirstName(String fName) {
		firstName = fName;
		return this;
	}

	public EmployeeDTOBuilder withLastName(String lName) {
		lastName = lName;
		return this;
	}

	public EmployeeDTOBuilder withDateOfBirth(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	public EmployeeDTOBuilder withCompany(Company company) {
		this.company = company.getName() + "\n " + company.getAddress() + "\n " + company.getCity() + "\n "
				+ company.getEmail() + "\n " + company.getPhoneNumber();
		return this;
	}

	public EmployeeDTO build() {
		dto = new EmployeeWebDTO(firstName + " " + lastName, company, age);
		return dto;
	}

	public EmployeeDTO getEmployeeDTO() {
		return dto;
	}

}
