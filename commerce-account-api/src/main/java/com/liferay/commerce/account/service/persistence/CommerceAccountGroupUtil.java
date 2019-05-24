/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.account.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.account.model.CommerceAccountGroup;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the commerce account group service. This utility wraps {@link com.liferay.commerce.account.service.persistence.impl.CommerceAccountGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marco Leo
 * @see CommerceAccountGroupPersistence
 * @see com.liferay.commerce.account.service.persistence.impl.CommerceAccountGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class CommerceAccountGroupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CommerceAccountGroup commerceAccountGroup) {
		getPersistence().clearCache(commerceAccountGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CommerceAccountGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CommerceAccountGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CommerceAccountGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CommerceAccountGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CommerceAccountGroup update(
		CommerceAccountGroup commerceAccountGroup) {
		return getPersistence().update(commerceAccountGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CommerceAccountGroup update(
		CommerceAccountGroup commerceAccountGroup, ServiceContext serviceContext) {
		return getPersistence().update(commerceAccountGroup, serviceContext);
	}

	/**
	* Returns all the commerce account groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching commerce account groups
	*/
	public static List<CommerceAccountGroup> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the commerce account groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @return the range of matching commerce account groups
	*/
	public static List<CommerceAccountGroup> findByCompanyId(long companyId,
		int start, int end) {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the commerce account groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce account groups
	*/
	public static List<CommerceAccountGroup> findByCompanyId(long companyId,
		int start, int end,
		OrderByComparator<CommerceAccountGroup> orderByComparator) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce account groups where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching commerce account groups
	*/
	public static List<CommerceAccountGroup> findByCompanyId(long companyId,
		int start, int end,
		OrderByComparator<CommerceAccountGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first commerce account group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce account group
	* @throws NoSuchAccountGroupException if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup findByCompanyId_First(long companyId,
		OrderByComparator<CommerceAccountGroup> orderByComparator)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first commerce account group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching commerce account group, or <code>null</code> if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup fetchByCompanyId_First(long companyId,
		OrderByComparator<CommerceAccountGroup> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last commerce account group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce account group
	* @throws NoSuchAccountGroupException if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup findByCompanyId_Last(long companyId,
		OrderByComparator<CommerceAccountGroup> orderByComparator)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last commerce account group in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching commerce account group, or <code>null</code> if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup fetchByCompanyId_Last(long companyId,
		OrderByComparator<CommerceAccountGroup> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the commerce account groups before and after the current commerce account group in the ordered set where companyId = &#63;.
	*
	* @param commerceAccountGroupId the primary key of the current commerce account group
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce account group
	* @throws NoSuchAccountGroupException if a commerce account group with the primary key could not be found
	*/
	public static CommerceAccountGroup[] findByCompanyId_PrevAndNext(
		long commerceAccountGroupId, long companyId,
		OrderByComparator<CommerceAccountGroup> orderByComparator)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(commerceAccountGroupId,
			companyId, orderByComparator);
	}

	/**
	* Returns all the commerce account groups that the user has permission to view where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching commerce account groups that the user has permission to view
	*/
	public static List<CommerceAccountGroup> filterFindByCompanyId(
		long companyId) {
		return getPersistence().filterFindByCompanyId(companyId);
	}

	/**
	* Returns a range of all the commerce account groups that the user has permission to view where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @return the range of matching commerce account groups that the user has permission to view
	*/
	public static List<CommerceAccountGroup> filterFindByCompanyId(
		long companyId, int start, int end) {
		return getPersistence().filterFindByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the commerce account groups that the user has permissions to view where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching commerce account groups that the user has permission to view
	*/
	public static List<CommerceAccountGroup> filterFindByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<CommerceAccountGroup> orderByComparator) {
		return getPersistence()
				   .filterFindByCompanyId(companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the commerce account groups before and after the current commerce account group in the ordered set of commerce account groups that the user has permission to view where companyId = &#63;.
	*
	* @param commerceAccountGroupId the primary key of the current commerce account group
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next commerce account group
	* @throws NoSuchAccountGroupException if a commerce account group with the primary key could not be found
	*/
	public static CommerceAccountGroup[] filterFindByCompanyId_PrevAndNext(
		long commerceAccountGroupId, long companyId,
		OrderByComparator<CommerceAccountGroup> orderByComparator)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence()
				   .filterFindByCompanyId_PrevAndNext(commerceAccountGroupId,
			companyId, orderByComparator);
	}

	/**
	* Removes all the commerce account groups where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of commerce account groups where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching commerce account groups
	*/
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns the number of commerce account groups that the user has permission to view where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching commerce account groups that the user has permission to view
	*/
	public static int filterCountByCompanyId(long companyId) {
		return getPersistence().filterCountByCompanyId(companyId);
	}

	/**
	* Returns the commerce account group where companyId = &#63; and externalReferenceCode = &#63; or throws a {@link NoSuchAccountGroupException} if it could not be found.
	*
	* @param companyId the company ID
	* @param externalReferenceCode the external reference code
	* @return the matching commerce account group
	* @throws NoSuchAccountGroupException if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup findByC_ERC(long companyId,
		String externalReferenceCode)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence().findByC_ERC(companyId, externalReferenceCode);
	}

	/**
	* Returns the commerce account group where companyId = &#63; and externalReferenceCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param externalReferenceCode the external reference code
	* @return the matching commerce account group, or <code>null</code> if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup fetchByC_ERC(long companyId,
		String externalReferenceCode) {
		return getPersistence().fetchByC_ERC(companyId, externalReferenceCode);
	}

	/**
	* Returns the commerce account group where companyId = &#63; and externalReferenceCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param externalReferenceCode the external reference code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching commerce account group, or <code>null</code> if a matching commerce account group could not be found
	*/
	public static CommerceAccountGroup fetchByC_ERC(long companyId,
		String externalReferenceCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_ERC(companyId, externalReferenceCode,
			retrieveFromCache);
	}

	/**
	* Removes the commerce account group where companyId = &#63; and externalReferenceCode = &#63; from the database.
	*
	* @param companyId the company ID
	* @param externalReferenceCode the external reference code
	* @return the commerce account group that was removed
	*/
	public static CommerceAccountGroup removeByC_ERC(long companyId,
		String externalReferenceCode)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence().removeByC_ERC(companyId, externalReferenceCode);
	}

	/**
	* Returns the number of commerce account groups where companyId = &#63; and externalReferenceCode = &#63;.
	*
	* @param companyId the company ID
	* @param externalReferenceCode the external reference code
	* @return the number of matching commerce account groups
	*/
	public static int countByC_ERC(long companyId, String externalReferenceCode) {
		return getPersistence().countByC_ERC(companyId, externalReferenceCode);
	}

	/**
	* Caches the commerce account group in the entity cache if it is enabled.
	*
	* @param commerceAccountGroup the commerce account group
	*/
	public static void cacheResult(CommerceAccountGroup commerceAccountGroup) {
		getPersistence().cacheResult(commerceAccountGroup);
	}

	/**
	* Caches the commerce account groups in the entity cache if it is enabled.
	*
	* @param commerceAccountGroups the commerce account groups
	*/
	public static void cacheResult(
		List<CommerceAccountGroup> commerceAccountGroups) {
		getPersistence().cacheResult(commerceAccountGroups);
	}

	/**
	* Creates a new commerce account group with the primary key. Does not add the commerce account group to the database.
	*
	* @param commerceAccountGroupId the primary key for the new commerce account group
	* @return the new commerce account group
	*/
	public static CommerceAccountGroup create(long commerceAccountGroupId) {
		return getPersistence().create(commerceAccountGroupId);
	}

	/**
	* Removes the commerce account group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commerceAccountGroupId the primary key of the commerce account group
	* @return the commerce account group that was removed
	* @throws NoSuchAccountGroupException if a commerce account group with the primary key could not be found
	*/
	public static CommerceAccountGroup remove(long commerceAccountGroupId)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence().remove(commerceAccountGroupId);
	}

	public static CommerceAccountGroup updateImpl(
		CommerceAccountGroup commerceAccountGroup) {
		return getPersistence().updateImpl(commerceAccountGroup);
	}

	/**
	* Returns the commerce account group with the primary key or throws a {@link NoSuchAccountGroupException} if it could not be found.
	*
	* @param commerceAccountGroupId the primary key of the commerce account group
	* @return the commerce account group
	* @throws NoSuchAccountGroupException if a commerce account group with the primary key could not be found
	*/
	public static CommerceAccountGroup findByPrimaryKey(
		long commerceAccountGroupId)
		throws com.liferay.commerce.account.exception.NoSuchAccountGroupException {
		return getPersistence().findByPrimaryKey(commerceAccountGroupId);
	}

	/**
	* Returns the commerce account group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param commerceAccountGroupId the primary key of the commerce account group
	* @return the commerce account group, or <code>null</code> if a commerce account group with the primary key could not be found
	*/
	public static CommerceAccountGroup fetchByPrimaryKey(
		long commerceAccountGroupId) {
		return getPersistence().fetchByPrimaryKey(commerceAccountGroupId);
	}

	public static java.util.Map<java.io.Serializable, CommerceAccountGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the commerce account groups.
	*
	* @return the commerce account groups
	*/
	public static List<CommerceAccountGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the commerce account groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @return the range of commerce account groups
	*/
	public static List<CommerceAccountGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the commerce account groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of commerce account groups
	*/
	public static List<CommerceAccountGroup> findAll(int start, int end,
		OrderByComparator<CommerceAccountGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the commerce account groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CommerceAccountGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of commerce account groups
	* @param end the upper bound of the range of commerce account groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of commerce account groups
	*/
	public static List<CommerceAccountGroup> findAll(int start, int end,
		OrderByComparator<CommerceAccountGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the commerce account groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of commerce account groups.
	*
	* @return the number of commerce account groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CommerceAccountGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CommerceAccountGroupPersistence, CommerceAccountGroupPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CommerceAccountGroupPersistence.class);

		ServiceTracker<CommerceAccountGroupPersistence, CommerceAccountGroupPersistence> serviceTracker =
			new ServiceTracker<CommerceAccountGroupPersistence, CommerceAccountGroupPersistence>(bundle.getBundleContext(),
				CommerceAccountGroupPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}