package com.denglitong.organizationservicenew.repository;

import com.denglitong.organizationservicenew.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author litong.deng@foxmail.com
 * @date 2021/10/24
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, String> {

    Organization findByOrganizationId(String organizationId);
}
