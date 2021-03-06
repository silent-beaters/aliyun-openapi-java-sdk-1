/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetClriskTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClriskTemplateResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean currentOwner;

	private String gmtCreate;

	private String gmtModified;

	private String memo;

	private Long modelNumber;

	private Long productId;

	private String productName;

	private Long ruleNumber;

	private String templateCode;

	private String templateName;

	private String triggerDelay;

	private String triggerMode;

	private String version;

	private Boolean isMultiplex;

	private String checkMethod;

	private String cronExpression;

	private String dayType;

	private String alertDelayTime;

	private String fileAttributeMappings;

	private String modelDefineId;

	private String firstModelLoaderId;

	private String secondModelLoaderId;

	private List<DataNodesItem> dataNodes;

	private List<OwnersItem> owners;

	private LastModifier lastModifier;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Boolean getCurrentOwner() {
		return this.currentOwner;
	}

	public void setCurrentOwner(Boolean currentOwner) {
		this.currentOwner = currentOwner;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Long getModelNumber() {
		return this.modelNumber;
	}

	public void setModelNumber(Long modelNumber) {
		this.modelNumber = modelNumber;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getRuleNumber() {
		return this.ruleNumber;
	}

	public void setRuleNumber(Long ruleNumber) {
		this.ruleNumber = ruleNumber;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTriggerDelay() {
		return this.triggerDelay;
	}

	public void setTriggerDelay(String triggerDelay) {
		this.triggerDelay = triggerDelay;
	}

	public String getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Boolean getIsMultiplex() {
		return this.isMultiplex;
	}

	public void setIsMultiplex(Boolean isMultiplex) {
		this.isMultiplex = isMultiplex;
	}

	public String getCheckMethod() {
		return this.checkMethod;
	}

	public void setCheckMethod(String checkMethod) {
		this.checkMethod = checkMethod;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getDayType() {
		return this.dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getAlertDelayTime() {
		return this.alertDelayTime;
	}

	public void setAlertDelayTime(String alertDelayTime) {
		this.alertDelayTime = alertDelayTime;
	}

	public String getFileAttributeMappings() {
		return this.fileAttributeMappings;
	}

	public void setFileAttributeMappings(String fileAttributeMappings) {
		this.fileAttributeMappings = fileAttributeMappings;
	}

	public String getModelDefineId() {
		return this.modelDefineId;
	}

	public void setModelDefineId(String modelDefineId) {
		this.modelDefineId = modelDefineId;
	}

	public String getFirstModelLoaderId() {
		return this.firstModelLoaderId;
	}

	public void setFirstModelLoaderId(String firstModelLoaderId) {
		this.firstModelLoaderId = firstModelLoaderId;
	}

	public String getSecondModelLoaderId() {
		return this.secondModelLoaderId;
	}

	public void setSecondModelLoaderId(String secondModelLoaderId) {
		this.secondModelLoaderId = secondModelLoaderId;
	}

	public List<DataNodesItem> getDataNodes() {
		return this.dataNodes;
	}

	public void setDataNodes(List<DataNodesItem> dataNodes) {
		this.dataNodes = dataNodes;
	}

	public List<OwnersItem> getOwners() {
		return this.owners;
	}

	public void setOwners(List<OwnersItem> owners) {
		this.owners = owners;
	}

	public LastModifier getLastModifier() {
		return this.lastModifier;
	}

	public void setLastModifier(LastModifier lastModifier) {
		this.lastModifier = lastModifier;
	}

	public static class DataNodesItem {

		private String description;

		private String id;

		private String name;

		private String nodeCode;

		private String odpsProject;

		private String tableAuthDescription;

		private String tableName;

		private String updateTime;

		private String updateUser;

		private String type;

		private String checkField;

		private String mappingField;

		private String aliasName;

		private String nodeType;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNodeCode() {
			return this.nodeCode;
		}

		public void setNodeCode(String nodeCode) {
			this.nodeCode = nodeCode;
		}

		public String getOdpsProject() {
			return this.odpsProject;
		}

		public void setOdpsProject(String odpsProject) {
			this.odpsProject = odpsProject;
		}

		public String getTableAuthDescription() {
			return this.tableAuthDescription;
		}

		public void setTableAuthDescription(String tableAuthDescription) {
			this.tableAuthDescription = tableAuthDescription;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getUpdateUser() {
			return this.updateUser;
		}

		public void setUpdateUser(String updateUser) {
			this.updateUser = updateUser;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCheckField() {
			return this.checkField;
		}

		public void setCheckField(String checkField) {
			this.checkField = checkField;
		}

		public String getMappingField() {
			return this.mappingField;
		}

		public void setMappingField(String mappingField) {
			this.mappingField = mappingField;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}
	}

	public static class OwnersItem {

		private String email;

		private String loginName;

		private String mobile;

		private String nickName;

		private String originId;

		private String type;

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getOriginId() {
			return this.originId;
		}

		public void setOriginId(String originId) {
			this.originId = originId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class LastModifier {

		private String email;

		private String loginName;

		private String mobile;

		private String nickName;

		private String originId;

		private String type;

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getOriginId() {
			return this.originId;
		}

		public void setOriginId(String originId) {
			this.originId = originId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public GetClriskTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetClriskTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
