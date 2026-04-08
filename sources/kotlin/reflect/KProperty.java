package kotlin.reflect;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/reflect/KProperty;", "V", "Lkotlin/reflect/KCallable;", "Accessor", "Getter", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface KProperty<V> extends KCallable<V> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/KProperty$Accessor;", "V", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface Accessor<V> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/reflect/KProperty$Getter;", "V", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    Getter getGetter();

    boolean isConst();

    boolean isLateinit();
}
