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

import com.aliyuncs.ecsops.model.v20160401.OpsActionTrailResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsActionTrailResponse.Action;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsActionTrailResponseUnmarshaller {

	public static OpsActionTrailResponse unmarshall(OpsActionTrailResponse opsActionTrailResponse, UnmarshallerContext _ctx) {
		
		opsActionTrailResponse.setRequestId(_ctx.stringValue("OpsActionTrailResponse.RequestId"));
		opsActionTrailResponse.setTotalCount(_ctx.integerValue("OpsActionTrailResponse.TotalCount"));
		opsActionTrailResponse.setPageNumber(_ctx.integerValue("OpsActionTrailResponse.PageNumber"));
		opsActionTrailResponse.setPageSize(_ctx.integerValue("OpsActionTrailResponse.PageSize"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("OpsActionTrailResponse.Actions.Length"); i++) {
			Action action = new Action();
			action.setAction(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].Action"));
			action.setVersion(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].Version"));
			action.setDomain(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].Domain"));
			action.setRegionId(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].RegionId"));
			action.setCallerUid(_ctx.longValue("OpsActionTrailResponse.Actions["+ i +"].CallerUid"));
			action.setCallerBid(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].CallerBid"));
			action.setSuccess(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].Success"));
			action.setHttpCode(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].HttpCode"));
			action.setRequestId(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].RequestId"));
			action.setRequestTime(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].RequestTime"));
			action.setErrorCode(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].ErrorCode"));
			action.setErrorMessage(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].ErrorMessage"));
			action.setResourceId(_ctx.stringValue("OpsActionTrailResponse.Actions["+ i +"].ResourceId"));
			action.setRequestContent(_ctx.mapValue("OpsActionTrailResponse.Actions["+ i +"].RequestContent"));

			actions.add(action);
		}
		opsActionTrailResponse.setActions(actions);
	 
	 	return opsActionTrailResponse;
	}
}