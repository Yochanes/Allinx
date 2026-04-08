package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface HeartBeatInfo {

    /* JADX INFO: compiled from: Proguard */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    @NonNull
    HeartBeat getHeartBeatCode(@NonNull String str);
}
