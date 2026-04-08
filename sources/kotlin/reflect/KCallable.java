package kotlin.reflect;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/KCallable;", "R", "Lkotlin/reflect/KAnnotatedElement;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface KCallable<R> extends KAnnotatedElement {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    KType getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
