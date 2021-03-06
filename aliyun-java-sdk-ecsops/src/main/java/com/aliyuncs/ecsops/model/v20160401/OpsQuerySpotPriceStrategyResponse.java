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
import com.aliyuncs.ecsops.transform.v20160401.OpsQuerySpotPriceStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQuerySpotPriceStrategyResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private List<SpotStrategy> spotStrategies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<SpotStrategy> getSpotStrategies() {
		return this.spotStrategies;
	}

	public void setSpotStrategies(List<SpotStrategy> spotStrategies) {
		this.spotStrategies = spotStrategies;
	}

	public static class SpotStrategy {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String gmtModified1;

		private String regionNo;

		private String izNo;

		private String instanceType;

		private String instanceTypeFamily;

		private Integer ioOptimized;

		private String networkType;

		private Integer spotDuration;

		private String startDate;

		private String endDate;

		private Integer strategyType;

		private String strategyDetails;

		private String createdBy;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public String getGmtModified1() {
			return this.gmtModified1;
		}

		public void setGmtModified1(String gmtModified1) {
			this.gmtModified1 = gmtModified1;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Integer getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Integer ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Integer getSpotDuration() {
			return this.spotDuration;
		}

		public void setSpotDuration(Integer spotDuration) {
			this.spotDuration = spotDuration;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public Integer getStrategyType() {
			return this.strategyType;
		}

		public void setStrategyType(Integer strategyType) {
			this.strategyType = strategyType;
		}

		public String getStrategyDetails() {
			return this.strategyDetails;
		}

		public void setStrategyDetails(String strategyDetails) {
			this.strategyDetails = strategyDetails;
		}

		public String getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
	}

	@Override
	public OpsQuerySpotPriceStrategyResponse getInstance(UnmarshallerContext context) {
		return	OpsQuerySpotPriceStrategyResponseUnmarshaller.unmarshall(this, context);
	}
}
