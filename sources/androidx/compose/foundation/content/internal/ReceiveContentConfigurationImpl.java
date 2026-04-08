package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfigurationImpl;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class ReceiveContentConfigurationImpl extends ReceiveContentConfiguration {
    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    /* JADX INFO: renamed from: a */
    public final ReceiveContentListener mo2523a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiveContentConfigurationImpl)) {
            return false;
        }
        ((ReceiveContentConfigurationImpl) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=null)";
    }
}
