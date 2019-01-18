/**
 * @Title:返回对象
 * @Description:员工信息
 * Copyright 2018 GemFrame技术团队 http://www.gemframe.cn
 * Company: DianShiKongJian (Beijing) Technology Co., Ltd.
 * @author Ryan
 * @date 2018-11-1 16:06:06
 * @version V1.0
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.gemframe.business.vo;

import cn.gemframe.business.domain.GemMember;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Transient;

/**
 * @Title:返回对象
 * @Description:员工信息
 * @author Ryan
 * @date 2018-11-1 16:06:06
 * @version V1.0
 */
@Getter
@Setter
public class GemMemberVo extends GemMember {

	private static final long serialVersionUID = 1L;
	
	private @Transient(cause="学习经历主键") Long[] learnIds;

}
