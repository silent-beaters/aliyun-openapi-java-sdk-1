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
public class SetAppEnvConfigRequest extends RpcAcsRequest<SetAppEnvConfigResponse> {
	   

	private String deployStage;

	private String envConfigList;

	private Long appId;

	private String currentOrgId;
	public SetAppEnvConfigRequest() {
		super("Workbench-ide", "2021-01-21", "SetAppEnvConfig");
		setMethod(MethodType.POST);
	}

	public String getDeployStage() {
		return this.deployStage;
	}

	public void setDeployStage(String deployStage) {
		this.deployStage = deployStage;
		if(deployStage != null){
			putQueryParameter("DeployStage", deployStage);
		}
	}

	public String getEnvConfigList() {
		return this.envConfigList;
	}

	public void setEnvConfigList(String envConfigList) {
		this.envConfigList = envConfigList;
		if(envConfigList != null){
			putQueryParameter("EnvConfigList", envConfigList);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
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

	@Override
	public Class<SetAppEnvConfigResponse> getResponseClass() {
		return SetAppEnvConfigResponse.class;
	}

}
