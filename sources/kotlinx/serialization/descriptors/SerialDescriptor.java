package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface SerialDescriptor {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    String mo20939a();

    /* JADX INFO: renamed from: c */
    boolean mo20940c();

    /* JADX INFO: renamed from: d */
    int mo20941d(String str);

    /* JADX INFO: renamed from: e */
    int mo20942e();

    /* JADX INFO: renamed from: f */
    String mo20943f(int i);

    /* JADX INFO: renamed from: g */
    List mo20944g(int i);

    List getAnnotations();

    SerialKind getKind();

    /* JADX INFO: renamed from: h */
    SerialDescriptor mo20945h(int i);

    /* JADX INFO: renamed from: i */
    boolean mo20946i(int i);

    boolean isInline();
}
