package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration$receiveContentListener$1", "Landroidx/compose/foundation/content/ReceiveContentListener;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DynamicReceiveContentConfiguration$receiveContentListener$1 implements ReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public int f5198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DynamicReceiveContentConfiguration f5199b;

    public DynamicReceiveContentConfiguration$receiveContentListener$1(DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration) {
        this.f5199b = dynamicReceiveContentConfiguration;
    }

    /* JADX INFO: renamed from: a */
    public final void m2524a() {
        int i = this.f5198a + 1;
        this.f5198a = i;
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = this.f5199b;
        if (i == 1) {
            dynamicReceiveContentConfiguration.f5196a.getClass();
            throw null;
        }
        ReceiveContentConfiguration receiveContentConfigurationM2527a = ReceiveContentConfigurationKt.m2527a(dynamicReceiveContentConfiguration.f5196a);
        ReceiveContentListener receiveContentListenerMo2523a = receiveContentConfigurationM2527a != null ? receiveContentConfigurationM2527a.mo2523a() : null;
        if (receiveContentListenerMo2523a != null) {
            ((DynamicReceiveContentConfiguration$receiveContentListener$1) receiveContentListenerMo2523a).m2524a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2525b() {
        int i = this.f5198a;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f5198a = i2;
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = this.f5199b;
        if (i2 == 0 && i > 0) {
            dynamicReceiveContentConfiguration.f5196a.getClass();
            throw null;
        }
        ReceiveContentConfiguration receiveContentConfigurationM2527a = ReceiveContentConfigurationKt.m2527a(dynamicReceiveContentConfiguration.f5196a);
        ReceiveContentListener receiveContentListenerMo2523a = receiveContentConfigurationM2527a != null ? receiveContentConfigurationM2527a.mo2523a() : null;
        if (receiveContentListenerMo2523a != null) {
            ((DynamicReceiveContentConfiguration$receiveContentListener$1) receiveContentListenerMo2523a).m2525b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final TransferableContent m2526c(TransferableContent transferableContent) {
        this.f5199b.f5196a.getClass();
        throw null;
    }
}
