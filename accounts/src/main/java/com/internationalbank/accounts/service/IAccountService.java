package com.internationalbank.accounts.service;

import com.internationalbank.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber
     * @return Account detail based on given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);


    /**
     *
     * @param customerDto - CustomerDto object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
