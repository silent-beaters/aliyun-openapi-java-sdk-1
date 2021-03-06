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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDemandResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDemandResponse.DemandInfoModel;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDemandResponse.DemandInfoModel.DemandResourceInfoModel;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDemandResponse.DemandInfoModel.DemandResourceInfoModel.DemandSupplyStatusModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDemandResponseUnmarshaller {

	public static OpsDescribeDemandResponse unmarshall(OpsDescribeDemandResponse opsDescribeDemandResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDemandResponse.setRequestId(_ctx.stringValue("OpsDescribeDemandResponse.RequestId"));
		opsDescribeDemandResponse.setCode(_ctx.stringValue("OpsDescribeDemandResponse.Code"));
		opsDescribeDemandResponse.setMessage(_ctx.stringValue("OpsDescribeDemandResponse.Message"));
		opsDescribeDemandResponse.setSuccess(_ctx.booleanValue("OpsDescribeDemandResponse.Success"));

		List<DemandInfoModel> demandInfoModelList = new ArrayList<DemandInfoModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDemandResponse.DemandInfoModelList.Length"); i++) {
			DemandInfoModel demandInfoModel = new DemandInfoModel();
			demandInfoModel.setDemandId(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandId"));
			demandInfoModel.setBatchName(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].BatchName"));
			demandInfoModel.setProjectId(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].ProjectId"));
			demandInfoModel.setDemandTime(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandTime"));
			demandInfoModel.setSumitterUid(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].SumitterUid"));
			demandInfoModel.setSumitterName(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].SumitterName"));
			demandInfoModel.setCustomerUid(_ctx.longValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].CustomerUid"));
			demandInfoModel.setCustomerName(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].CustomerName"));
			demandInfoModel.setDemandSupplyPmName(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].demandSupplyPmName"));
			demandInfoModel.setDemandSupplyPmUid(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].demandSupplyPmUid"));
			demandInfoModel.setSupplyStatus(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].SupplyStatus"));
			demandInfoModel.setStatus(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].Status"));
			demandInfoModel.setComment(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].Comment"));

			List<DemandResourceInfoModel> demandResourceInfoModelList = new ArrayList<DemandResourceInfoModel>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList.Length"); j++) {
				DemandResourceInfoModel demandResourceInfoModel = new DemandResourceInfoModel();
				demandResourceInfoModel.setSubDemandId(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].SubDemandId"));
				demandResourceInfoModel.setRegion(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].Region"));
				demandResourceInfoModel.setIz(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].Iz"));
				demandResourceInfoModel.setBusinessType(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].BusinessType"));
				demandResourceInfoModel.setInstanceType(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].InstanceType"));
				demandResourceInfoModel.setNetworkType(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].NetworkType"));
				demandResourceInfoModel.setPayType(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].PayType"));
				demandResourceInfoModel.setPayDuration(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].PayDuration"));
				demandResourceInfoModel.setPayDurationUnit(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].PayDurationUnit"));
				demandResourceInfoModel.setExpectPayTimeBegin(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].ExpectPayTimeBegin"));
				demandResourceInfoModel.setExpectPayTimeEnd(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].ExpectPayTimeEnd"));
				demandResourceInfoModel.setDemandCount(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandCount"));
				demandResourceInfoModel.setSubDemandSupplyPmName(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].SubDemandSupplyPmName"));
				demandResourceInfoModel.setSubDemandSupplyPerformerUid(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].SubDemandSupplyPerformerUid"));
				demandResourceInfoModel.setSubDemandSupplyPerformerName(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].SubDemandSupplyPerformerName"));
				demandResourceInfoModel.setSubDemandSupplyPmUid(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].SubDemandSupplyPmUid"));
				demandResourceInfoModel.setStatus(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].Status"));
				demandResourceInfoModel.setSupplyStatus(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].SupplyStatus"));
				demandResourceInfoModel.setComment(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].Comment"));

				List<DemandSupplyStatusModel> demandSupplyStatusModelList = new ArrayList<DemandSupplyStatusModel>();
				for (int k = 0; k < _ctx.lengthValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList.Length"); k++) {
					DemandSupplyStatusModel demandSupplyStatusModel = new DemandSupplyStatusModel();
					demandSupplyStatusModel.setTotalOrder(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].TotalOrder"));
					demandSupplyStatusModel.setSubOrderId(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].SubOrderId"));
					demandSupplyStatusModel.setAmount(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].Amount"));
					demandSupplyStatusModel.setDeliveredAmount(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].DeliveredAmount"));
					demandSupplyStatusModel.setStatus(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].Status"));
					demandSupplyStatusModel.setSupplyStatus(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].SupplyStatus"));
					demandSupplyStatusModel.setConsumeCnt(_ctx.integerValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].ConsumeCnt"));
					demandSupplyStatusModel.setLastSupplyTime(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].LastSupplyTime"));
					demandSupplyStatusModel.setActualSupplyTime(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].ActualSupplyTime"));
					demandSupplyStatusModel.setComment(_ctx.stringValue("OpsDescribeDemandResponse.DemandInfoModelList["+ i +"].DemandResourceInfoModelList["+ j +"].DemandSupplyStatusModelList["+ k +"].Comment"));

					demandSupplyStatusModelList.add(demandSupplyStatusModel);
				}
				demandResourceInfoModel.setDemandSupplyStatusModelList(demandSupplyStatusModelList);

				demandResourceInfoModelList.add(demandResourceInfoModel);
			}
			demandInfoModel.setDemandResourceInfoModelList(demandResourceInfoModelList);

			demandInfoModelList.add(demandInfoModel);
		}
		opsDescribeDemandResponse.setDemandInfoModelList(demandInfoModelList);
	 
	 	return opsDescribeDemandResponse;
	}
}