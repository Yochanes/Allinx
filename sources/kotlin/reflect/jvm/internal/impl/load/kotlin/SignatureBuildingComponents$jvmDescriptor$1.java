package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.p013ui.platform.AbstractC1313i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SignatureBuildingComponents$jvmDescriptor$1 extends Lambda implements Function1<String, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final SignatureBuildingComponents$jvmDescriptor$1 f53274a = new SignatureBuildingComponents$jvmDescriptor$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.m18599g(it, "it");
        return it.length() > 1 ? AbstractC1313i.m6244a(';', "L", it) : it;
    }
}
