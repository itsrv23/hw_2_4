package ru.itsrv23.hw_2_4.service;


import ru.itsrv23.hw_2_4.entity.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee deleteEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Integer findIdEmployee(String firstName, String lastName);
}
