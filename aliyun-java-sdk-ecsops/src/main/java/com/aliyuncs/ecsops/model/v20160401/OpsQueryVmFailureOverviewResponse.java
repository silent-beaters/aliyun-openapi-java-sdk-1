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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryVmFailureOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryVmFailureOverviewResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private String queryGroupField;

	private List<OverviewInfoItem> overviewInfoList;

	private List<String> groupFieldValues;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getQueryGroupField() {
		return this.queryGroupField;
	}

	public void setQueryGroupField(String queryGroupField) {
		this.queryGroupField = queryGroupField;
	}

	public List<OverviewInfoItem> getOverviewInfoList() {
		return this.overviewInfoList;
	}

	public void setOverviewInfoList(List<OverviewInfoItem> overviewInfoList) {
		this.overviewInfoList = overviewInfoList;
	}

	public List<String> getGroupFieldValues() {
		return this.groupFieldValues;
	}

	public void setGroupFieldValues(List<String> groupFieldValues) {
		this.groupFieldValues = groupFieldValues;
	}

	public static class OverviewInfoItem {

		private String gocExceptionName;

		private Integer vcpuCnt;

		private Float gocVcpuCnt;

		private Integer ncCnt;

		private Integer vmCnt;

		private Integer userCnt;

		private Integer gc6Cnt;

		private Integer gc7Cnt;

		private Integer recoverNcCnt;

		private Integer unrecoverNcCnt;

		private Integer recoverVmCnt;

		private Integer unrecoverVmCnt;

		private Integer recoverVcpuCnt;

		private Integer unrecoverVCpuCnt;

		private Integer sequentialRecoverVmCnt;

		private Integer sequentialUnRecoverVmCnt;

		private Integer sequentialRecoverVcpuCnt;

		private Integer sequentialUnRecoverVcpuCnt;

		public String getGocExceptionName() {
			return this.gocExceptionName;
		}

		public void setGocExceptionName(String gocExceptionName) {
			this.gocExceptionName = gocExceptionName;
		}

		public Integer getVcpuCnt() {
			return this.vcpuCnt;
		}

		public void setVcpuCnt(Integer vcpuCnt) {
			this.vcpuCnt = vcpuCnt;
		}

		public Float getGocVcpuCnt() {
			return this.gocVcpuCnt;
		}

		public void setGocVcpuCnt(Float gocVcpuCnt) {
			this.gocVcpuCnt = gocVcpuCnt;
		}

		public Integer getNcCnt() {
			return this.ncCnt;
		}

		public void setNcCnt(Integer ncCnt) {
			this.ncCnt = ncCnt;
		}

		public Integer getVmCnt() {
			return this.vmCnt;
		}

		public void setVmCnt(Integer vmCnt) {
			this.vmCnt = vmCnt;
		}

		public Integer getUserCnt() {
			return this.userCnt;
		}

		public void setUserCnt(Integer userCnt) {
			this.userCnt = userCnt;
		}

		public Integer getGc6Cnt() {
			return this.gc6Cnt;
		}

		public void setGc6Cnt(Integer gc6Cnt) {
			this.gc6Cnt = gc6Cnt;
		}

		public Integer getGc7Cnt() {
			return this.gc7Cnt;
		}

		public void setGc7Cnt(Integer gc7Cnt) {
			this.gc7Cnt = gc7Cnt;
		}

		public Integer getRecoverNcCnt() {
			return this.recoverNcCnt;
		}

		public void setRecoverNcCnt(Integer recoverNcCnt) {
			this.recoverNcCnt = recoverNcCnt;
		}

		public Integer getUnrecoverNcCnt() {
			return this.unrecoverNcCnt;
		}

		public void setUnrecoverNcCnt(Integer unrecoverNcCnt) {
			this.unrecoverNcCnt = unrecoverNcCnt;
		}

		public Integer getRecoverVmCnt() {
			return this.recoverVmCnt;
		}

		public void setRecoverVmCnt(Integer recoverVmCnt) {
			this.recoverVmCnt = recoverVmCnt;
		}

		public Integer getUnrecoverVmCnt() {
			return this.unrecoverVmCnt;
		}

		public void setUnrecoverVmCnt(Integer unrecoverVmCnt) {
			this.unrecoverVmCnt = unrecoverVmCnt;
		}

		public Integer getRecoverVcpuCnt() {
			return this.recoverVcpuCnt;
		}

		public void setRecoverVcpuCnt(Integer recoverVcpuCnt) {
			this.recoverVcpuCnt = recoverVcpuCnt;
		}

		public Integer getUnrecoverVCpuCnt() {
			return this.unrecoverVCpuCnt;
		}

		public void setUnrecoverVCpuCnt(Integer unrecoverVCpuCnt) {
			this.unrecoverVCpuCnt = unrecoverVCpuCnt;
		}

		public Integer getSequentialRecoverVmCnt() {
			return this.sequentialRecoverVmCnt;
		}

		public void setSequentialRecoverVmCnt(Integer sequentialRecoverVmCnt) {
			this.sequentialRecoverVmCnt = sequentialRecoverVmCnt;
		}

		public Integer getSequentialUnRecoverVmCnt() {
			return this.sequentialUnRecoverVmCnt;
		}

		public void setSequentialUnRecoverVmCnt(Integer sequentialUnRecoverVmCnt) {
			this.sequentialUnRecoverVmCnt = sequentialUnRecoverVmCnt;
		}

		public Integer getSequentialRecoverVcpuCnt() {
			return this.sequentialRecoverVcpuCnt;
		}

		public void setSequentialRecoverVcpuCnt(Integer sequentialRecoverVcpuCnt) {
			this.sequentialRecoverVcpuCnt = sequentialRecoverVcpuCnt;
		}

		public Integer getSequentialUnRecoverVcpuCnt() {
			return this.sequentialUnRecoverVcpuCnt;
		}

		public void setSequentialUnRecoverVcpuCnt(Integer sequentialUnRecoverVcpuCnt) {
			this.sequentialUnRecoverVcpuCnt = sequentialUnRecoverVcpuCnt;
		}
	}

	@Override
	public OpsQueryVmFailureOverviewResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryVmFailureOverviewResponseUnmarshaller.unmarshall(this, context);
	}
}
