package com.yupi.springbootinit.manager;


import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIManager {

    @Autowired
    private YuCongMingClient yuCongMingClient;

    public String doChat(Long BiModelId, String massage){
        DevChatRequest devChatRequest = new DevChatRequest();
        devChatRequest.setModelId(BiModelId);
        devChatRequest.setMessage(massage);
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        return response.getData().getContent();
    }

}
