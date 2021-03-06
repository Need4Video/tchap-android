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
package fr.gouv.tchap.sdk.rest.model;

import com.google.gson.annotations.SerializedName;

import fr.gouv.tchap.activity.TchapLoginActivity;

/**
 * Class to contain a password policy.
 */
public class PasswordPolicy {
    // Minimum accepted length for a password.
    @SerializedName("m.minimum_length")
    public int minLength = TchapLoginActivity.MIN_PASSWORD_LENGTH;

    // Whether a password must contain at least one digit.
    @SerializedName("m.require_digit")
    public boolean isDigitRequired = false;

    // Whether a password must contain at least one symbol.
    @SerializedName("m.require_symbol")
    public boolean isSymbolRequired = false;

    // Whether a password must contain at least one uppercase letter.
    @SerializedName("m.require_uppercase")
    public boolean isUppercaseRequired = false;

    // Whether a password must contain at least one lowercase letter.
    @SerializedName("m.require_lowercase")
    public boolean isLowercaseRequired = false;
}
