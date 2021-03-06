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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetVaultCredentialRequest extends RpcAcsRequest<GetVaultCredentialResponse> {
	   

	private String credentialType;

	private String vaultId;

	private Long expireInSeconds;
	public GetVaultCredentialRequest() {
		super("hbr", "2017-09-08", "GetVaultCredential", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCredentialType() {
		return this.credentialType;
	}

	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
		if(credentialType != null){
			putQueryParameter("CredentialType", credentialType);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public Long getExpireInSeconds() {
		return this.expireInSeconds;
	}

	public void setExpireInSeconds(Long expireInSeconds) {
		this.expireInSeconds = expireInSeconds;
		if(expireInSeconds != null){
			putQueryParameter("ExpireInSeconds", expireInSeconds.toString());
		}
	}

	@Override
	public Class<GetVaultCredentialResponse> getResponseClass() {
		return GetVaultCredentialResponse.class;
	}

}
