package com.app.tvserido.utils;

import com.app.tvserido.models.Radio;
import com.vhall.android.exoplayer2.SimpleExoPlayer;

import java.io.Serializable;
import java.util.ArrayList;

public class Constant implements Serializable {

    public static final int IMMEDIATE_APP_UPDATE_REQ_CODE = 124;
    private static final long serialVersionUID = 1L;
    public static final int PERMISSIONS_REQUEST = 102;

    public static final int DELAY_PERFORM_CLICK = 1000;

    public static final boolean CIRCLE = true;
    public static final boolean SQUARE = false;

    public static String metadata;
    public static String albumArt;
    public static SimpleExoPlayer exoPlayer;
    public static Boolean is_playing = false;
    public static Boolean radio_type = true;
    public static Boolean is_app_open = false;
    public static ArrayList<Radio> item_radio = new ArrayList<>();
    public static int position = 0;

    public static final String LOCALHOST_ADDRESS = "http://10.0.2.2";

    public static final int BANNER_AD = 1;
    public static final int INTERSTITIAL_AD = 1;
    public static final int NATIVE_AD = 1;

}