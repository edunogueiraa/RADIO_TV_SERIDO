package com.app.tvserido;

import com.app.tvserido.utils.Constant;

public class Config {

    //set true to enable json remote configuration with access key
    //set false for offline json configuration from assets folder
    public static final boolean ENABLE_REMOTE_JSON = false;

    //only used when remote json is enabled
    //generate your access key using the link below or check the documentation for more detailed instructions
    //https://services.solodroid.co.id/access-key/generate
    public static final String ACCESS_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

    //radio streaming timeout connection, in milliseconds
    public static final boolean ENABLE_RADIO_TIMEOUT = true;
    public static final int RADIO_TIMEOUT_CONNECTION = 10000;

    //display album art metadata with parameter : Constant.CIRCLE or Constant.SQUARE
    public static final boolean CIRCULAR_RADIO_IMAGE_ALBUM_ART = Constant.CIRCLE;

    //radio will stop when receiving a phone call and will resume when the call ends
    public static final boolean RESUME_RADIO_ON_PHONE_CALL = false;

    //splash screen duration in millisecond
    public static final int SPLASH_DURATION = 4000;

    //set true if you want to enable RTL (Right To Left) mode, e.g : Arabic Language
    public static final boolean ENABLE_RTL_MODE = false;

    //GDPR EU Consent
    public static final boolean LEGACY_GDPR = true;

    //social menu open url
    public static final boolean OPEN_SOCIAL_MENU_IN_EXTERNAL_BROWSER = false;

}