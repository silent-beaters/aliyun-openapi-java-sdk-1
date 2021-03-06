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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSpotInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSpotInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSpotInstancesResponseUnmarshaller {

	public static OpsDescribeSpotInstancesResponse unmarshall(OpsDescribeSpotInstancesResponse opsDescribeSpotInstancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSpotInstancesResponse.setRequestId(_ctx.stringValue("OpsDescribeSpotInstancesResponse.RequestId"));
		opsDescribeSpotInstancesResponse.setTotalCount(_ctx.integerValue("OpsDescribeSpotInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSpotInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setRegionId(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setIzId(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].IzId"));
			instance.setZoneId(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setBid(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].Bid"));
			instance.setResourceOwnerId(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].ResourceOwnerId"));
			instance.setCpu(_ctx.integerValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].Cpu"));
			instance.setMemory(_ctx.integerValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].Memory"));
			instance.setInstanceType(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setInstanceTypeFamily(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].InstanceTypeFamily"));
			instance.setStatus(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].Status"));
			instance.setBusinessStatus(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].BusinessStatus"));
			instance.setCreatedTime(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].CreatedTime"));
			instance.setInstanceNetworkType(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].InstanceNetworkType"));
			instance.setIoOptimized(_ctx.booleanValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].IoOptimized"));
			instance.setSpotStrategy(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].SpotStrategy"));
			instance.setSpotDuration(_ctx.integerValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].SpotDuration"));
			instance.setSpotPriceLimit(_ctx.floatValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].SpotPriceLimit"));
			instance.setSpotDiscountLimit(_ctx.integerValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].SpotDiscountLimit"));
			instance.setSpotInterruptionBehavior(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].SpotInterruptionBehavior"));
			instance.setSpotStatus(_ctx.stringValue("OpsDescribeSpotInstancesResponse.Instances["+ i +"].spotStatus"));

			instances.add(instance);
		}
		opsDescribeSpotInstancesResponse.setInstances(instances);
	 
	 	return opsDescribeSpotInstancesResponse;
	}
}