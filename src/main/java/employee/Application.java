package employee;

import java.time.LocalDate;

public class Application {
	
	public static void main(String[] args) {
		Employee employee = createEmployee();
		EmployeeDTOBuilder builder = new EmployeeWebDTOBuilder();
		EmployeeDTO dto = directBuild(builder, employee);
		System.out.println(dto);
	}

	private static EmployeeDTO directBuild(EmployeeDTOBuilder builder, Employee employee) {
		return builder.withFirstName(employee.getFirstName()).withLastName(employee.getLastName())
				.withDateOfBirth(employee.getDateOfBirth()).withCompany(employee.getCompany()).build();
	}

	public static Employee createEmployee() {
		Employee employee = new Employee();
		employee.setDateOfBirth(LocalDate.of(1988, 05, 11));
		employee.setFirstName("Suzana");
		employee.setLastName("Stojkovic");
		Company company = new Company();
		company.setName("IT COMPANY");
		company.setAddress("Street 1");
		company.setEmail("company@gmail.com");
		company.setPhoneNumber(123123);
		company.setCity("Novi Sad");
		employee.setCompany(company);
		return employee;
	}


}
