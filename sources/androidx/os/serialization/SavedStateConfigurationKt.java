package androidx.os.serialization;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.os.serialization.serializers.SavedStateSerializer;
import androidx.os.serialization.serializers.SizeFSerializer;
import androidx.os.serialization.serializers.SizeSerializer;
import defpackage.C0023a;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"savedstate_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SavedStateConfigurationKt {

    /* JADX INFO: renamed from: a */
    public static final SerialModuleImpl f32065a;

    static {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        SavedStateSerializer savedStateSerializer = SavedStateSerializer.f32083a;
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        serializersModuleBuilder.mo21146d(reflectionFactory.mo18612b(Bundle.class), savedStateSerializer);
        SerialModuleImpl serialModuleImplM21165f = serializersModuleBuilder.m21165f();
        SerializersModuleBuilder serializersModuleBuilder2 = new SerializersModuleBuilder();
        serializersModuleBuilder2.mo21146d(reflectionFactory.mo18612b(Size.class), SizeSerializer.f32087a);
        serializersModuleBuilder2.mo21146d(reflectionFactory.mo18612b(SizeF.class), SizeFSerializer.f32085a);
        serializersModuleBuilder2.mo21147e(reflectionFactory.mo18612b(SparseArray.class), new C0023a(16));
        SerialModuleImpl serialModuleImplM21165f2 = serializersModuleBuilder2.m21165f();
        SerialModuleImpl serialModuleImpl = SerializersModuleKt.f56972a;
        SerializersModuleBuilder serializersModuleBuilder3 = new SerializersModuleBuilder();
        serialModuleImplM21165f.m21164d(serializersModuleBuilder3);
        serialModuleImplM21165f2.m21164d(serializersModuleBuilder3);
        f32065a = serializersModuleBuilder3.m21165f();
    }
}
