package com.calvin.backend.config.callback;

import com.calvin.backend.infra.BaseRequest;
import com.calvin.backend.infra.BaseResponse;
import jakarta.validation.Validation;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;

public interface BaseCallback<T extends BaseRequest,K extends BaseResponse> {
    K query();

    default void validateRequest(T request){
        Validation.buildDefaultValidatorFactory().getValidator().validate(request);
    }
}
