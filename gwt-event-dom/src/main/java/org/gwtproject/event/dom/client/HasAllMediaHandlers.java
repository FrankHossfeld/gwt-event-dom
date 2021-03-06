/*
 * Copyright © 2019 The GWT Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.event.dom.client;

/**
 * This is a convenience interface that includes all media handlers defined by the core GWT system.
 *
 * <p><span style="color:red">Experimental API: This API is still under development and is subject
 * to change. </span>
 */
public interface HasAllMediaHandlers
    extends HasEndedHandlers,
        HasProgressHandlers,
        HasCanPlayThroughHandlers,
        HasLoadedMetadataHandlers {}
