package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "", "Lkotlinx/serialization/modules/SerialModuleImpl;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class SerializersModule {
    /* JADX INFO: renamed from: a */
    public abstract KSerializer mo21161a(KClass kClass, List list);

    /* JADX INFO: renamed from: b */
    public abstract DeserializationStrategy mo21162b(String str, KClass kClass);

    /* JADX INFO: renamed from: c */
    public abstract SerializationStrategy mo21163c(KClass kClass, Object obj);
}
