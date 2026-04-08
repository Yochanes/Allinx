package androidx.compose.p013ui.contentcapture;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.platform.coreshims.ViewStructureCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEvent;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class ContentCaptureEvent {

    /* JADX INFO: renamed from: a */
    public final int f17337a;

    /* JADX INFO: renamed from: b */
    public final long f17338b;

    /* JADX INFO: renamed from: c */
    public final ContentCaptureEventType f17339c;

    /* JADX INFO: renamed from: d */
    public final ViewStructureCompat f17340d;

    public ContentCaptureEvent(int i, long j, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.f17337a = i;
        this.f17338b = j;
        this.f17339c = contentCaptureEventType;
        this.f17340d = viewStructureCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.f17337a == contentCaptureEvent.f17337a && this.f17338b == contentCaptureEvent.f17338b && this.f17339c == contentCaptureEvent.f17339c && Intrinsics.m18594b(this.f17340d, contentCaptureEvent.f17340d);
    }

    public final int hashCode() {
        int iHashCode = (this.f17339c.hashCode() + AbstractC0455a.m2231f(this.f17338b, Integer.hashCode(this.f17337a) * 31, 31)) * 31;
        ViewStructureCompat viewStructureCompat = this.f17340d;
        return iHashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f17337a + ", timestamp=" + this.f17338b + ", type=" + this.f17339c + ", structureCompat=" + this.f17340d + ')';
    }
}
