package io.intercom.android.sdk.p041ui.extension;

import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, m18302d2 = {"isVideo", "", "", "isImage", "isAudio", "isDocument", "isPdf", "intercom-sdk-ui_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ContentTypeExtensionKt {
    public static final boolean isAudio(@NotNull String str) {
        Intrinsics.m18599g(str, "<this>");
        return StringsKt.m20434j(str, "audio", false);
    }

    public static final boolean isDocument(@NotNull String str) {
        Intrinsics.m18599g(str, "<this>");
        return StringsKt.m20434j(str, "application", false) || StringsKt.m20434j(str, AttributeType.TEXT, false);
    }

    public static final boolean isImage(@NotNull String str) {
        Intrinsics.m18599g(str, "<this>");
        return StringsKt.m20434j(str, AppearanceType.IMAGE, false);
    }

    public static final boolean isPdf(@NotNull String str) {
        Intrinsics.m18599g(str, "<this>");
        return StringsKt.m20434j(str, "pdf", false);
    }

    public static final boolean isVideo(@NotNull String str) {
        Intrinsics.m18599g(str, "<this>");
        return StringsKt.m20434j(str, "video", false);
    }
}
