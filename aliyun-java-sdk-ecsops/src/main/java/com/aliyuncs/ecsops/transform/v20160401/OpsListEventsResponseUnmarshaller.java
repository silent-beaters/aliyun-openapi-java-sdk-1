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

import com.aliyuncs.ecsops.model.v20160401.OpsListEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListEventsResponse.Event;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListEventsResponseUnmarshaller {

	public static OpsListEventsResponse unmarshall(OpsListEventsResponse opsListEventsResponse, UnmarshallerContext _ctx) {
		
		opsListEventsResponse.setRequestId(_ctx.stringValue("OpsListEventsResponse.RequestId"));
		opsListEventsResponse.setCode(_ctx.stringValue("OpsListEventsResponse.Code"));
		opsListEventsResponse.setMessage(_ctx.stringValue("OpsListEventsResponse.Message"));
		opsListEventsResponse.setSuccess(_ctx.stringValue("OpsListEventsResponse.Success"));
		opsListEventsResponse.setPageNumber(_ctx.integerValue("OpsListEventsResponse.PageNumber"));
		opsListEventsResponse.setPageSize(_ctx.integerValue("OpsListEventsResponse.PageSize"));
		opsListEventsResponse.setTotalCount(_ctx.integerValue("OpsListEventsResponse.TotalCount"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("OpsListEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setEventID(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].eventID"));
			event.setEventType(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].eventType"));
			event.setEventTypeVersion(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].eventTypeVersion"));
			event.setCloudEventsVersion(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].cloudEventsVersion"));
			event.setSource(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].source"));
			event.setEventTime(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].eventTime"));
			event.setSchemaURL(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].schemaURL"));
			event.setContentType(_ctx.stringValue("OpsListEventsResponse.Events["+ i +"].contentType"));
			event.setExtensions(_ctx.mapValue("OpsListEventsResponse.Events["+ i +"].extensions"));
			event.setData(_ctx.mapValue("OpsListEventsResponse.Events["+ i +"].data"));

			events.add(event);
		}
		opsListEventsResponse.setEvents(events);
	 
	 	return opsListEventsResponse;
	}
}