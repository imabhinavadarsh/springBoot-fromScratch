package com.abhinavproject.crudspringboot.controller;

import com.abhinavproject.crudspringboot.entity.CloudVendor;
import com.abhinavproject.crudspringboot.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/vendor")
@RestController
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;

    }

    @GetMapping("{Id}")
    public CloudVendor getCloudVendor(@PathVariable("Id") Long Id) {
        return cloudVendorService.getCloudVendor(Id);
    }

    @GetMapping("/allVendors")
    public List<CloudVendor> allCloudVendor(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping("/add")
    public String  createCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created";
    }

    @PutMapping("/update")
    public String updateCoudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "CloudVendor updated";
    }

    @DeleteMapping("/delete/{Id}")
    public String deleteCloudVendor(@PathVariable("Id") Long Id) {
        cloudVendorService.deleteCloudVendor(Id);
        return "Deleted";
    }
}

