/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtphonegap.client.camera;

import com.googlecode.gwtphonegap.client.camera.CameraBrowserImpl.CameraBundle;

/**
 * @author Daniel Kurka
 * 
 */
public interface CameraMock extends Camera {

	public abstract void setCameraBundle(CameraBundle bundle);

	public abstract void setPictureUrl(String url);

	public void setShouldFail(boolean fail);

}