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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayFileShareRequest extends RpcAcsRequest<UpdateGatewayFileShareResponse> {
	   

	private String clientSideCmk;

	private Boolean inPlace;

	private Boolean browsable;

	private String readWriteUserList;

	private Integer pollingInterval;

	private String readWriteClientList;

	private Boolean bypassCacheRead;

	private Integer backendLimit;

	private String squash;

	private String readOnlyClientList;

	private String serverSideCmk;

	private String securityToken;

	private Long kmsRotatePeriod;

	private Boolean remoteSyncDownload;

	private Boolean serverSideEncryption;

	private Boolean nfsV4Optimization;

	private Boolean accessBasedEnumeration;

	private String gatewayId;

	private Boolean ignoreDelete;

	private Long lagPeriod;

	private Boolean directIO;

	private Boolean clientSideEncryption;

	private String cacheMode;

	private Integer downloadLimit;

	private String readOnlyUserList;

	private Boolean fastReclaim;

	private Boolean windowsAcl;

	private String name;

	private String indexId;

	private Boolean transferAcceleration;

	private Boolean remoteSync;

	private Integer frontendLimit;
	public UpdateGatewayFileShareRequest() {
		super("sgw", "2018-05-11", "UpdateGatewayFileShare", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientSideCmk() {
		return this.clientSideCmk;
	}

	public void setClientSideCmk(String clientSideCmk) {
		this.clientSideCmk = clientSideCmk;
		if(clientSideCmk != null){
			putQueryParameter("ClientSideCmk", clientSideCmk);
		}
	}

	public Boolean getInPlace() {
		return this.inPlace;
	}

	public void setInPlace(Boolean inPlace) {
		this.inPlace = inPlace;
		if(inPlace != null){
			putQueryParameter("InPlace", inPlace.toString());
		}
	}

	public Boolean getBrowsable() {
		return this.browsable;
	}

	public void setBrowsable(Boolean browsable) {
		this.browsable = browsable;
		if(browsable != null){
			putQueryParameter("Browsable", browsable.toString());
		}
	}

	public String getReadWriteUserList() {
		return this.readWriteUserList;
	}

	public void setReadWriteUserList(String readWriteUserList) {
		this.readWriteUserList = readWriteUserList;
		if(readWriteUserList != null){
			putQueryParameter("ReadWriteUserList", readWriteUserList);
		}
	}

	public Integer getPollingInterval() {
		return this.pollingInterval;
	}

	public void setPollingInterval(Integer pollingInterval) {
		this.pollingInterval = pollingInterval;
		if(pollingInterval != null){
			putQueryParameter("PollingInterval", pollingInterval.toString());
		}
	}

	public String getReadWriteClientList() {
		return this.readWriteClientList;
	}

	public void setReadWriteClientList(String readWriteClientList) {
		this.readWriteClientList = readWriteClientList;
		if(readWriteClientList != null){
			putQueryParameter("ReadWriteClientList", readWriteClientList);
		}
	}

	public Boolean getBypassCacheRead() {
		return this.bypassCacheRead;
	}

	public void setBypassCacheRead(Boolean bypassCacheRead) {
		this.bypassCacheRead = bypassCacheRead;
		if(bypassCacheRead != null){
			putQueryParameter("BypassCacheRead", bypassCacheRead.toString());
		}
	}

	public Integer getBackendLimit() {
		return this.backendLimit;
	}

	public void setBackendLimit(Integer backendLimit) {
		this.backendLimit = backendLimit;
		if(backendLimit != null){
			putQueryParameter("BackendLimit", backendLimit.toString());
		}
	}

	public String getSquash() {
		return this.squash;
	}

	public void setSquash(String squash) {
		this.squash = squash;
		if(squash != null){
			putQueryParameter("Squash", squash);
		}
	}

	public String getReadOnlyClientList() {
		return this.readOnlyClientList;
	}

	public void setReadOnlyClientList(String readOnlyClientList) {
		this.readOnlyClientList = readOnlyClientList;
		if(readOnlyClientList != null){
			putQueryParameter("ReadOnlyClientList", readOnlyClientList);
		}
	}

	public String getServerSideCmk() {
		return this.serverSideCmk;
	}

	public void setServerSideCmk(String serverSideCmk) {
		this.serverSideCmk = serverSideCmk;
		if(serverSideCmk != null){
			putQueryParameter("ServerSideCmk", serverSideCmk);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Long getKmsRotatePeriod() {
		return this.kmsRotatePeriod;
	}

	public void setKmsRotatePeriod(Long kmsRotatePeriod) {
		this.kmsRotatePeriod = kmsRotatePeriod;
		if(kmsRotatePeriod != null){
			putQueryParameter("KmsRotatePeriod", kmsRotatePeriod.toString());
		}
	}

	public Boolean getRemoteSyncDownload() {
		return this.remoteSyncDownload;
	}

	public void setRemoteSyncDownload(Boolean remoteSyncDownload) {
		this.remoteSyncDownload = remoteSyncDownload;
		if(remoteSyncDownload != null){
			putQueryParameter("RemoteSyncDownload", remoteSyncDownload.toString());
		}
	}

	public Boolean getServerSideEncryption() {
		return this.serverSideEncryption;
	}

	public void setServerSideEncryption(Boolean serverSideEncryption) {
		this.serverSideEncryption = serverSideEncryption;
		if(serverSideEncryption != null){
			putQueryParameter("ServerSideEncryption", serverSideEncryption.toString());
		}
	}

	public Boolean getNfsV4Optimization() {
		return this.nfsV4Optimization;
	}

	public void setNfsV4Optimization(Boolean nfsV4Optimization) {
		this.nfsV4Optimization = nfsV4Optimization;
		if(nfsV4Optimization != null){
			putQueryParameter("NfsV4Optimization", nfsV4Optimization.toString());
		}
	}

	public Boolean getAccessBasedEnumeration() {
		return this.accessBasedEnumeration;
	}

	public void setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
		this.accessBasedEnumeration = accessBasedEnumeration;
		if(accessBasedEnumeration != null){
			putQueryParameter("AccessBasedEnumeration", accessBasedEnumeration.toString());
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public Boolean getIgnoreDelete() {
		return this.ignoreDelete;
	}

	public void setIgnoreDelete(Boolean ignoreDelete) {
		this.ignoreDelete = ignoreDelete;
		if(ignoreDelete != null){
			putQueryParameter("IgnoreDelete", ignoreDelete.toString());
		}
	}

	public Long getLagPeriod() {
		return this.lagPeriod;
	}

	public void setLagPeriod(Long lagPeriod) {
		this.lagPeriod = lagPeriod;
		if(lagPeriod != null){
			putQueryParameter("LagPeriod", lagPeriod.toString());
		}
	}

	public Boolean getDirectIO() {
		return this.directIO;
	}

	public void setDirectIO(Boolean directIO) {
		this.directIO = directIO;
		if(directIO != null){
			putQueryParameter("DirectIO", directIO.toString());
		}
	}

	public Boolean getClientSideEncryption() {
		return this.clientSideEncryption;
	}

	public void setClientSideEncryption(Boolean clientSideEncryption) {
		this.clientSideEncryption = clientSideEncryption;
		if(clientSideEncryption != null){
			putQueryParameter("ClientSideEncryption", clientSideEncryption.toString());
		}
	}

	public String getCacheMode() {
		return this.cacheMode;
	}

	public void setCacheMode(String cacheMode) {
		this.cacheMode = cacheMode;
		if(cacheMode != null){
			putQueryParameter("CacheMode", cacheMode);
		}
	}

	public Integer getDownloadLimit() {
		return this.downloadLimit;
	}

	public void setDownloadLimit(Integer downloadLimit) {
		this.downloadLimit = downloadLimit;
		if(downloadLimit != null){
			putQueryParameter("DownloadLimit", downloadLimit.toString());
		}
	}

	public String getReadOnlyUserList() {
		return this.readOnlyUserList;
	}

	public void setReadOnlyUserList(String readOnlyUserList) {
		this.readOnlyUserList = readOnlyUserList;
		if(readOnlyUserList != null){
			putQueryParameter("ReadOnlyUserList", readOnlyUserList);
		}
	}

	public Boolean getFastReclaim() {
		return this.fastReclaim;
	}

	public void setFastReclaim(Boolean fastReclaim) {
		this.fastReclaim = fastReclaim;
		if(fastReclaim != null){
			putQueryParameter("FastReclaim", fastReclaim.toString());
		}
	}

	public Boolean getWindowsAcl() {
		return this.windowsAcl;
	}

	public void setWindowsAcl(Boolean windowsAcl) {
		this.windowsAcl = windowsAcl;
		if(windowsAcl != null){
			putQueryParameter("WindowsAcl", windowsAcl.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getIndexId() {
		return this.indexId;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
		if(indexId != null){
			putQueryParameter("IndexId", indexId);
		}
	}

	public Boolean getTransferAcceleration() {
		return this.transferAcceleration;
	}

	public void setTransferAcceleration(Boolean transferAcceleration) {
		this.transferAcceleration = transferAcceleration;
		if(transferAcceleration != null){
			putQueryParameter("TransferAcceleration", transferAcceleration.toString());
		}
	}

	public Boolean getRemoteSync() {
		return this.remoteSync;
	}

	public void setRemoteSync(Boolean remoteSync) {
		this.remoteSync = remoteSync;
		if(remoteSync != null){
			putQueryParameter("RemoteSync", remoteSync.toString());
		}
	}

	public Integer getFrontendLimit() {
		return this.frontendLimit;
	}

	public void setFrontendLimit(Integer frontendLimit) {
		this.frontendLimit = frontendLimit;
		if(frontendLimit != null){
			putQueryParameter("FrontendLimit", frontendLimit.toString());
		}
	}

	@Override
	public Class<UpdateGatewayFileShareResponse> getResponseClass() {
		return UpdateGatewayFileShareResponse.class;
	}

}
