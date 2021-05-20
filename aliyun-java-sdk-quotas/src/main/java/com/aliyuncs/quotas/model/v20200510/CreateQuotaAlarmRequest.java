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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateQuotaAlarmRequest extends RpcAcsRequest<CreateQuotaAlarmResponse> {
	   

	private String productCode;

	private String webHook;

	private Float threshold;

	private String quotaActionCode;

	private String thresholdType;

	private List<QuotaDimensions> quotaDimensionss;

	private Float thresholdPercent;

	private String alarmName;
	public CreateQuotaAlarmRequest() {
		super("quotas", "2020-05-10", "CreateQuotaAlarm", "quotas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getWebHook() {
		return this.webHook;
	}

	public void setWebHook(String webHook) {
		this.webHook = webHook;
		if(webHook != null){
			putBodyParameter("WebHook", webHook);
		}
	}

	public Float getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putBodyParameter("Threshold", threshold.toString());
		}
	}

	public String getQuotaActionCode() {
		return this.quotaActionCode;
	}

	public void setQuotaActionCode(String quotaActionCode) {
		this.quotaActionCode = quotaActionCode;
		if(quotaActionCode != null){
			putBodyParameter("QuotaActionCode", quotaActionCode);
		}
	}

	public String getThresholdType() {
		return this.thresholdType;
	}

	public void setThresholdType(String thresholdType) {
		this.thresholdType = thresholdType;
		if(thresholdType != null){
			putBodyParameter("ThresholdType", thresholdType);
		}
	}

	public List<QuotaDimensions> getQuotaDimensionss() {
		return this.quotaDimensionss;
	}

	public void setQuotaDimensionss(List<QuotaDimensions> quotaDimensionss) {
		this.quotaDimensionss = quotaDimensionss;	
		if (quotaDimensionss != null) {
			for (int depth1 = 0; depth1 < quotaDimensionss.size(); depth1++) {
				putBodyParameter("QuotaDimensions." + (depth1 + 1) + ".Key" , quotaDimensionss.get(depth1).getKey());
				putBodyParameter("QuotaDimensions." + (depth1 + 1) + ".Value" , quotaDimensionss.get(depth1).getValue());
			}
		}	
	}

	public Float getThresholdPercent() {
		return this.thresholdPercent;
	}

	public void setThresholdPercent(Float thresholdPercent) {
		this.thresholdPercent = thresholdPercent;
		if(thresholdPercent != null){
			putBodyParameter("ThresholdPercent", thresholdPercent.toString());
		}
	}

	public String getAlarmName() {
		return this.alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
		if(alarmName != null){
			putBodyParameter("AlarmName", alarmName);
		}
	}

	public static class QuotaDimensions {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateQuotaAlarmResponse> getResponseClass() {
		return CreateQuotaAlarmResponse.class;
	}

}
