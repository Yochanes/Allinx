package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {

    /* JADX INFO: renamed from: a */
    public final ReceiveContentNode f5196a;

    /* JADX INFO: renamed from: b */
    public final DynamicReceiveContentConfiguration$receiveContentListener$1 f5197b = new DynamicReceiveContentConfiguration$receiveContentListener$1(this);

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.f5196a = receiveContentNode;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    /* JADX INFO: renamed from: a */
    public final ReceiveContentListener mo2523a() {
        return this.f5197b;
    }
}
