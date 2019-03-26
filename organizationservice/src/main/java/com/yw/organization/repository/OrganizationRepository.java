package com.yw.organization.repository;

import com.yw.organization.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String> {
    //public Organization findById(String organizationId);
}
