package com.chatroom.newchat.common.websocket.domain.vo.resp;

import com.chatroom.newchat.common.websocket.domain.enums.WSRespTypeEnum;

/**
 * Description:
 * Author: <a href="https://github.com/zongzibinbin">abin</a>
 * Date: 2023-08-27
 */
public class WSBaseResp<T> {
    /**
     * @see WSRespTypeEnum
     */
    private Integer type;
    private T data;
}
