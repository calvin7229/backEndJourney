package com.calvin.backend.template;

import com.calvin.backend.config.callback.BaseCallback;
import com.calvin.backend.infra.BaseRequest;
import com.calvin.backend.infra.BaseResponse;

public class RequestServiceTemplate{

    public <B extends BaseCallback<T, K>, T extends BaseRequest, K extends BaseResponse> K runQuery(B callback, T request) {
        callback.validateRequest(request);
        return callback.query();
    }
}
