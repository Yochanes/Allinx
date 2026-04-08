package androidx.compose.p013ui.autofill;

import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContentType_androidKt {
    /* JADX INFO: renamed from: a */
    public static final ContentType m4880a(String str) {
        return new AndroidContentType(SetsKt.m18503g(str));
    }

    /* JADX INFO: renamed from: b */
    public static final String[] m4881b(ContentType contentType) {
        Intrinsics.m18597e(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((AndroidContentType) contentType).f17228b.toArray(new String[0]);
    }
}
