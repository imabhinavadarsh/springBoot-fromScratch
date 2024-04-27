package com.abhinavproject.crudspringboot.service.Impl;

import com.abhinavproject.crudspringboot.entity.CloudVendor;
import com.abhinavproject.crudspringboot.repository.CloudVendorRepository;
import com.abhinavproject.crudspringboot.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    private  CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(Long Id) {
        cloudVendorRepository.deleteById(Id);
        return  "Success";
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public CloudVendor getCloudVendor(Long Id) {
        return cloudVendorRepository.findById(Id).get();
    }


}
