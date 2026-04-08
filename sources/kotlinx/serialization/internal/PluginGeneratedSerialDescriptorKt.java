package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt$elementDescriptors$1$1;
import kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$1;
import kotlinx.serialization.descriptors.SerialKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PluginGeneratedSerialDescriptorKt {
    /* JADX INFO: renamed from: a */
    public static final int m21023a(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.m18599g(serialDescriptor, "<this>");
        Intrinsics.m18599g(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.getF56755b().hashCode() * 31) + Arrays.hashCode(typeParams);
        SerialDescriptorKt$special$$inlined$Iterable$1 serialDescriptorKt$special$$inlined$Iterable$1 = new SerialDescriptorKt$special$$inlined$Iterable$1(serialDescriptor);
        Iterator<SerialDescriptor> it = serialDescriptorKt$special$$inlined$Iterable$1.iterator();
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            SerialDescriptorKt$elementDescriptors$1$1 serialDescriptorKt$elementDescriptors$1$1 = (SerialDescriptorKt$elementDescriptors$1$1) it;
            int iHashCode3 = 0;
            if (!serialDescriptorKt$elementDescriptors$1$1.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String f56755b = ((SerialDescriptor) serialDescriptorKt$elementDescriptors$1$1.next()).getF56755b();
            if (f56755b != null) {
                iHashCode3 = f56755b.hashCode();
            }
            i = i2 + iHashCode3;
        }
        Iterator<SerialDescriptor> it2 = serialDescriptorKt$special$$inlined$Iterable$1.iterator();
        while (true) {
            SerialDescriptorKt$elementDescriptors$1$1 serialDescriptorKt$elementDescriptors$1$12 = (SerialDescriptorKt$elementDescriptors$1$1) it2;
            if (!serialDescriptorKt$elementDescriptors$1$12.hasNext()) {
                return (((iHashCode * 31) + i) * 31) + iHashCode2;
            }
            int i3 = iHashCode2 * 31;
            SerialKind f56623b = ((SerialDescriptor) serialDescriptorKt$elementDescriptors$1$12.next()).getF56623b();
            iHashCode2 = i3 + (f56623b != null ? f56623b.hashCode() : 0);
        }
    }
}
