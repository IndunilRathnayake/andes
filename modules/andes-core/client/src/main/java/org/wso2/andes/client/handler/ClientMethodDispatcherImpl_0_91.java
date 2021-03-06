/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.wso2.andes.client.handler;

import org.wso2.andes.AMQException;
import org.wso2.andes.client.protocol.AMQProtocolSession;
import org.wso2.andes.client.state.AMQMethodNotImplementedException;
import org.wso2.andes.framing.*;
import org.wso2.andes.framing.amqp_0_91.MethodDispatcher_0_91;

public class ClientMethodDispatcherImpl_0_91 extends ClientMethodDispatcherImpl implements MethodDispatcher_0_91
{
    public ClientMethodDispatcherImpl_0_91(AMQProtocolSession session)
    {
        super(session);
    }

    public boolean dispatchBasicRecoverSyncOk(BasicRecoverSyncOkBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchBasicRecoverSync(BasicRecoverSyncBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchChannelOk(ChannelOkBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchChannelPing(ChannelPingBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchChannelPong(ChannelPongBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchChannelResume(ChannelResumeBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchMessageAppend(MessageAppendBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageCancel(MessageCancelBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchMessageCheckpoint(MessageCheckpointBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageClose(MessageCloseBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageConsume(MessageConsumeBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchMessageEmpty(MessageEmptyBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageGet(MessageGetBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchMessageOffset(MessageOffsetBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageOk(MessageOkBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageOpen(MessageOpenBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageQos(MessageQosBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchMessageRecover(MessageRecoverBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchMessageReject(MessageRejectBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageResume(MessageResumeBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchMessageTransfer(MessageTransferBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchQueueUnbind(QueueUnbindBody body, int channelId) throws AMQException
    {
        throw new AMQMethodNotImplementedException(body);
    }

    public boolean dispatchBasicRecoverOk(BasicRecoverOkBody body, int channelId) throws AMQException
    {
        return false;
    }

    public boolean dispatchQueueUnbindOk(QueueUnbindOkBody body, int channelId) throws AMQException
    {
        return false;
    }

}