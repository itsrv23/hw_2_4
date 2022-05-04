package ru.itsrv23.hw24.service;


import ru.itsrv23.hw24.entity.Employee;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName);
    Employee deleteEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Integer findIdEmployee(String firstName, String lastName);
}
