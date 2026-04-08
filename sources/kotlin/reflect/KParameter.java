package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "Kind", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface KParameter extends KAnnotatedElement {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Kind {

        /* JADX INFO: renamed from: a */
        public static final Kind f51710a;

        /* JADX INFO: renamed from: b */
        public static final Kind f51711b;

        /* JADX INFO: renamed from: c */
        public static final Kind f51712c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ Kind[] f51713d;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ EnumEntries f51714f;

        static {
            Kind kind = new Kind("INSTANCE", 0);
            f51710a = kind;
            Kind kind2 = new Kind("EXTENSION_RECEIVER", 1);
            f51711b = kind2;
            Kind kind3 = new Kind("VALUE", 2);
            f51712c = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            f51713d = kindArr;
            f51714f = EnumEntriesKt.m18563a(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f51713d.clone();
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo18665b();

    int getIndex();

    Kind getKind();

    String getName();

    KTypeImpl getType();

    /* JADX INFO: renamed from: o */
    boolean mo18666o();
}
