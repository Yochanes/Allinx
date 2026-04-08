package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/KClassifier;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface KTypeParameter extends KClassifier {
    String getName();

    List getUpperBounds();

    /* JADX INFO: renamed from: k */
    KVariance mo18633k();
}
