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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentResourceConfigRequest extends RpcAcsRequest<ListEnvironmentResourceConfigResponse> {
	   

	private String instanceId;

	private String currentOrgId;

	private Long envId;

	private String cloudServiceName;
	public ListEnvironmentResourceConfigRequest() {
		super("Workbench-ide", "2021-01-21", "ListEnvironmentResourceConfig");
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getCloudServiceName() {
		return this.cloudServiceName;
	}

	public void setCloudServiceName(String cloudServiceName) {
		this.cloudServiceName = cloudServiceName;
		if(cloudServiceName != null){
			putQueryParameter("CloudServiceName", cloudServiceName);
		}
	}

	@Override
	public Class<ListEnvironmentResourceConfigResponse> getResponseClass() {
		return ListEnvironmentResourceConfigResponse.class;
	}

}
