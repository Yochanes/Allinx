package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/paging/DataSource;", "", "Key", "Value", "BaseResult", "Companion", "Factory", "InvalidatedCallback", "KeyType", "Params", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class DataSource<Key, Value> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/DataSource$BaseResult;", "", "Value", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class BaseResult<Value> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/DataSource$BaseResult$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BaseResult)) {
                return false;
            }
            ((BaseResult) obj).getClass();
            return Intrinsics.m18594b(null, null) && Intrinsics.m18594b(null, null) && Intrinsics.m18594b(null, null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/DataSource$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/DataSource$Factory;", "", "Key", "Value", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class Factory<Key, Value> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/paging/DataSource$InvalidatedCallback;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface InvalidatedCallback {
        /* JADX INFO: renamed from: a */
        void mo11329a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/DataSource$KeyType;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class KeyType {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ KeyType[] f30624a = {new KeyType("POSITIONAL", 0), new KeyType("PAGE_KEYED", 1), new KeyType("ITEM_KEYED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        KeyType EF5;

        public static KeyType valueOf(String str) {
            return (KeyType) Enum.valueOf(KeyType.class, str);
        }

        public static KeyType[] values() {
            return (KeyType[]) f30624a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/DataSource$Params;", "", "K", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Params<K> {

        /* JADX INFO: renamed from: a */
        public final Object f30625a;

        public Params(LoadType loadType, Object obj, int i, boolean z2, int i2) {
            this.f30625a = obj;
            if (loadType != LoadType.f30752a && obj == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11328a() {
        throw null;
    }
}
