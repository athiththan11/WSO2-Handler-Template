package com.sample.handlers;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.rest.AbstractHandler;

public class MockHandler extends AbstractHandler {

    private static final Log log = LogFactory.getLog(MockHandler.class);

    @Override
    public boolean handleRequest(MessageContext messageContext) {

        // TODO: implement

        // retrieve axis2 message context
        // org.apache.axis2.context.MessageContext axis2Context = ((Axis2MessageContext)
        // messageContext).getAxis2MessageContext();

        // extract transport headers from context
        // Map<String, Object> transportHeaders = (Map<String, Object>) axis2Context
        // .getProperty(org.apache.axis2.context.MessageContext.TRANSPORT_HEADERS);

        log.info("Handle Request Path");
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) {
        // TODO: implement

        log.info("Handle Response Path");
        return true;
    }
}
