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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryClusterGroupStatusModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryClusterGroupStatusModelResponse extends AcsResponse {

	private String requestId;

	private String resultJsonString;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultJsonString() {
		return this.resultJsonString;
	}

	public void setResultJsonString(String resultJsonString) {
		this.resultJsonString = resultJsonString;
	}

	@Override
	public OpsQueryClusterGroupStatusModelResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryClusterGroupStatusModelResponseUnmarshaller.unmarshall(this, context);
	}
}
