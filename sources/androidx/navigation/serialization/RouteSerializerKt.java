package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"navigation-common_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RouteSerializerKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m11314a(SerialDescriptor serialDescriptor) {
        Intrinsics.m18599g(serialDescriptor, "<this>");
        return Intrinsics.m18594b(serialDescriptor.getF56623b(), StructureKind.CLASS.f56642a) && serialDescriptor.isInline() && serialDescriptor.getF56624c() == 1;
    }
}
