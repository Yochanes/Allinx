package kotlinx.serialization.internal;

import com.exchange.allin.p024ui.page.futures.C3201j;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt$elementNames$1$1;
import kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$2;
import kotlinx.serialization.descriptors.SerialKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: l */
    public final SerialKind.ENUM f56687l;

    /* JADX INFO: renamed from: m */
    public final Lazy f56688m;

    public EnumDescriptor(String str, int i) {
        super(str, null, i);
        this.f56687l = SerialKind.ENUM.f56641a;
        this.f56688m = LazyKt.m18299b(new C3201j(i, str, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.getF56623b() != SerialKind.ENUM.f56641a) {
            return false;
        }
        return this.f56735a.equals(serialDescriptor.getF56755b()) && Intrinsics.m18594b(Platform_commonKt.m21017a(this), Platform_commonKt.m21017a(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getKind */
    public final SerialKind getF56623b() {
        return this.f56687l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        return ((SerialDescriptor[]) this.f56688m.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.f56735a.hashCode();
        Iterator<String> it = new SerialDescriptorKt$special$$inlined$Iterable$2(this).iterator();
        int iHashCode2 = 1;
        while (true) {
            SerialDescriptorKt$elementNames$1$1 serialDescriptorKt$elementNames$1$1 = (SerialDescriptorKt$elementNames$1$1) it;
            if (!serialDescriptorKt$elementNames$1$1.hasNext()) {
                return (iHashCode * 31) + iHashCode2;
            }
            int i = iHashCode2 * 31;
            String str = (String) serialDescriptorKt$elementNames$1$1.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return CollectionsKt.m18409J(new SerialDescriptorKt$special$$inlined$Iterable$2(this), ", ", this.f56735a.concat("("), ")", null, 56);
    }
}
