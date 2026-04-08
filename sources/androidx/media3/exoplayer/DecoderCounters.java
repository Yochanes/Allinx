package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Locale;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DecoderCounters {

    /* JADX INFO: renamed from: a */
    public int f25994a;

    /* JADX INFO: renamed from: b */
    public int f25995b;

    /* JADX INFO: renamed from: c */
    public int f25996c;

    /* JADX INFO: renamed from: d */
    public int f25997d;

    /* JADX INFO: renamed from: e */
    public int f25998e;

    /* JADX INFO: renamed from: f */
    public int f25999f;

    /* JADX INFO: renamed from: g */
    public int f26000g;

    /* JADX INFO: renamed from: h */
    public int f26001h;

    /* JADX INFO: renamed from: i */
    public int f26002i;

    /* JADX INFO: renamed from: j */
    public int f26003j;

    /* JADX INFO: renamed from: k */
    public long f26004k;

    /* JADX INFO: renamed from: l */
    public int f26005l;

    public final String toString() {
        int i = this.f25994a;
        int i2 = this.f25995b;
        int i3 = this.f25996c;
        int i4 = this.f25997d;
        int i5 = this.f25998e;
        int i6 = this.f25999f;
        int i7 = this.f26000g;
        int i8 = this.f26001h;
        int i9 = this.f26002i;
        int i10 = this.f26003j;
        long j = this.f26004k;
        int i11 = this.f26005l;
        int i12 = Util.f25665a;
        Locale locale = Locale.US;
        StringBuilder sbM24u = AbstractC0000a.m24u("DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=", i, i2);
        sbM24u.append(i3);
        sbM24u.append("\n skippedInputBuffers=");
        sbM24u.append(i4);
        sbM24u.append("\n renderedOutputBuffers=");
        sbM24u.append(i5);
        sbM24u.append("\n skippedOutputBuffers=");
        sbM24u.append(i6);
        sbM24u.append("\n droppedBuffers=");
        sbM24u.append(i7);
        sbM24u.append("\n droppedInputBuffers=");
        sbM24u.append(i8);
        sbM24u.append("\n maxConsecutiveDroppedBuffers=");
        sbM24u.append(i9);
        sbM24u.append("\n droppedToKeyframeEvents=");
        sbM24u.append(i10);
        sbM24u.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM24u.append(j);
        sbM24u.append("\n videoFrameProcessingOffsetCount=");
        sbM24u.append(i11);
        sbM24u.append("\n}");
        return sbM24u.toString();
    }
}
