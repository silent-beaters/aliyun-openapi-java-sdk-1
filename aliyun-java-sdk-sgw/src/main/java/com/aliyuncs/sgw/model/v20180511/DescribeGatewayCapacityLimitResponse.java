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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayCapacityLimitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayCapacityLimitResponse extends AcsResponse {

	private Long fileSystemSizeInTB;

	private String requestId;

	private String message;

	private Boolean isMetadataSeparate;

	private Long fileNumber;

	private String code;

	private Boolean success;

	public Long getFileSystemSizeInTB() {
		return this.fileSystemSizeInTB;
	}

	public void setFileSystemSizeInTB(Long fileSystemSizeInTB) {
		this.fileSystemSizeInTB = fileSystemSizeInTB;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsMetadataSeparate() {
		return this.isMetadataSeparate;
	}

	public void setIsMetadataSeparate(Boolean isMetadataSeparate) {
		this.isMetadataSeparate = isMetadataSeparate;
	}

	public Long getFileNumber() {
		return this.fileNumber;
	}

	public void setFileNumber(Long fileNumber) {
		this.fileNumber = fileNumber;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public DescribeGatewayCapacityLimitResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayCapacityLimitResponseUnmarshaller.unmarshall(this, context);
	}
}
