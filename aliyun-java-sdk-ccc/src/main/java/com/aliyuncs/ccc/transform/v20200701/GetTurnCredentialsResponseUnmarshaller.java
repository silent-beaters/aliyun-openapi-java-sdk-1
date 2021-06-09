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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetTurnCredentialsResponse;
import com.aliyuncs.ccc.model.v20200701.GetTurnCredentialsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTurnCredentialsResponseUnmarshaller {

	public static GetTurnCredentialsResponse unmarshall(GetTurnCredentialsResponse getTurnCredentialsResponse, UnmarshallerContext _ctx) {
		
		getTurnCredentialsResponse.setRequestId(_ctx.stringValue("GetTurnCredentialsResponse.RequestId"));
		getTurnCredentialsResponse.setCode(_ctx.stringValue("GetTurnCredentialsResponse.Code"));
		getTurnCredentialsResponse.setHttpStatusCode(_ctx.integerValue("GetTurnCredentialsResponse.HttpStatusCode"));
		getTurnCredentialsResponse.setMessage(_ctx.stringValue("GetTurnCredentialsResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTurnCredentialsResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("GetTurnCredentialsResponse.Params["+ i +"]"));
		}
		getTurnCredentialsResponse.setParams(params);

		Data data = new Data();
		data.setPassword(_ctx.stringValue("GetTurnCredentialsResponse.Data.Password"));
		data.setUserName(_ctx.stringValue("GetTurnCredentialsResponse.Data.UserName"));
		getTurnCredentialsResponse.setData(data);
	 
	 	return getTurnCredentialsResponse;
	}
}