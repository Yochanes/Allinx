package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
public interface SerializersModuleCollector {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    void mo21143a(KClass kClass, Function1 function1);

    /* JADX INFO: renamed from: b */
    void mo21144b(KClass kClass, KClass kClass2, KSerializer kSerializer);

    /* JADX INFO: renamed from: c */
    void mo21145c(KClass kClass, Function1 function1);

    /* JADX INFO: renamed from: d */
    void mo21146d(KClass kClass, KSerializer kSerializer);

    /* JADX INFO: renamed from: e */
    void mo21147e(KClass kClass, Function1 function1);
}
