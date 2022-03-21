package employee;

import java.time.LocalDate;

public interface EmployeeDTOBuilder {

	EmployeeDTOBuilder withFirstName(String firstName);

	EmployeeDTOBuilder withLastName(String lastName);

	EmployeeDTOBuilder withDateOfBirth(LocalDate date);

	EmployeeDTOBuilder withCompany(Company company);

	EmployeeDTO build();

	EmployeeDTO getEmployeeDTO();

}
