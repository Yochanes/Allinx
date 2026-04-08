package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.PropertyReference0Impl;

/* JADX INFO: renamed from: androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class C1119x758e63df implements ColorProducer, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PropertyReference0Impl f14913a;

    public C1119x758e63df(PropertyReference0Impl propertyReference0Impl) {
        this.f14913a = propertyReference0Impl;
    }

    @Override // androidx.compose.p013ui.graphics.ColorProducer
    /* JADX INFO: renamed from: a */
    public final long mo3732a() {
        return ((Color) this.f14913a.get()).f17585a;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: b */
    public final Function mo3595b() {
        return this.f14913a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ColorProducer) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return this.f14913a.equals(((FunctionAdapter) obj).mo3595b());
    }

    public final int hashCode() {
        return this.f14913a.hashCode();
    }
}
