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
public class SearchService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchService.class);

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Company> searchCompaniesByName(final String searchKey) throws SearchServiceException {
        List<Company> companySearchResult = companyDao.searchCompanyByName(searchKey);
        if (companySearchResult.size() == 0) {
            LOGGER.info(SearchServiceException.ERR_COMPANY_NOT_FOUND);
            throw new SearchServiceException(SearchServiceException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companySearchResult;
        }
    }

    public List<Employee> searchEmployeeByLastName(final String searchKey) throws SearchServiceException {
        List<Employee> employeeSearchResult = employeeDao.searchEmployeeByLastName(searchKey);
        if (employeeSearchResult.size() == 0) {
            LOGGER.info(SearchServiceException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchServiceException(SearchServiceException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return employeeSearchResult;
        }
    }
}
