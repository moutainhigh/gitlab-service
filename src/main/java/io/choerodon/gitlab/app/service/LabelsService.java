package io.choerodon.gitlab.app.service;

import java.util.List;

import org.gitlab4j.api.models.Label;

import io.choerodon.gitlab.api.vo.LabelVO;

public interface LabelsService {
    /**
     * 查询labels列表
     *
     * @param projectId 项目id
     * @param page      页数
     * @param perPage   每页大小
     * @return List
     */
    List<Label> listLabels(Integer projectId, Integer page, Integer perPage);

    /**
     * 创建labels
     *
     * @param labelVO label对象
     * @return Label
     */
    Label createLabel(LabelVO labelVO);

    /**
     * 创建labels
     *
     * @param labelVO label对象
     * @return Label
     */
    Label updateLabel(LabelVO labelVO);

    /**
     * 删除labels
     *
     * @param projectId 项目id
     */
    void deleteLabel(Integer projectId, String name);

    /**
     * 订阅labels
     *
     * @param projectId 项目id
     * @param labelId   labelID
     * @return Label
     */
    Label subscribeLabel(Integer projectId, Integer labelId);

    /**
     * 取消订阅labels
     *
     * @param projectId 项目id
     * @param labelId   labelID
     * @return Label
     */
    Label unSubscribeLabel(Integer projectId, Integer labelId);
}
