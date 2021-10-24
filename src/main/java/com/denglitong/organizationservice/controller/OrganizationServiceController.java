package com.denglitong.organizationservice.controller;

import com.denglitong.organizationservice.model.Organization;
import com.denglitong.organizationservice.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/10/24
 */
@RestController
@RequestMapping(value = "/v1/organizations")
public class OrganizationServiceController {

    private OrganizationService orgService;

    @Autowired
    public void setOrgService(OrganizationService orgService) {
        this.orgService = orgService;
    }

    @PostMapping("/")
    public void saveOrganization(@RequestBody Organization org) {
        orgService.saveOrg(org);
    }

    @GetMapping("/{organizationId}")
    public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
        return orgService.getOrg(organizationId);
    }

    @PutMapping("/{organizationId}")
    public void updateOrganization(@PathVariable("organizationId") String organizationId,
                                   @RequestBody Organization org) {
        orgService.updateOrg(org);
    }

    @DeleteMapping("/{organizationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization(@PathVariable("organizationId") String organizationId) {
        orgService.deleteOrg(organizationId);
    }
}
