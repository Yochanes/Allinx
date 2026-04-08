package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/ShutdownReason;", "", "Companion", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class ShutdownReason {

    /* JADX INFO: renamed from: c */
    public static final ShutdownReason f43453c = new ShutdownReason(1000, "Normal closure");

    /* JADX INFO: renamed from: a */
    public final int f43454a;

    /* JADX INFO: renamed from: b */
    public final String f43455b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"Lcom/tinder/scarlet/ShutdownReason$Companion;", "", "Lcom/tinder/scarlet/ShutdownReason;", "GRACEFUL", "Lcom/tinder/scarlet/ShutdownReason;", "", "NORMAL_CLOSURE_REASON", "Ljava/lang/String;", "", "NORMAL_CLOSURE_STATUS_CODE", "I", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public ShutdownReason(int i, String str) {
        this.f43454a = i;
        this.f43455b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShutdownReason)) {
            return false;
        }
        ShutdownReason shutdownReason = (ShutdownReason) obj;
        return this.f43454a == shutdownReason.f43454a && Intrinsics.m18594b(this.f43455b, shutdownReason.f43455b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f43454a) * 31;
        String str = this.f43455b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShutdownReason(code=");
        sb.append(this.f43454a);
        sb.append(", reason=");
        return AbstractC0000a.m19p(sb, this.f43455b, ")");
    }
}
