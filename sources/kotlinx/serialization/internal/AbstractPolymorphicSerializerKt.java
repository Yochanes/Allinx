package kotlinx.serialization.internal;

import androidx.compose.p013ui.platform.AbstractC1313i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AbstractPolymorphicSerializerKt {
    /* JADX INFO: renamed from: a */
    public static final void m20990a(String str, KClass baseClass) {
        String string;
        Intrinsics.m18599g(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.mo18588i() + '\'';
        if (str == null) {
            string = AbstractC1313i.m6244a('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM25v = AbstractC0000a.m25v("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            sbM25v.append(str);
            sbM25v.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sbM25v.append(str);
            sbM25v.append("' has to be '@Serializable', and the base class '");
            sbM25v.append(baseClass.mo18588i());
            sbM25v.append("' has to be sealed and '@Serializable'.");
            string = sbM25v.toString();
        }
        throw new SerializationException(string);
    }
}
