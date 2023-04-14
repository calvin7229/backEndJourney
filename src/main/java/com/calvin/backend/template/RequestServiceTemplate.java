package com.calvin.backend.template;

import com.calvin.backend.config.callback.BaseCallback;
import com.calvin.backend.infra.BaseRequest;
import com.calvin.backend.infra.BaseResponse;

public class RequestServiceTemplate<C extends BaseCallback<T, K>, T extends BaseRequest, K extends BaseResponse> {

    public static <K,T> K runQuery(T request){
        return null;
    }
}
