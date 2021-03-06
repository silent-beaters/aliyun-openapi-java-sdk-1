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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCleanIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCleanIpResponse extends AcsResponse {

	private String requestId;

	private String total;

	private String pageSize;

	private String pageNo;

	private List<LockedIp> lockedIps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public List<LockedIp> getLockedIps() {
		return this.lockedIps;
	}

	public void setLockedIps(List<LockedIp> lockedIps) {
		this.lockedIps = lockedIps;
	}

	public static class LockedIp {

		private String iP;

		private String ipType;

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getIpType() {
			return this.ipType;
		}

		public void setIpType(String ipType) {
			this.ipType = ipType;
		}
	}

	@Override
	public OpsDescribeCleanIpResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCleanIpResponseUnmarshaller.unmarshall(this, context);
	}
}
