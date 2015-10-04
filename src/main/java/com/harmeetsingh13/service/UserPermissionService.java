/**
 * 
 */
package com.harmeetsingh13.service;

import java.util.List;

import com.harmeetsingh13.entities.security.UserPermission;

/**
 * @author Harmeet Singh(Taara)
 * @version 1.0
 */
public interface UserPermissionService {

	public void saveBulkUsersPermissions(List<UserPermission> permissions);
}