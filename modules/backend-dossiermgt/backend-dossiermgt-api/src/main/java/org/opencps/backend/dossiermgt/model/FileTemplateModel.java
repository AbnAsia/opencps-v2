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

package org.opencps.backend.dossiermgt.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FileTemplate service. Represents a row in the &quot;opencps_filetemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.opencps.backend.dossiermgt.model.impl.FileTemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.opencps.backend.dossiermgt.model.impl.FileTemplateImpl}.
 * </p>
 *
 * @author huymq
 * @see FileTemplate
 * @see org.opencps.backend.dossiermgt.model.impl.FileTemplateImpl
 * @see org.opencps.backend.dossiermgt.model.impl.FileTemplateModelImpl
 * @generated
 */
@ProviderType
public interface FileTemplateModel extends BaseModel<FileTemplate>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a file template model instance should use the {@link FileTemplate} interface instead.
	 */

	/**
	 * Returns the primary key of this file template.
	 *
	 * @return the primary key of this file template
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this file template.
	 *
	 * @param primaryKey the primary key of this file template
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this file template.
	 *
	 * @return the uuid of this file template
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this file template.
	 *
	 * @param uuid the uuid of this file template
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the file template ID of this file template.
	 *
	 * @return the file template ID of this file template
	 */
	public long getFileTemplateId();

	/**
	 * Sets the file template ID of this file template.
	 *
	 * @param fileTemplateId the file template ID of this file template
	 */
	public void setFileTemplateId(long fileTemplateId);

	/**
	 * Returns the group ID of this file template.
	 *
	 * @return the group ID of this file template
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this file template.
	 *
	 * @param groupId the group ID of this file template
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this file template.
	 *
	 * @return the company ID of this file template
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this file template.
	 *
	 * @param companyId the company ID of this file template
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this file template.
	 *
	 * @return the user ID of this file template
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this file template.
	 *
	 * @param userId the user ID of this file template
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this file template.
	 *
	 * @return the user uuid of this file template
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this file template.
	 *
	 * @param userUuid the user uuid of this file template
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this file template.
	 *
	 * @return the user name of this file template
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this file template.
	 *
	 * @param userName the user name of this file template
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this file template.
	 *
	 * @return the create date of this file template
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this file template.
	 *
	 * @param createDate the create date of this file template
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this file template.
	 *
	 * @return the modified date of this file template
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this file template.
	 *
	 * @param modifiedDate the modified date of this file template
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the file name of this file template.
	 *
	 * @return the file name of this file template
	 */
	@AutoEscape
	public String getFileName();

	/**
	 * Sets the file name of this file template.
	 *
	 * @param fileName the file name of this file template
	 */
	public void setFileName(String fileName);

	/**
	 * Returns the file no of this file template.
	 *
	 * @return the file no of this file template
	 */
	@AutoEscape
	public String getFileNo();

	/**
	 * Sets the file no of this file template.
	 *
	 * @param fileNo the file no of this file template
	 */
	public void setFileNo(String fileNo);

	/**
	 * Returns the file entry ID of this file template.
	 *
	 * @return the file entry ID of this file template
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this file template.
	 *
	 * @param fileEntryId the file entry ID of this file template
	 */
	public void setFileEntryId(long fileEntryId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(FileTemplate fileTemplate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<FileTemplate> toCacheModel();

	@Override
	public FileTemplate toEscapedModel();

	@Override
	public FileTemplate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}