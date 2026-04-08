package androidx.compose.p013ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Locale {

    /* JADX INFO: renamed from: a */
    public final java.util.Locale f20447a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public Locale(java.util.Locale locale) {
        this.f20447a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.m18594b(this.f20447a.toLanguageTag(), ((Locale) obj).f20447a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f20447a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f20447a.toLanguageTag();
    }
}
