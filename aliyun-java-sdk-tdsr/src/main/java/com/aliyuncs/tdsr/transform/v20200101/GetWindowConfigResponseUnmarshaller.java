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

package com.aliyuncs.tdsr.transform.v20200101;

import com.aliyuncs.tdsr.model.v20200101.GetWindowConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWindowConfigResponseUnmarshaller {

	public static GetWindowConfigResponse unmarshall(GetWindowConfigResponse getWindowConfigResponse, UnmarshallerContext _ctx) {
		
		getWindowConfigResponse.setRequestId(_ctx.stringValue("GetWindowConfigResponse.RequestId"));
		getWindowConfigResponse.setSuccess(_ctx.booleanValue("GetWindowConfigResponse.Success"));
		getWindowConfigResponse.setErrMessage(_ctx.stringValue("GetWindowConfigResponse.ErrMessage"));
		getWindowConfigResponse.setData(_ctx.mapValue("GetWindowConfigResponse.Data"));
		getWindowConfigResponse.setObjectString(_ctx.stringValue("GetWindowConfigResponse.ObjectString"));
	 
	 	return getWindowConfigResponse;
	}
}