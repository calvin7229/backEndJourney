package com.calvin.backend.template;

import com.calvin.backend.config.callback.BaseCallback;
import com.calvin.backend.infra.BaseRequest;
import com.calvin.backend.infra.BaseResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestServiceTemplate {

    public <B extends BaseCallback<T, K>, T extends BaseRequest, K extends BaseResponse> K runQuery(B callback, T request) {

        try {
            callback.validateRequest(request);
            log.info(request.toString());
            K response = callback.query();
            log.info(response.toString());
            return response;
        } catch (Exception e) {
            log.error(e.toString());
            throw new RuntimeException(e);
        }
    }
}
