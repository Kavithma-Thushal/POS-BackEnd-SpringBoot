package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomDTO;
import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author : Kavithma Thushal
 * @project : SpringBoot-POS
 **/
public interface CustomerService {

    void saveCustomer(@RequestBody CustomerDTO dto);

    CustomerDTO searchCusId(String id);

    void updateCustomer(@RequestBody CustomerDTO dto);

    void deleteCustomer(@PathVariable("id") String id);

    ArrayList<CustomerDTO> loadAllCustomer();

    @ResponseBody
    CustomDTO customerIdGenerate();

    @ResponseBody
    CustomDTO getSumCustomer();
}