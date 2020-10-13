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

package com.aliyuncs.cassandra.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cassandra.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeToolExecutionHistoryRequest extends RpcAcsRequest<DescribeNodeToolExecutionHistoryResponse> {
	   

	private String clusterId;

	private String jobId;

	private String dcId;
	public DescribeNodeToolExecutionHistoryRequest() {
		super("Cassandra", "2019-01-01", "DescribeNodeToolExecutionHistory", "Cassandra");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getDcId() {
		return this.dcId;
	}

	public void setDcId(String dcId) {
		this.dcId = dcId;
		if(dcId != null){
			putQueryParameter("DcId", dcId);
		}
	}

	@Override
	public Class<DescribeNodeToolExecutionHistoryResponse> getResponseClass() {
		return DescribeNodeToolExecutionHistoryResponse.class;
	}

}
