/*
 * Copyright © 2019 The GWT Authors
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

import org.gwtproject.event.legacy.shared.EventHandler;

/**
 * Handler interface for {@link EndedEvent} events.
 *
 * <p><span style="color:red">Experimental API: This API is still under development and is subject
 * to change. </span>
 */
public interface EndedHandler extends EventHandler {

  /**
   * Called when EndedEvent is fired.
   *
   * @param event the {@link EndedEvent} that was fired
   */
  void onEnded(EndedEvent event);
}
