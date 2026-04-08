package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements Function2<SerialDescriptor, Integer, Boolean> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SerialDescriptor p0 = (SerialDescriptor) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.m18599g(p0, "p0");
        JsonElementMarker jsonElementMarker = (JsonElementMarker) this.receiver;
        jsonElementMarker.getClass();
        boolean z2 = !p0.mo20946i(iIntValue) && p0.mo20945h(iIntValue).mo20940c();
        jsonElementMarker.f56887b = z2;
        return Boolean.valueOf(z2);
    }
}
