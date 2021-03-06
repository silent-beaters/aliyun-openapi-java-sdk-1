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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsBatchCheckMachineHealthRequest extends RpcAcsRequest<OpsBatchCheckMachineHealthResponse> {
	   

	private String regionIds;

	private String machineIds;

	private String ncIps;

	private String token;

	private String checkItems;

	private String auditParamStr;
	public OpsBatchCheckMachineHealthRequest() {
		super("Ecsops", "2016-04-01", "OpsBatchCheckMachineHealth", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(String regionIds) {
		this.regionIds = regionIds;
		if(regionIds != null){
			putQueryParameter("RegionIds", regionIds);
		}
	}

	public String getMachineIds() {
		return this.machineIds;
	}

	public void setMachineIds(String machineIds) {
		this.machineIds = machineIds;
		if(machineIds != null){
			putQueryParameter("MachineIds", machineIds);
		}
	}

	public String getNcIps() {
		return this.ncIps;
	}

	public void setNcIps(String ncIps) {
		this.ncIps = ncIps;
		if(ncIps != null){
			putQueryParameter("NcIps", ncIps);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getCheckItems() {
		return this.checkItems;
	}

	public void setCheckItems(String checkItems) {
		this.checkItems = checkItems;
		if(checkItems != null){
			putQueryParameter("CheckItems", checkItems);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsBatchCheckMachineHealthResponse> getResponseClass() {
		return OpsBatchCheckMachineHealthResponse.class;
	}

}
