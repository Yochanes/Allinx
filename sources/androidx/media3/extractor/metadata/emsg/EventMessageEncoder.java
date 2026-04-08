package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class EventMessageEncoder {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f28458a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f28459b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f28458a = byteArrayOutputStream;
        this.f28459b = new DataOutputStream(byteArrayOutputStream);
    }
}
