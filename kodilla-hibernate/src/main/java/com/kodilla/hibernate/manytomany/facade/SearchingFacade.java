package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Employee> searchEmployeeByPartName(String employeePartName) {
        LOGGER.info("Searching for employee by his part name: " + employeePartName);
        List<Employee> employees = employeeDao.retrievedEmployeeByPartName(employeePartName);
        if (employees.size() > 0) {
            LOGGER.info(employees.size() + (employees.size() == 1 ? " employee has " : "employees have ") + "been found");
            for (Employee theEmployee : employees) {
                System.out.println("Employee = " + theEmployee.getFirstname() + theEmployee.getLastname());
            }
        } else {
            LOGGER.info(SearchingException.ERR_NO_EMPLOYEE);
        }
        return employees;
    }

    public List<Company> searchCompanyByPartName(String companyPartName) {
        LOGGER.info("Searching for commpany by it's part name: " + companyPartName);
        List<Company> companies = companyDao.retrieveCompanyByPartName(companyPartName);
        if (companies.size() > 0) {
            LOGGER.info(companies.size() + (companies.size() == 1 ? " company has " : "companies have ") + "been found");
            for (Company theCompany : companies) {
                System.out.println("Company = " + theCompany.getName());
            }
        } else {
            LOGGER.info(SearchingException.ERR_NO_COMPANY);
        }
        return companies;
    }

}
