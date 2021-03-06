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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse.SkillGroupConfig;
import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse.SkillGroupConfig.RuleNameInfo;
import com.aliyuncs.qualitycheck.model.v20190115.ListSkillGroupConfigResponse.SkillGroupConfig.SkillGroupScreen;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupConfigResponseUnmarshaller {

	public static ListSkillGroupConfigResponse unmarshall(ListSkillGroupConfigResponse listSkillGroupConfigResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupConfigResponse.setRequestId(_ctx.stringValue("ListSkillGroupConfigResponse.RequestId"));
		listSkillGroupConfigResponse.setSuccess(_ctx.booleanValue("ListSkillGroupConfigResponse.Success"));
		listSkillGroupConfigResponse.setCode(_ctx.stringValue("ListSkillGroupConfigResponse.Code"));
		listSkillGroupConfigResponse.setMessage(_ctx.stringValue("ListSkillGroupConfigResponse.Message"));

		List<SkillGroupConfig> data = new ArrayList<SkillGroupConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupConfigResponse.Data.Length"); i++) {
			SkillGroupConfig skillGroupConfig = new SkillGroupConfig();
			skillGroupConfig.setId(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].Id"));
			skillGroupConfig.setInstanceId(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].InstanceId"));
			skillGroupConfig.setModelId(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].ModelId"));
			skillGroupConfig.setModelName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].ModelName"));
			skillGroupConfig.setName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].Name"));
			skillGroupConfig.setRid(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].Rid"));
			skillGroupConfig.setSkillGroupId(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupId"));
			skillGroupConfig.setSkillGroupName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupName"));
			skillGroupConfig.setStatus(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].Status"));
			skillGroupConfig.setType(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].Type"));
			skillGroupConfig.setVocabId(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].VocabId"));
			skillGroupConfig.setVocabName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].VocabName"));
			skillGroupConfig.setCreateTime(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].CreateTime"));
			skillGroupConfig.setUpdateTime(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].UpdateTime"));
			skillGroupConfig.setQualityCheckType(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].QualityCheckType"));
			skillGroupConfig.setAllContentQualityCheck(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].AllContentQualityCheck"));
			skillGroupConfig.setAllRids(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRids"));
			skillGroupConfig.setSkillGroupFrom(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupFrom"));
			skillGroupConfig.setScreenSwitch(_ctx.booleanValue("ListSkillGroupConfigResponse.Data["+ i +"].ScreenSwitch"));

			List<RuleNameInfo> ruleList = new ArrayList<RuleNameInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupConfigResponse.Data["+ i +"].RuleList.Length"); j++) {
				RuleNameInfo ruleNameInfo = new RuleNameInfo();
				ruleNameInfo.setRid(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].RuleList["+ j +"].Rid"));
				ruleNameInfo.setRuleName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].RuleList["+ j +"].RuleName"));

				ruleList.add(ruleNameInfo);
			}
			skillGroupConfig.setRuleList(ruleList);

			List<RuleNameInfo> allRuleList = new ArrayList<RuleNameInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRuleList.Length"); j++) {
				RuleNameInfo ruleNameInfo_ = new RuleNameInfo();
				ruleNameInfo_.setRid(_ctx.longValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRuleList["+ j +"].Rid"));
				ruleNameInfo_.setRuleName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].AllRuleList["+ j +"].RuleName"));

				allRuleList.add(ruleNameInfo_);
			}
			skillGroupConfig.setAllRuleList(allRuleList);

			List<SkillGroupScreen> skillGroupScreens = new ArrayList<SkillGroupScreen>();
			for (int j = 0; j < _ctx.lengthValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens.Length"); j++) {
				SkillGroupScreen skillGroupScreen = new SkillGroupScreen();
				skillGroupScreen.setName(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].Name"));
				skillGroupScreen.setDataType(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].DataType"));
				skillGroupScreen.setSymbol(_ctx.integerValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].Symbol"));
				skillGroupScreen.setValue(_ctx.stringValue("ListSkillGroupConfigResponse.Data["+ i +"].SkillGroupScreens["+ j +"].Value"));

				skillGroupScreens.add(skillGroupScreen);
			}
			skillGroupConfig.setSkillGroupScreens(skillGroupScreens);

			data.add(skillGroupConfig);
		}
		listSkillGroupConfigResponse.setData(data);
	 
	 	return listSkillGroupConfigResponse;
	}
}