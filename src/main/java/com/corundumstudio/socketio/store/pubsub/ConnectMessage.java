/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.corundumstudio.socketio.store.pubsub;

public class ConnectMessage extends PubSubMessage {

    private static final long serialVersionUID = 3108918714495865101L;

    private Long sessionId;

    public ConnectMessage() {
    }

    public ConnectMessage(Long sessionId) {
        super();
        this.sessionId = sessionId;
    }

    public Long getSessionId() {
        return sessionId;
    }

}
