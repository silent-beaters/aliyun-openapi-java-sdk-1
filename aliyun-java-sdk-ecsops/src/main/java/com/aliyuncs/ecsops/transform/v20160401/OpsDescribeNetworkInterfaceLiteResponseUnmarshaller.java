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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfaceLiteResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfaceLiteResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNetworkInterfaceLiteResponse.Data.PrivateIpSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeNetworkInterfaceLiteResponseUnmarshaller {

	public static OpsDescribeNetworkInterfaceLiteResponse unmarshall(OpsDescribeNetworkInterfaceLiteResponse opsDescribeNetworkInterfaceLiteResponse, UnmarshallerContext _ctx) {
		
		opsDescribeNetworkInterfaceLiteResponse.setRequestId(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.RequestId"));

		Data data = new Data();
		data.setNetworkInterfaceId(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.NetworkInterfaceId"));
		data.setStatus(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.Status"));
		data.setType(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.Type"));
		data.setVSwitchId(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.VSwitchId"));
		data.setPrivateIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.PrivateIpAddress"));
		data.setMacAddress(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.MacAddress"));
		data.setNetworkInterfaceName(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.NetworkInterfaceName"));
		data.setDescription(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.Description"));
		data.setCreationTime(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.CreationTime"));
		data.setServiceID(_ctx.longValue("OpsDescribeNetworkInterfaceLiteResponse.Data.ServiceID"));
		data.setServiceManaged(_ctx.booleanValue("OpsDescribeNetworkInterfaceLiteResponse.Data.ServiceManaged"));
		data.setAliUid(_ctx.longValue("OpsDescribeNetworkInterfaceLiteResponse.Data.AliUid"));
		data.setBid(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.Bid"));
		data.setRegionId(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.RegionId"));

		List<PrivateIpSet> privateIpSets = new ArrayList<PrivateIpSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeNetworkInterfaceLiteResponse.Data.PrivateIpSets.Length"); i++) {
			PrivateIpSet privateIpSet = new PrivateIpSet();
			privateIpSet.setPrivateIpAddress(_ctx.stringValue("OpsDescribeNetworkInterfaceLiteResponse.Data.PrivateIpSets["+ i +"].PrivateIpAddress"));
			privateIpSet.setPrimary(_ctx.booleanValue("OpsDescribeNetworkInterfaceLiteResponse.Data.PrivateIpSets["+ i +"].Primary"));

			privateIpSets.add(privateIpSet);
		}
		data.setPrivateIpSets(privateIpSets);
		opsDescribeNetworkInterfaceLiteResponse.setData(data);
	 
	 	return opsDescribeNetworkInterfaceLiteResponse;
	}
}