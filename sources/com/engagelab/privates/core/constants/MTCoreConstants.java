package com.engagelab.privates.core.constants;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface MTCoreConstants {

    /* JADX INFO: compiled from: Proguard */
    public interface Config {
        public static final String APP_CHANNEL = "config_app_channel";
        public static final String APP_KEY = "config_app_key";
        public static final String APP_SITE_NAME = "config_app_site_name";
        public static final String DEBUG_MODE = "config_debug_mode";
        public static final String IS_SSL = "config_is_ssl";
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Heartbeat {
        public static final long DEFAULT_VALUE_HEARTBEAT_INTERVAL = 290000;
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Login {
        public static final String KEY_CODE = "code";
        public static final String KEY_SEED_ID = "seed_id";
        public static final String KEY_SERVER_TIME = "server_time";
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MainWhat {
        public static final int ON_HEARTBEAT = 2003;
        public static final int ON_LOGIN_INTO = 2102;
        public static final int ON_REGISTER_INTO = 2101;
        public static final int ON_TCP_CONNECTED = 2001;
        public static final int ON_TCP_DISCONNECTED = 2002;
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Protocol {
        public static final String KEY_DATA = "data";
        public static final String KEY_PROTOCOL = "protocol";
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Register {
        public static final String KEY_CODE = "code";
        public static final String KEY_PW = "pwd";
        public static final String KEY_REGISTRATION_ID = "registration_id";
        public static final String KEY_USER_ID = "user_id";
    }

    /* JADX INFO: compiled from: Proguard */
    public interface RemoteWhat {
        public static final int ON_HEARTBEAT = 2997;
        public static final int ON_TCP_CONNECTED = 2999;
        public static final int ON_TCP_DISCONNECTED = 2998;
        public static final int REPORT = 2233;
        public static final int RETRY_CONNECT = 2990;
        public static final int SET_CONFIG = 2234;
        public static final int START_CONNECT = 2994;
        public static final int START_HEARTBEAT = 2992;
        public static final int STOP_CONNECT = 2993;
        public static final int STOP_HEARTBEAT = 2991;
        public static final int TURN_OFF_CONNECT = 2995;
        public static final int TURN_ON_CONNECT = 2996;
        public static final int UPLOAD = 2222;
    }
}
