/**
 * 
 */
package com.project.spaceHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spaceHub.DTO.AdminDTO;

/**
 * @author gbemisola
 *
 */
@Repository
public interface AdminJpaRepository extends JpaRepository <AdminDTO, String> {
	
	
	AdminDTO findByUsername(String username);
}


