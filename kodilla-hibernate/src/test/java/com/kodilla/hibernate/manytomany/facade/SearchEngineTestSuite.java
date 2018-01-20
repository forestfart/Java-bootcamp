package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchEngineTestSuite {

    @Autowired
    private SearchService searchService;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void searchCompaniesByNameTest() throws SearchServiceException {

        // Given
        Company companyTesting = new Company("CompanyTesting...");

        // When
        companyDao.save(companyTesting);
        int foundCompanyId = companyTesting.getId();

        // Then
        Assert.assertNotEquals(0, searchService.searchCompaniesByName("%Testing...").size());

        // Clean-up
        companyDao.delete(foundCompanyId);

    }

    @Test
    public void searchEmployeesByNameTest() throws SearchServiceException {

        // Given
        Employee johnTesting = new Employee("John", "Testing...");


        // When
        employeeDao.save(johnTesting);
        int foundEmployeeID = johnTesting.getId();

        // Then
        Assert.assertNotEquals(0, searchService.searchEmployeeByLastName("%sting...").size());

        // Clean-up
        employeeDao.delete(foundEmployeeID);
    }
}
