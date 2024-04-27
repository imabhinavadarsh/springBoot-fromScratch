package com.abhinavproject.crudspringboot.service;

import com.abhinavproject.crudspringboot.entity.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(Long Id);
    public List<CloudVendor> getAllCloudVendors();
    public CloudVendor getCloudVendor(Long Id);
}
