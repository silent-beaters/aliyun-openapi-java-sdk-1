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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsNcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsNcsResponseUnmarshaller {

	public static OpsDescribeCloudOpsNcsResponse unmarshall(OpsDescribeCloudOpsNcsResponse opsDescribeCloudOpsNcsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsNcsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsNcsResponse.RequestId"));
		opsDescribeCloudOpsNcsResponse.setData(_ctx.stringValue("OpsDescribeCloudOpsNcsResponse.Data"));
		opsDescribeCloudOpsNcsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsNcsResponse.BizCode"));
		opsDescribeCloudOpsNcsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsNcsResponse.BizMessage"));
	 
	 	return opsDescribeCloudOpsNcsResponse;
	}
}