package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    public static SdkHeartBeatResult create(String str, long j) {
        return new AutoValue_SdkHeartBeatResult(str, j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        return compareTo2(sdkHeartBeatResult);
    }

    public abstract long getMillis();

    public abstract String getSdkName();

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(SdkHeartBeatResult sdkHeartBeatResult) {
        return getMillis() < sdkHeartBeatResult.getMillis() ? -1 : 1;
    }
}
