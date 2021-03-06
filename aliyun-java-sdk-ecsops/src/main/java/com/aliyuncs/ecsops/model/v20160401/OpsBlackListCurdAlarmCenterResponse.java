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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsBlackListCurdAlarmCenterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsBlackListCurdAlarmCenterResponse extends AcsResponse {

	private String blacklistDataType;

	private String operateType;

	private Boolean useBpms;

	private String bpmsUrl;

	private List<BlacklistDimension> blacklistDimensions;

	private List<BlacklistContent> blacklistContents;

	public String getBlacklistDataType() {
		return this.blacklistDataType;
	}

	public void setBlacklistDataType(String blacklistDataType) {
		this.blacklistDataType = blacklistDataType;
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public Boolean getUseBpms() {
		return this.useBpms;
	}

	public void setUseBpms(Boolean useBpms) {
		this.useBpms = useBpms;
	}

	public String getBpmsUrl() {
		return this.bpmsUrl;
	}

	public void setBpmsUrl(String bpmsUrl) {
		this.bpmsUrl = bpmsUrl;
	}

	public List<BlacklistDimension> getBlacklistDimensions() {
		return this.blacklistDimensions;
	}

	public void setBlacklistDimensions(List<BlacklistDimension> blacklistDimensions) {
		this.blacklistDimensions = blacklistDimensions;
	}

	public List<BlacklistContent> getBlacklistContents() {
		return this.blacklistContents;
	}

	public void setBlacklistContents(List<BlacklistContent> blacklistContents) {
		this.blacklistContents = blacklistContents;
	}

	public static class BlacklistDimension {

		private Integer blacklistDimensionId;

		private String blacklistDimension;

		public Integer getBlacklistDimensionId() {
			return this.blacklistDimensionId;
		}

		public void setBlacklistDimensionId(Integer blacklistDimensionId) {
			this.blacklistDimensionId = blacklistDimensionId;
		}

		public String getBlacklistDimension() {
			return this.blacklistDimension;
		}

		public void setBlacklistDimension(String blacklistDimension) {
			this.blacklistDimension = blacklistDimension;
		}
	}

	public static class BlacklistContent {

		private Integer blacklistContentId;

		private Integer metaInfoId;

		private String staffId;

		private String nickname;

		private String blackContent;

		private String dueTime;

		private String gmtCreated;

		private String gmtModified;

		private String extension;

		public Integer getBlacklistContentId() {
			return this.blacklistContentId;
		}

		public void setBlacklistContentId(Integer blacklistContentId) {
			this.blacklistContentId = blacklistContentId;
		}

		public Integer getMetaInfoId() {
			return this.metaInfoId;
		}

		public void setMetaInfoId(Integer metaInfoId) {
			this.metaInfoId = metaInfoId;
		}

		public String getStaffId() {
			return this.staffId;
		}

		public void setStaffId(String staffId) {
			this.staffId = staffId;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getBlackContent() {
			return this.blackContent;
		}

		public void setBlackContent(String blackContent) {
			this.blackContent = blackContent;
		}

		public String getDueTime() {
			return this.dueTime;
		}

		public void setDueTime(String dueTime) {
			this.dueTime = dueTime;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}
	}

	@Override
	public OpsBlackListCurdAlarmCenterResponse getInstance(UnmarshallerContext context) {
		return	OpsBlackListCurdAlarmCenterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
