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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data.Application;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data.Application.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.RequestId"));
		listApplicationsResponse.setMessage(_ctx.stringValue("ListApplicationsResponse.Message"));
		listApplicationsResponse.setErrorCode(_ctx.stringValue("ListApplicationsResponse.ErrorCode"));
		listApplicationsResponse.setCode(_ctx.stringValue("ListApplicationsResponse.Code"));
		listApplicationsResponse.setSuccess(_ctx.booleanValue("ListApplicationsResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListApplicationsResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("ListApplicationsResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.integerValue("ListApplicationsResponse.Data.TotalSize"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.Data.Applications.Length"); i++) {
			Application application = new Application();
			application.setInstances(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Instances"));
			application.setScaleRuleEnabled(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].ScaleRuleEnabled"));
			application.setAppDescription(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].AppDescription"));
			application.setAppId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].AppId"));
			application.setRunningInstances(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].RunningInstances"));
			application.setRegionId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].RegionId"));
			application.setNamespaceId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].NamespaceId"));
			application.setScaleRuleType(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].ScaleRuleType"));
			application.setAppDeletingStatus(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].AppDeletingStatus"));
			application.setAppName(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].AppName"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsResponse.Data.Applications["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setValue(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Tags["+ j +"].Value"));
				tagsItem.setKey(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Tags["+ j +"].Key"));

				tags.add(tagsItem);
			}
			application.setTags(tags);

			applications.add(application);
		}
		data.setApplications(applications);
		listApplicationsResponse.setData(data);
	 
	 	return listApplicationsResponse;
	}
}