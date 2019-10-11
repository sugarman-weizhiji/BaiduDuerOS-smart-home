package com.zhiji.soa.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhiji on 2018/8/29.
 * 百度 小度音响对接
 */
@Api(description = "百度语音")
@RestController
@RequestMapping("/v1/baiduDuerOS/")
public class BaiduDuerOSController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaiduDuerOSController.class);

    /**
     * 1 授权 BaiduDuerOSAuthorization
     */
    @ApiOperation(value = "账户授权")
    @RequestMapping(value = "authorization")    // 授权的这个标签不能修改,只能使用RequestMapping
    public JSONObject authorization(HttpServletRequest request, @ModelAttribute BaiduDuerOSAuthorizationInDTO inDTO) throws BusinessException {
        /**
         * 授权逻辑 Auth2.0
         *  code 换取 token
         */
        return null;
    }

    /**
     * 2 设备交互 - Get
     */
    @ApiOperation(value = "语音服务")
    @PostMapping(value = "webService")
    public String webService(HttpServletRequest request, @RequestBody String value) throws BusinessException {

        String out = null;
        LOGGER.info("webService进来了,参数是value:{}", value);
        // 逻辑处理
        LOGGER.info("webService结束,输出参数为:{}", out);

        return out;
    }


}
