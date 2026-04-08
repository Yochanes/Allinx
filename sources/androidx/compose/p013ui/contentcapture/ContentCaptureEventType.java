package androidx.compose.p013ui.contentcapture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ContentCaptureEventType {

    /* JADX INFO: renamed from: a */
    public static final ContentCaptureEventType f17341a;

    /* JADX INFO: renamed from: b */
    public static final ContentCaptureEventType f17342b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ContentCaptureEventType[] f17343c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f17344d;

    static {
        ContentCaptureEventType contentCaptureEventType = new ContentCaptureEventType("VIEW_APPEAR", 0);
        f17341a = contentCaptureEventType;
        ContentCaptureEventType contentCaptureEventType2 = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        f17342b = contentCaptureEventType2;
        ContentCaptureEventType[] contentCaptureEventTypeArr = {contentCaptureEventType, contentCaptureEventType2};
        f17343c = contentCaptureEventTypeArr;
        f17344d = EnumEntriesKt.m18563a(contentCaptureEventTypeArr);
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) f17343c.clone();
    }
}
