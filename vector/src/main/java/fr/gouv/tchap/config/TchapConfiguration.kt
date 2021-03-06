/*
 * Copyright 2019 New Vector Ltd
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

package fr.gouv.tchap.config


object TchapConfiguration {
    /**
     * White list of the package names for which the "Open PlayStore" button will be displayed
     * in the [TchapVersionCheckActivity]
     * If you do not want the PlayStore button to be displayed, just set to an emptyList like this:
     * val packageWhiteList = emptyList<String>()
     */
//    val packageWhiteList = listOf(
//            // Agent variant of the application
//            "fr.gouv.tchap.a"
//    )
    val packageWhiteList = emptyList<String>()
}