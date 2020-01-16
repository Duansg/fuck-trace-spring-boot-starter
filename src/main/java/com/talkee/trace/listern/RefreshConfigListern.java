package com.talkee.trace.listern;

import com.talkee.trace.constants.TraceConstants;
import com.talkee.trace.model.RefreshConfigModel;
import com.talkee.trace.util.TraceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Duansg
 * @desc
 * @date
 */
@Component
public class RefreshConfigListern implements ApplicationListener<RefreshConfigModel> {

    private static final Logger logger = LoggerFactory.getLogger(RefreshConfigListern.class);

    @Override
    public void onApplicationEvent(RefreshConfigModel config) {
        TraceUtil.setPerprotey(TraceConstants.DIGEST_LOG_SWITCH,String.valueOf(config.isTraceSwitch()));
        TraceUtil.setPerprotey(TraceConstants.DIGEST_LOG_SWITCH_FEIGN,String.valueOf(config.isTraceSwitchFeign()));
        TraceUtil.setPerprotey(TraceConstants.DIGEST_LOG_SWITCH_DUBBO,String.valueOf(config.isTraceSwitchDubbo()));
        TraceUtil.setPerprotey(TraceConstants.DIGEST_SWITCH,String.valueOf(config.isGobalSwitch()));
    }
}