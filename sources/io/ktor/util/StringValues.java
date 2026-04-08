package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/StringValues;", "", "Companion", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface StringValues {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/StringValues$Companion;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
        static {
            new StringValuesImpl(MapsKt.m18481d(), false);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static void m17174a(StringValues stringValues, Function2 function2) {
            for (Map.Entry entry : stringValues.entries()) {
                function2.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo16959a(Function2 function2);

    /* JADX INFO: renamed from: b */
    boolean getF46492d();

    /* JADX INFO: renamed from: c */
    List mo16961c(String str);

    Set entries();

    String get(String str);

    boolean isEmpty();
}
