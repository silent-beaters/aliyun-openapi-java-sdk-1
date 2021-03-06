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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsCreateEventListResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsCreateEventListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCreateEventListResponseUnmarshaller {

	public static OpsCreateEventListResponse unmarshall(OpsCreateEventListResponse opsCreateEventListResponse, UnmarshallerContext _ctx) {
		
		opsCreateEventListResponse.setRequestId(_ctx.stringValue("OpsCreateEventListResponse.RequestId"));
		opsCreateEventListResponse.setCode(_ctx.stringValue("OpsCreateEventListResponse.Code"));
		opsCreateEventListResponse.setMessage(_ctx.stringValue("OpsCreateEventListResponse.Message"));
		opsCreateEventListResponse.setSuccess(_ctx.stringValue("OpsCreateEventListResponse.Success"));

		Data data = new Data();

		List<String> eventIDs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsCreateEventListResponse.Data.eventIDs.Length"); i++) {
			eventIDs.add(_ctx.stringValue("OpsCreateEventListResponse.Data.eventIDs["+ i +"]"));
		}
		data.setEventIDs(eventIDs);
		opsCreateEventListResponse.setData(data);
	 
	 	return opsCreateEventListResponse;
	}
}